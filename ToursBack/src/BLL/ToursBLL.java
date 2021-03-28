package BLL;

import DAL.LoginDAL;
import java.util.List;

/**
 *
 * @author Kevin Sandoval
 * 
 */
public class ToursBLL {

    private ToursBLL() {
    }
    
    

    public static ToursBLL obtenerInstancia() {
        if (instancia == null) {
            instancia = new ToursBLL();
        }
        return instancia;
    }
    
    public List<DAL.Tour> getDestinos(){
        return DAL.ToursDAL.getDestinos();
    }
    
    private static ToursBLL instancia = null;
}
