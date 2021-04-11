package API;

import BLL.ToursBLL;
import DAL.Tour;
import DAL.ToursDAL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Kevin Sandoval
 */
@Path("tours")
public class tours {

    @Context
    HttpServletRequest request;

    public tours() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tour> getMasVendidos() {
        try {
            System.out.println("Mostrando tours");
            return ToursBLL.getInstance().getDestinos();
        } catch (Exception ex) {
            System.out.println("error en tours API");
            DAL.exceptions.ExceptionsManager.SHOW_ERROR(ex.getMessage());
        }
        return ToursBLL.getInstance().getDestinos();
    }

}
