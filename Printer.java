package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Printer {
    
    int i;
    
    public void imprimirClientes(HashMap <String, Cliente> mapaClientes) {
        Cliente cliente;
        ArrayList listaClientes = new ArrayList(mapaClientes.values());        
        
        for (i = 0 ; i < listaClientes.size() ; i++) {
            cliente = (Cliente) listaClientes.get(i);
            System.out.println("Nombre: " + cliente.getNombre() + " | " + "RUT: " + Integer.toString(cliente.getRut()) + " | " + "Direccion: " + cliente.getDireccion() + " | " + "Número Telefónico: " + cliente.getNumeroCliente());            
        }
    }
    
    public void imprimirPlanes(ArrayList listaPlanes) {
        Plan plan;
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            plan = (Plan) listaPlanes.get(i);
            System.out.println("Nombre: " + plan.getNombrePlan() + " | " + "Precio: $" + plan.getPrecioPlan() + " | " + "Navegación (GB): " + plan.getTotalNavegacion() + " | " + "Minutos: " + plan.getTotalMinutos() + " | " + "Mensajes: " + plan.getTotalMensajes());
        }
    }
    
    public void imprimirEquipos(ArrayList listaEquipos) {
        Equipo equipo;
        for (i = 0 ; i < listaEquipos.size() ; i++) {
            equipo = (Equipo) listaEquipos.get(i);
            System.out.println("Nombre: " + equipo.getNombreEquipo() + " | " + "Marca: " + equipo.getMarcaEquipo() + " | " + "Almacenamiento (GB): " + equipo.getAlmacenamientoEquipo() + " | " + "Precio Plan: $" + equipo.getPrecioEquipoPlan() + " | " + "Precio Liberado: $" + equipo.getPrecioEquipoLiberado());          
        }    
    }
    
    public void imprimirEquipos(ArrayList listaEquipos, String marca) {        
        Equipo equipo;       
        for (i = 0 ; i < listaEquipos.size() ; i++) {
            equipo = (Equipo) listaEquipos.get(i);
            if (marca.equals(equipo.getMarcaEquipo())) {
                System.out.println("Nombre: " + equipo.getNombreEquipo() + " | " + "Marca: " + equipo.getMarcaEquipo() + " | " + "Almacenamiento (GB): " + equipo.getAlmacenamientoEquipo() + " | " + "Precio Plan: $" + equipo.getPrecioEquipoPlan() + " | " + "Precio Liberado: $" + equipo.getPrecioEquipoLiberado());           
            }        
        }        
    }
    
    public void imprimirEquipos(String almacenamiento, ArrayList listaEquipos) {        
        Equipo equipo;       
        for (i = 0 ; i < listaEquipos.size() ; i++) {
            equipo = (Equipo) listaEquipos.get(i);
            if (almacenamiento.equals(equipo.getAlmacenamientoEquipo())) {
                System.out.println("Nombre: " + equipo.getNombreEquipo() + " | " + "Marca: " + equipo.getMarcaEquipo() + " | " + "Almacenamiento (GB): " + equipo.getAlmacenamientoEquipo() + " | " + "Precio Plan: $" + equipo.getPrecioEquipoPlan() + " | " + "Precio Liberado: $" + equipo.getPrecioEquipoLiberado());           
            }        
        }        
    }
    //Generan archivos .csv con los elementos dentro de las colecciones correspondientes para la persistencia de datos
    public void exportarArchivoClientes(HashMap <String, Cliente> mapaClientes) throws FileNotFoundException {
        ArrayList <Cliente> listaClientes = new ArrayList(mapaClientes.values());
        File file = new File("archivoClientes.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Cliente cliente : listaClientes) {
            writer.printf("%s, %d, %s, %s\n", cliente.getNombre(), cliente.getRut(), cliente.getDireccion(), cliente.getNumeroCliente());
        }        
        writer.close();    
    }
    
    public void exportarArchivoPlanes(ArrayList <Plan> listaPlanes) throws FileNotFoundException {
        File file = new File("archivoPlanes.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Plan plan : listaPlanes) {
            writer.printf("%s, %d, %,d, %s, %d\n", plan.getNombrePlan(), plan.getPrecioPlan(), plan.getTotalNavegacion(), plan.getTotalMinutos(), plan.getTotalMensajes());
        }
        writer.close();    
    }
    
    public void exportarArchivoEquipos(ArrayList <Equipo> listaEquipos) throws FileNotFoundException {
        File file = new File("archivoEquipos.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Equipo equipo : listaEquipos) {
            writer.printf("%s, %s, %s, %s, %s\n", equipo.getNombreEquipo(), equipo.getMarcaEquipo(), equipo.getAlmacenamientoEquipo(), equipo.getPrecioEquipoPlan(), equipo.getPrecioEquipoLiberado());
        }
        writer.close();    
    } 
    
}
