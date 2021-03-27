package DAL;

/**
 *
 * @author Kevin Sandoval
 */
public class User {

    public User() {
    }

    public User(String email, String pass, String name, String lastName, String address,Integer rol) {
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getRol() {
        return rol;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
    

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", pass=" + pass + 
                ", name=" + name + ", lastName=" + lastName + 
                ", address=" + address + '}';
    }
    
    private String email;
    private String pass;
    private String name;
    private String lastName;
    private String address;
    private Integer rol;
}
