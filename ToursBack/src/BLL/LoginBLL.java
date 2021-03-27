package BLL;

import DAL.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Sandoval
 */
public class LoginBLL {

    public LoginBLL() {
        
    }
    
    public User signIn(String email, String pass){
        return DAL.LoginDAL.obtenerInstancia().obtenerUsuario(email, pass);
    }
    
    public void logIn(User u){
        try {
            DAL.LoginDAL.obtenerInstancia().saveUser(u);
        } catch (SQLException ex) {
            Logger.getLogger(LoginBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
