package ici3241.proyecto;

public class Main {
    
    public static void main(String[] args) {
        
        // Datos iniciales a modo de ejemplo.
        Cliente clienteInicial = new Cliente("John Doe", "7198529-6", "P Sherman 42 Wallaby Way", "+6178945621", "Silver");        
        Plan planInicial = new Plan("Silver", 14990, 100, 1000, 700);
        Equipo equipoInicial = new Equipo("A01 Core", "Samsung", "32", 16, 14993, 107760);
        
        // Es posible leer archivos CSV con el método leerCSV de la clase LectorCSV, pero los datos no se almacenan.
        LectorCSV bd = new LectorCSV();
        String direccion = null; // Ubicación del archivo CSV en el computador que está ejecutando la aplicación.  
        
        bd.leerCSV(direccion);        
            
    }   
      
}
