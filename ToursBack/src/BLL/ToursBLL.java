package BLL;

import DAL.Tour;
import DAL.ToursDAL;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Sandoval
 *
 */
public class ToursBLL implements Serializable {

    private ToursBLL() {
    }

    public static ToursBLL getInstance() {
        System.out.println("Tours cargados");
        if (instance == null) {
            instance = new ToursBLL();
        }
        return instance;
    }

    public List<Tour> getDestinos() {
        System.out.println("En BLL");
        return dal.allTours();

    }

    private static ToursBLL instance = null;
    ToursDAL dal = new ToursDAL();
}
