/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BLL.ToursBLL;
import DAL.IMECS.TOURS_IMEC;
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
public class ToursDAL {

    
    public ToursDAL() {
        db = new RelDatabase();
    }
    
    public List<Tour> allTours() throws Exception {
        List<Tour> result = new ArrayList<>();
        try {
            String sql = " select * from tours;";
            ResultSet rs = db.executeQuery(sql);
            while (rs.next()) {
                result.add(tour(rs));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
    
    public Tour tour (ResultSet rs) throws SQLException, Exception {
        Tour t = new Tour();
        t.setId(rs.getInt("id"));
        t.setName(rs.getString("name"));
        t.setDescription(rs.getString("description"));
        t.setDuration(rs.getDouble("duration"));
        t.setPrice(rs.getDouble("price"));
        t.setDestination(rs.getString("destination"));
        t.setDateGone(rs.getString("dateGone"));
        t.setDateReturn(rs.getString("dateReturn"));
        t.setQualification(rs.getDouble("qualification"));
        return t;
    }
    
    
    private RelDatabase db;
}
