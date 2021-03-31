package DAL;

import java.sql.Date;

/**
 *
 * @author Kevin Sandoval
 */
public class Tour {

    public Tour() {
    }

    public Tour(Integer id, String name, String description, Double duration, Double price, String destination, Date dateGone, Date dateReturn, Double qualification) {
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

    public Date getDateGone() {
        return dateGone;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public Double getQualification() {
        return qualification;
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

    public void setDateGone(Date dateGone) {
        this.dateGone = dateGone;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setQualification(Double qualification) {
        this.qualification = qualification;
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
    private Date dateGone;
    private Date dateReturn;
    private Double qualification;
}
