/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import DAL.IMECS.LOGIN_IMEC;
import DAL.data.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin Sandoval
 */
public class LoginDAL {

    private LoginDAL() {
        this.bd = BaseDatos.obtenerInstancia();
    }
    
    public static LoginDAL obtenerInstancia() {
        if (instancia == null) {
            instancia = new LoginDAL();
        }
        return instancia;
    }
    
    public User obtenerUsuario(String email, String password) {
        User u = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(LOGIN_IMEC.RETURN_USER.obtain())) {
                stm.clearParameters();
                stm.setString(1, email);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    u = new User(
                            rs.getString("email"),
                            rs.getString("password"),
                            rs.getString("name"),
                            rs.getString("lastName"),
                            rs.getString("address"),
                            rs.getInt("rol")
                    );
                }
            }
        } catch (NullPointerException | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return u;
    }
    //Sing-in
    public boolean verifyUser(String email, String pass) {
        boolean encontrado = false;
        User u = null;
        String name = null;
        String last = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(LOGIN_IMEC.RETURN_USER.obtain())) {
                stm.clearParameters();
                stm.setString(1, email);
                stm.setString(2, pass);
                ResultSet rs = stm.executeQuery();
                encontrado = rs.next();
                if (encontrado) {
                    name = rs.getString("name");
                    last = rs.getString("lastName");
                }
            }           

        } catch (NullPointerException | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return encontrado;
    }
    
    //Log-in
    public void saveUser(User theUser) throws SQLException {
        try {
            Connection cnx = bd.obtenerConexion();

            try (PreparedStatement stm = cnx.prepareStatement(LOGIN_IMEC.SAVE_USER.obtain())) {
                stm.clearParameters();

                stm.setString(1, theUser.getEmail());
                stm.setString(2, theUser.getPass());
                stm.setString(3, theUser.getName());
                stm.setString(4, theUser.getLastName());
                stm.setString(5, theUser.getAddress());
                stm.setInt(6, theUser.getRol());

                if (stm.executeUpdate() != 1) {
                    throw new SQLException(String.format(
                            "No se puede agregar el registro: '%s'", theUser.toString()));
                }

            }
        } catch (NullPointerException | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }
    
    
    
    
    private BaseDatos bd = null;
    private static LoginDAL instancia = null;
}
