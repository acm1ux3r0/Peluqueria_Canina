/**
 * TPO2
 * Lucero_Antonio_tpo2
 */
package LOGICA;
/**
 * MAIN
 * @author Lucero_Antonio
 */
public class Main {
    public static final PERSISTENCIA.Conexion conexion = new PERSISTENCIA.Conexion();
    public static void main(String[] args) {
        if(args[0].equals("pruebas")){
            // Prueba de Logica
            System.out.println("\nPRUEBA LOGICA...");
            LOGICA.Can can1 = new LOGICA.Can(),
                    can2 = new LOGICA.Can("Pichu", "Calle", "Marron", "Esteban", "555"),
                    can3 = new LOGICA.Can(0, "Atak", "Bravo", "Azul", "Esteban", "555", "Orejas cortas", 1, 1){
                @Override
                public String ladrar() {
                    return super.ladrar() + " (ladrando muy fuerte)";
                }
            };
            can1.setNombre_perro("Perro");
            can1.setRaza("Raza");
            can1.setColor("Blanco");
            can1.setAlergico(1);
            can1.setAtencion_especial(0);
            can1.setNombre_duenio("Esteban");
            can1.setCelular_duenio("555");
            can1.setObservaciones("Nada");
            System.out.println("can 1: "+ can1.ladrar());
            System.out.println("can 2: "+ can2.ladrar());
            System.out.println("can 3: "+ can3.ladrar());
            System.out.println("FIN PRUEBA LOGICA...\n");
            
            //Prueba de Conexion
            System.out.println("\nPRUEBA DE CONEXION A LA BD...");
            if(!conexion.esValida())conexion.conectar();
            if(conexion.esValida()) System.out.println("Conectado a la BD");
            else System.out.println("No conectado a la BD...");
            System.out.println("FIN PRUEBA DE CONEXION A LA BD...\n");
            
            //Prueba de Persistencia
            System.out.println("\nPRUEBA DE CONSULTAS CON LA BD...");
            if(conexion.esValida()){
                PERSISTENCIA.CanData cd = new PERSISTENCIA.CanData(conexion);
                
                int nuevo = cd.crear(can1); //inserto can1 en la bd
                if(nuevo > 0){
                    System.out.println("Can registrado en la BD: "+ can1.ladrar());
                    can1.setNum_cliente(nuevo); //asigno el numero de cliente devuelto al insertar
                }else System.out.println("Error al registrar al can: "+ can1.ladrar() + "\n" + (cd.getExcepcion() != null ? cd.getExcepcion().getMessage() : ""));
                
                can2 = cd.leer(can1.getNum_cliente()); //modifico can2 con los datos de can1 en la BD
                if(can2 != null) System.out.println("Leer de la BD: "+ can2.ladrar());
                else System.out.println("Error al leer: \n" + (cd.getExcepcion() != null ? cd.getExcepcion().getMessage() : ""));
                
                can2.setNombre_perro("Fabiolo");
                if(cd.modificar(can2) == 1) System.out.println("Modificar de la BD: "+ can2.ladrar());
                else System.out.println("Error al modificar: "+ (cd.getExcepcion() != null ? cd.getExcepcion().getMessage() : ""));
                
                if(cd.eliminar(can1) == 1) System.out.println("Eliminar de la BD: "+ can1.ladrar());
                else System.out.println("Error al eliminar: "+ (cd.getExcepcion() != null ? cd.getExcepcion().getMessage() : ""));
                
            } else System.out.println("ERROR DE CONEXION NO SE REALIZARON LAS PRUEBAS...");
            System.out.println("FIN PRUEBA DE CONSULTAS CON LA BD...\n");
        }else System.out.println("EJECUTANDO SIN PRUEBAS");
        
        //Preparaciones antes de GUI
        if(!conexion.esValida())conexion.conectar();
        
        //Llamado del GUI
        IGU.Peluqueria.iniciar();
    }
}
