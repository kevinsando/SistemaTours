package DAL.data;

import cr.ac.database.managers.DBManager;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos implements Serializable {


    // <editor-fold defaultstate="collapsed" desc="constructores">
    private BaseDatos(){
        System.out.println("Constructor bd");
        configuracion = new Properties();
        try {
            System.out.println("0");
            configuracion.load(getClass().getResourceAsStream(ARCHIVO_CONFIGURACION));
            try {
                System.out.println("1");
                bd = DBManager.getDBManager(DBManager.DB_MGR.MYSQL_SERVER,
                        configuracion.getProperty("server_url"));
                System.out.println("1.1");
            } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
                try {
                    System.out.println("2");
                    System.err.println("No se pudo cargar el manejador de la base de datos..");
                    System.err.printf("Excepción: '%s'%n", ex.getMessage());
                    throw ex;
                } catch (ClassNotFoundException ex1) {
                    System.out.println("Error 1");
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex1);
                    System.out.println("Error 2");
                } catch (IllegalAccessException ex1) {
                    System.out.println("Error 3");
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex1);
                } catch (InstantiationException ex1) {
                    System.out.println("Error 4");
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        } catch (IOException ex) {
            try {
                System.out.println("4");
                System.err.println("No se pudo leer el archivo de configuración..");
                throw ex;
            } catch (IOException ex1) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        System.out.println("FIN");
    }

    public static BaseDatos obtenerInstancia() {
        System.out.println("En BD");
        if (instancia == null) {
            instancia = new BaseDatos();
        }
        return instancia;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="métodos">
    public Connection obtenerConexion()
            throws SQLException {
        return bd.getConnection(
                configuracion.getProperty("database"),
                configuracion.getProperty("user"),
                configuracion.getProperty("password")
        );
    }

    public void cerrarConexion() {
        bd.closeConnection();
    }

    public String obtenerConfiguracion() {
        return bd.toString();
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SINGLETON">
    private static BaseDatos instancia = null;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="atributos BD">
    private static final String ARCHIVO_CONFIGURACION = "bd.properties";
    private final Properties configuracion;
    private DBManager bd;
    // </editor-fold>
}
