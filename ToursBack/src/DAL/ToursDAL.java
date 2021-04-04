/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BLL.ToursBLL;
import DAL.IMECS.TOURS_IMEC;
import DAL.data.BaseDatos;
import java.io.Serializable;
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
public class ToursDAL implements Serializable{

    
    private ToursDAL() {
    }
    
    public static ToursDAL getInstance() {
        if (instance == null) {
            instance = new ToursDAL();
        }
        return instance;
    }

    
    //Red All
    public List<Tour> allTours() {
        System.out.println("En DAL");
        ToursDAL.bd = BaseDatos.obtenerInstancia();
        List<Tour> r = new ArrayList<>();
        try (Connection cnx = bd.obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(TOURS_IMEC.LISTAR_TOURS.obtain())) {
            while (rs.next()) {
                Tour t = new Tour(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("duration"),
                        rs.getDouble("price"),
                        rs.getString("destination"),
                        rs.getString("dateGone"),
                        rs.getString("dateReturn"),
                        rs.getDouble("qualification")
                );
                r.add(t);
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción en DAL: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        return r;
    }
    private static BaseDatos bd = null;
    private static ToursDAL instance = null;

}
