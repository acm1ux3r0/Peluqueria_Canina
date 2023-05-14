/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package PERSISTENCIA;
/**
 * Clase Data de Can
 * @author Lucero_Antonio
 */
public class CanData {
    //constantes
    private final String
            tabla = "canes",
            campos[] = {"num_cliente","nombre_perro","raza","color","alergico","atencion_especial","nombre_duenio","celular_duenio","observaciones"};
    
    //Atributos
    private java.sql.Connection con = null;
    private java.sql.PreparedStatement declaracion = null;
    private java.sql.ResultSet resultados = null;
    private LOGICA.Can can = null;
    private Exception excepcion = null;
    
    //Constructor
    public CanData(PERSISTENCIA.Conexion conexion){
        con = conexion.getConexion();
    }
    
    //Metodos Getters
    public Exception getExcepcion(){
        return excepcion;
    }
    
    //Metodos publicos CRUD
    /**
     * Registrar un nuevo Can en la BD, devuelve el numero de cliente.
     * @param can LOG.Can
     * @return int equivalente al nuevo numero de Cliente.
     */
    public int crear(LOGICA.Can can){
        int respuesta = 0;
        String sql = "INSERT INTO " + tabla + " ("
                + campos[1] + ", "
                + campos[2] + ", "
                + campos[3] + ", "
                + campos[4] + ", "
                + campos[5] + ", "
                + campos[6] + ", "
                + campos[7] + ", "
                + campos[8] + ") VALUES (?,?,?,?,?,?,?,?);";
        this.can = can;
        if(this.can != null){
            try {
                declaracion = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
                declaracion.setString(1, can.getNombre_perro());
                declaracion.setString(2, can.getRaza());
                declaracion.setString(3, can.getColor());
                declaracion.setInt(4, can.getAlergico());
                declaracion.setInt(5, can.getAtencion_especial());
                declaracion.setString(6, can.getNombre_duenio());
                declaracion.setString(7, can.getCelular_duenio());
                declaracion.setString(8, can.getObservaciones());
                declaracion.executeQuery();
                resultados = declaracion.getGeneratedKeys();
                if(resultados.next()){
                    respuesta = resultados.getInt(1);
                }
                declaracion.close();
            } catch (Exception ex) {
                System.out.println("PERS.CanData Error metodo crear: "+ ex.getMessage());
                excepcion = ex;
            }
        } else
            System.out.println("PERS.CanData Error metodo crear: can es null");
        return respuesta;
    }
    
    /**
     * Obtener de la BD un registro buscando por id
     * @param id int
     * @return LOG.Can o null
     */
    public LOGICA.Can leer(int id){
        can = null;
        String sql = "SELECT * FROM " + tabla 
                + " WHERE " + campos[0] + " = ?;";
        try {
            declaracion = con.prepareStatement(sql);
            declaracion.setInt(1, id);
            resultados = declaracion.executeQuery();
            if (resultados.next()) {
                can = new LOGICA.Can(
                        resultados.getInt(campos[0]),
                        resultados.getString(campos[1]),
                        resultados.getString(campos[2]),
                        resultados.getString(campos[3]),
                        resultados.getString(campos[6]),
                        resultados.getString(campos[7]),
                        resultados.getString(campos[8]),
                        resultados.getShort(campos[4]),
                        resultados.getShort(campos[5])
                );
            }
            declaracion.close();
        } catch (Exception ex) {
            excepcion = ex;
        }
        return can;
    }
    
    /**
     * Obtener la primer coincidencia al buscar en la BD por nombre del Can, o null
     * @param nombreCan String
     * @return LOG.Can o null
     */
    public LOGICA.Can leer(String nombreCan){
        can = null;
        String sql = "SELECT * FROM " + tabla 
                + " WHERE " + campos[1] + " LIKE \"%"+ nombreCan +"%\";";
        try {
            declaracion = con.prepareStatement(sql);
            resultados = declaracion.executeQuery();
            if (resultados.next()) {
                can = new LOGICA.Can(
                        resultados.getInt(campos[0]),
                        resultados.getString(campos[1]),
                        resultados.getString(campos[2]),
                        resultados.getString(campos[3]),
                        resultados.getString(campos[6]),
                        resultados.getString(campos[7]),
                        resultados.getString(campos[8]),
                        resultados.getInt(campos[4]),
                        resultados.getInt(campos[5])
                );
            }
            declaracion.close();
        } catch (Exception ex) {
            excepcion = ex;
        }
        return can;
    }
    
