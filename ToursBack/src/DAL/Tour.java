package DAL;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Kevin Sandoval
 */
public class Tour implements Serializable{

    public Tour() {
    }


    public Tour(int id, String name, String description, double duration, double price, String destination, String dateGone, String dateReturn, double qualification) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.price = price;
        this.destination = destination;
        this.dateGone = dateGone;
        this.dateReturn = dateReturn;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateGone() {
        return dateGone;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public double getQualification() {
        return qualification;
    }

    @Override
    public String toString() {
        return "Tour{" + "id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration + ", price=" + price + ", destination=" + destination + ", dateGone=" + dateGone + ", dateReturn=" + dateReturn + ", qualification=" + qualification + '}';
    }
    
    
    
    private Integer id;
    private String name;
    private String description;
    private Double duration;
    private Double price;
    private String destination;
    private String dateGone;
    private String dateReturn;
    private Double qualification;
}
