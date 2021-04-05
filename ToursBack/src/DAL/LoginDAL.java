/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import DAL.IMECS.LOGIN_IMEC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Sandoval
 */
public class LoginDAL {

    public LoginDAL() {
        db = new RelDatabase();
    }
    
    
    
    private RelDatabase db;
}
