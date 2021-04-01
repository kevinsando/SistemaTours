package DAL.IMECS;

/**
 *
 * @author Kevin
 */
public enum TOURS_IMEC {
    LISTAR_TOURS("SELECT id,name,description,duration,price,destination,dateGone,dateReturn,qualification FROM tours;");
    
    
    

    TOURS_IMEC(String command) {
        this.command = command;
    }

    public String obtain() {
        return command;
    }

    private final String command;
}
