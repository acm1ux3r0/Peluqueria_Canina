/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package PERSISTENCIA;
/**
 * Clase conexion
 * @author Lucero_Antonio
 */
public class Conexion {
    
    //Atributos
    /**
     * datos necesarios para armar la conexion
     */
    private final String 
            dir = "localhost",
            nombreBD = "peluqueria",
            usuario = "root",
            pass = "",
            driver = "org.mariadb.jdbc.Driver";
    private final int puerto = 3306;
    private String url;
    
    /**
     * Objeto para trabajar con Connection
     */
    private java.sql.Connection conexion = null;
    
    /**
     * Excepcion si fuera necesario
     */
    private Exception excepcion = null;
    
    
    //Constructor
    /**
     * Armar una nueva conexion a la Base de datos
     */
    public Conexion(){
        url = "jdbc:mariadb://"+ dir +":"+ puerto +"/"+ nombreBD +"";
        registrarDriver();
    }

    //Metodos Getters
    /**
     * Obtener el objeto Connection
     * @return java.sql.Connection
     */
    public java.sql.Connection getConexion() {
        return conexion;
    }
    /**
     * Obtener la ultima Exception registrada
     * @return Exception
     */
    public Exception getExcepcion() {
        return excepcion;
    }
    
    //Metodos Publicos
    /**
     * Intenta establecer una conexion a la BD.
     * @return Conexion
     */
    public Conexion conectar(){
        try {
            conexion = java.sql.DriverManager.getConnection( url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                    ,usuario, pass);
        } catch (java.sql.SQLException ex) {
            excepcion = ex;
            conexion = null;
        }
        return this;
    }
    /**
     * Comprueba si la conexion a la BD es valida
     * @return true si esta conectado, false si no se puede hacer query
     */
    public boolean esValida(){
        try {
            return (conexion != null) ? conexion.isValid(1000) : false;
        } catch (java.sql.SQLException ex) {
            excepcion = ex;
            return false;
        }
    }
    
    //Metodos Privados
    private void registrarDriver() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar Driver: "+ ex.getMessage());
            excepcion = ex;
        }
    }
    
}
