package DAL.IMECS;

/**
 *
 * @author Kevin
 */
public enum TOURS_IMEC {
    RETURN_USER("SELECT id,usuario,password,nombre,apellidos,direccion,rol,telefono FROM usuario WHERE usuario=? and password=?;");
    
    
    

    TOURS_IMEC(String command) {
        this.command = command;
    }

    public String obtain() {
        return command;
    }

    private final String command;
}
