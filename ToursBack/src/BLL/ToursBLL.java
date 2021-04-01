package BLL;


import DAL.Tour;
import DAL.ToursDAL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Sandoval
 * 
 */
public class ToursBLL {

    private ToursBLL() {
    }
    
    public static ToursBLL getInstance() {
        if (instance == null) {
            instance = new ToursBLL();
        }
        return instance;
    }

    public List<DAL.Tour> getDestinos(){
        System.out.println("En BLL");
        return ToursDAL.getInstance().allTours();
    }
    
    private static ToursBLL instance = null;

}
