package DAL.IMECS;

/**
 *
 * @author Kevin
 */
public enum LOGIN_IMEC {
    RETURN_USER("SELECT id,usuario,password,nombre,apellidos,direccion,rol,telefono FROM usuario WHERE usuario=? and password=?;"),
    
    SAVE_USER("INSERT INTO `toursBD`.`users`(`email`,`password`,`name`,`lastName`,`address`,`rol`)"
            + " VALUES (?,?,?,?,?,?);");
    
    

    LOGIN_IMEC(String command) {
        this.command = command;
    }

    public String obtain() {
        return command;
    }

    private final String command;
}
