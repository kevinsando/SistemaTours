package BLL;


import DAL.Tour;
import DAL.ToursDAL;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Sandoval
 * 
 */
public class ToursBLL implements Serializable{

    private ToursBLL() {
    }
    
    public static ToursBLL getInstance() {
        tours = ToursDAL.getInstance().allTours();
        System.out.println("Tours cargados");
        if (instance == null) {
            instance = new ToursBLL();
        }
        return instance;
    }

    public List<Tour> getDestinos(){
        System.out.println("En BLL");
        return tours;
    }
    
    private static ToursBLL instance = null;
    private static List<Tour> tours;
}