    /**
     * Obtener una Lista de todos los Canes
     * @return java.util.List&lt;LOG.Can&gt;
     */
    public java.util.List<LOGICA.Can> obtener(){
        can = null;
        java.util.List<LOGICA.Can> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + tabla +";";
        try {
            declaracion = con.prepareStatement(sql);
            resultados = declaracion.executeQuery();
            while (resultados.next()) {
                can = new LOGICA.Can(
                        resultados.getInt(campos[0]),
                        resultados.getString(campos[1]),
                        resultados.getString(campos[2]),
                        resultados.getString(campos[3]),
                        resultados.getString(campos[6]),
                        resultados.getString(campos[7]),
                        resultados.getString(campos[8]),
                        resultados.getShort(campos[4]),
                        resultados.getShort(campos[5])
                );
                respuesta.add(can);
            }
            declaracion.close();
        } catch (Exception ex) {
            excepcion = ex;
        }
        return respuesta;
    }
    
    /**
     * Obtener una Lista de Canes por nombre del cliente
     * @param nombreCliente String
     * @return java.util.List&lt;LOG.Can&gt;
     */
    public java.util.List<LOGICA.Can> obtenerCanes(String nombreCliente){
        can = null;
        java.util.List<LOGICA.Can> respuesta = new java.util.ArrayList<>();
        String sql = "SELECT * FROM " + tabla 
                + " WHERE " + campos[6] + " LIKE \"%"+ nombreCliente +"%\";";
        try {
            declaracion = con.prepareStatement(sql);
            resultados = declaracion.executeQuery();
            while (resultados.next()) {
                can = new LOGICA.Can(
                        resultados.getInt(campos[0]),
                        resultados.getString(campos[1]),
                        resultados.getString(campos[2]),
                        resultados.getString(campos[3]),
                        resultados.getString(campos[6]),
                        resultados.getString(campos[7]),
                        resultados.getString(campos[8]),
                        resultados.getShort(campos[4]),
                        resultados.getShort(campos[5])
                );
                respuesta.add(can);
            }
            declaracion.close();
        } catch (Exception ex) {
            excepcion = ex;
        }
        return respuesta;
    }
    
    /**
     * Actualizar los datos del registro.
     * @param can int
     * @return int 1 para exito, 0 fracaso.
     */
    public int modificar(LOGICA.Can can){
        int respuesta = 0;
        String sql = "UPDATE " + tabla + " SET "
                + campos[1] + "=?, "
                + campos[2] + "=?, "
                + campos[3] + "=?, "
                + campos[4] + "=?, "
                + campos[5] + "=?, "
                + campos[6] + "=?, "
                + campos[7] + "=?, "
                + campos[8] + "=? "
                + "WHERE " + campos[0] + "=?;";
        this.can = can;
        if (this.can != null && this.can.getNum_cliente() > 0) {
            try {
                declaracion = con.prepareStatement(sql);
                declaracion.setString(1, can.getNombre_perro());
                declaracion.setString(2, can.getRaza());
                declaracion.setString(3, can.getColor());
                declaracion.setInt(4, can.getAlergico());
                declaracion.setInt(5, can.getAtencion_especial());
                declaracion.setString(6, can.getNombre_duenio());
                declaracion.setString(7, can.getCelular_duenio());
                declaracion.setString(8, can.getObservaciones());
                declaracion.setInt(9, can.getNum_cliente());
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            } catch (Exception ex) {
                excepcion = ex;
            }
        }
        return respuesta;
    }
    
    /**
     * Eliminar de la BD un registro
     * @param can LOG.Can
     * @return 1 si elimino, 0 si no.
     */
    public int eliminar(LOGICA.Can can){
        int respuesta = 0;
        String sql = "DELETE FROM " + tabla + ""
                + " WHERE " + campos[0] + " = ?;";
        this.can = can;
        if(this.can != null && this.can.getNum_cliente() > 0){
            try{
                declaracion = con.prepareStatement(sql);
                declaracion.setInt(1, can.getNum_cliente());
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            } catch (Exception ex) {
                excepcion = ex;
            }
        }
        return respuesta;
    }
    
    /**
     * Eliminar de la BD un registro por numero de cliente
     * @param id int
     * @return 1 si elimino, 0 si no.
     */
    public int eliminar(int id){
        int respuesta = 0;
        String sql = "DELETE FROM " + tabla + ""
                + " WHERE " + campos[0] + " = ?;";
        if(id > 0){
            try{
                declaracion = con.prepareStatement(sql);
                declaracion.setInt(1, id);
                declaracion.executeUpdate();
                declaracion.close();
                respuesta = 1;
            } catch (Exception ex) {
                excepcion = ex;
            }
        }
        return respuesta;
    }
}
