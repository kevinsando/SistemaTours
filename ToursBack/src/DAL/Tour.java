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


    public Tour(Integer id, String name, String description, Double duration, 
            Double price, String destination, String dateGone, String dateReturn, Double qualification) {
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

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getDuration() {
        return duration;
    }

    public Double getPrice() {
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

    public Double getQualification() {
        return qualification;
    }

    @Override
    public String toString() {
        return "Tour{" + "id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration + ", price=" + price + ", destination=" + destination + ", dateGone=" + dateGone + ", dateReturn=" + dateReturn + ", qualification=" + qualification + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateGone(String dateGone) {
        this.dateGone = dateGone;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setQualification(Double qualification) {
        this.qualification = qualification;
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
