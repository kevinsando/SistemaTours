/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import DAL.IMECS.TOURS_IMEC;
import DAL.data.BaseDatos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Sandoval
 */
public class ToursDAL {

    
    public ToursDAL() {
        this.bd = BaseDatos.obtenerInstancia();
    }

    public static ToursDAL obtenerInstancia() {
        if (instancia == null) {
            instancia = new ToursDAL();
        }
        return instancia;
    }
    
    
    //Red All
    public static List<Tour> allTours() {
        // id, name, description, duration, price, destination, dateGone, dateReturn, qualification;
        System.out.println("En DAL");

        List<Tour> r = new ArrayList<>();
        try (Connection cnx = bd.obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(TOURS_IMEC.LISTAR_TOURS.obtain())) {
            while (rs.next()) {
                System.out.println("leyendo base");
                Tour t = new Tour(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("duration"),
                        rs.getDouble("price"),
                        rs.getString("destination"),
                        rs.getDate("dateGone"),
                        rs.getDate("dateReturn"),
                        rs.getDouble("ualification")
                );
                r.add(t);
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción en DAL: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        System.out.println("Tours:");
        System.out.println(r.toString());
        return r;
    }
    
    
    private static BaseDatos bd = null;
    private static ToursDAL instancia = null;

}
