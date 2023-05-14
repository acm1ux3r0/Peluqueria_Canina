/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package LOGICA;
/**
 * Clase Entidad Can
 * @author Lucero_Antonio
 */
public class Can {
    //Atributos
    private int 
            num_cliente,
            alergico,
            atencion_especial;
    private String 
            nombre_perro,
            raza,
            color,
            nombre_duenio,
            celular_duenio,
            observaciones;
    
    //Constructores
    /**
     * Nueva Entidad Canina sin datos
     */
    public Can() {
        num_cliente = 0;
        nombre_perro = "";
        raza = "";
        color = "";
        nombre_duenio = "";
        celular_duenio = "";
        observaciones = "";
        alergico = 0;
        atencion_especial = 0;
    }
    
    /**
     * Nueva Entidad Canina con datos necesarios
     * @param nombre_perro String
     * @param raza String
     * @param color String
     * @param nombre_duenio String
     * @param celular_duenio String
     */
    public Can(String nombre_perro, String raza, String color, String nombre_duenio, String celular_duenio) {
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        //datos que pueden ser null
        observaciones = "";
        alergico = 0;
        atencion_especial = 0;
    }
    
    /**
     * Nueva Entidad Canina con todos los datos incluyendo el id generado por la bd
     * @param num_cliente int
     * @param nombre_perro String
     * @param raza String
     * @param color String
     * @param nombre_duenio String
     * @param celular_duenio String
     * @param observaciones String
     * @param alergico int
     * @param atencion_especial int 
     */
    public Can(int num_cliente, String nombre_perro, String raza, String color, String nombre_duenio, String celular_duenio, String observaciones, int alergico, int atencion_especial) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
    }
    
    //Metodos Getters
    
    /**
     * Obtener el Numero de Cliente generado por la BD
     * 0 para Cliente sin registrar en la BD
     * @return int
     */
    public int getNum_cliente() {
        return num_cliente;
    }
    
    /**
     * Obtener el nombre del Can
     * @return String
     */
    public String getNombre_perro() {
        return nombre_perro;
    }
    
    /**
     * Obtener la raza del Can
     * @return String
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Obtener el color del Can
     * @return String
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtener el nombre del Dueño
     * @return String
     */
    public String getNombre_duenio() {
        return nombre_duenio;
    }

    /**
     * Obtener el celular del Dueño
     * @return String
     */
    public String getCelular_duenio() {
        return celular_duenio;
    }

    /**
     * Obtener observaciones
     * @return String
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Es alergico?
     * @return int 1 para verdadero, 0 para falso.
     */
    public int getAlergico() {
        return alergico;
    }

    /**
     * Necesita atención especial
     * @return int 1 para verdadero, 0 para falso.
     */
    public int getAtencion_especial() {
        return atencion_especial;
    }
    
    //Metodos Setters
    /**
     * Establecer el numero de cliente generado por la BD
     * @param num_cliente int
     */
    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    /**
     * Establecer el nombre del Can
     * @param nombre_perro String
     */
    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    /**
     * Establecer la raza del Can
     * @param raza String
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Establecer el color del Can
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Establecer el nombre del dueño
     * @param nombre_duenio String
     */
    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    /**
     * Establecer el celular del dueño
     * @param celular_duenio String
     */
    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    /**
     * Establecer las observaciones
     * @param observaciones String
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Establecer si es alergico, 1 para verdadero, cualquier otro valor para falso.
     * @param alergico int 1 para verdadero, otro para falso
     */
    public void setAlergico(int alergico) {
        if(alergico == 1)this.alergico = alergico;
        else this.alergico = 0;
    }

    /**
     * Establecer si necesita atención especial, 1 para verdadero, cualquier otro para falso.
     * @param atencion_especial int 1 para verdadero, otro para falso
     */
    public void setAtencion_especial(int atencion_especial) {
        if(atencion_especial == 1)this.atencion_especial = atencion_especial;
        else this.atencion_especial = 0;
    }

    public String ladrar() {
        return nombre_perro;
    }


}
