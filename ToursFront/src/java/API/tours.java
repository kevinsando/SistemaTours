package API;


import BLL.ToursBLL;
import DAL.Tour;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Path("disponibles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tour> getMasVendidos() {
        try {
            System.out.println("Mostrando tours");
            return ToursBLL.obtenerInstancia().getDestinos();
        } catch (Exception ex) {
            System.out.println("error al tours");
            DAL.exceptions.ExceptionsManager.SHOW_ERROR(ex.getMessage());
        }
        return ToursBLL.obtenerInstancia().getDestinos();
    }
    
}
