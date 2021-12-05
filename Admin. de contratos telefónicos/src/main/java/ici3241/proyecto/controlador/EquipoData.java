package ici3241.proyecto.controlador;
import ici3241.proyecto.modelo.Exportador;
import ici3241.proyecto.modelo.Equipo;
import java.io.*;
import java.util.*;

public class EquipoData implements Exportador {    
    private static ArrayList <Equipo> listaEquipos;
    
    public EquipoData() {
        listaEquipos = new ArrayList();
    }
        
    public Equipo crearEquipo(String datos) {
        String[] campos = new String[5];
        campos = datos.split(",");
        Equipo equipo = new Equipo(campos[0], campos[1], campos[2], campos[3], campos[4]);
        return equipo;    
    }
    
    public void inicializar() throws IOException {
        ingresarEquipos();
    }
    
    public void ingresarEquipos() throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("./equipos.csv"));        
        String linea;      

        while ((linea = reader.readLine()) != null) {            
            Equipo equipo = crearEquipo(linea);
            listaEquipos.add(equipo);
        }
        reader.close();
        System.out.println("Archivo cargado en la aplicación.");
    }    

    //idem
    public void ingresarEquiposManual(String datos) {
        Equipo equipo = crearEquipo(datos);
        listaEquipos.add(equipo);
        System.out.println("Equipo añadido a la aplicación.");
    }
    
    //Retorna la posicion del equipo en el arraylist, de no encontrarlo retorna un -1 
    public int buscarEquipo(String modeloEquipo) {
        int i;
        for (i = 0 ; i < listaEquipos.size() ; i++) {
            if (listaEquipos.get(i).getNombreEquipo().equals(modeloEquipo)) {
                return i;
            }
        }
        // menu.elementoInexistente();
        return -1;
    }      
    
    //Revisa si el equipo está dentro del arreglo, de ser así crea uno nuevo con los datos que ingresa el usuario, elimina el que se pide del
    //arraylist y agrega el nuevo 
    public void modificarEquipo(String modeloEquipo) throws IOException {
        Menu menu = new Menu();
        if (buscarEquipo(modeloEquipo) != -1) {
            Equipo equipo = crearEquipo(menu.solicitarDatosEquipo());
            listaEquipos.remove(buscarEquipo(modeloEquipo));
            listaEquipos.add(equipo);
        } else menu.elementoInexistente();
    }
    
    public void eliminarEquipo(String modeloEquipo) {
        Menu menu = new Menu();
        if (buscarEquipo(modeloEquipo) != -1) {
            listaEquipos.remove(buscarEquipo(modeloEquipo));
        } else menu.elementoInexistente();    
    }
    
    // Esta función recibe como parametro la lista de equipos que han sido cargados en la aplicación y un arreglo de enteros que contiene
    // los extremos del rango de busqueda, en este caso se busca según el precio por plan del celular, se itera la lista y se agregan en
    // una nueva los celulares que cumplan con la condición, luego se muestra por pantalla    
    // Por ahora solo busca en un nivel de anidación y solo según precios por plan
    public ArrayList <Equipo> buscarEquipoRangoPrecioPlan(int[] rango) {
        ArrayList <Equipo> listaEquiposRango = new ArrayList();        
        int i;
        for (i = 0; i < listaEquipos.size() ; i++) {
            if((Integer.parseInt(listaEquipos.get(i).getPrecioEquipoPlan()) >= rango[0]) && (Integer.parseInt(listaEquipos.get(i).getPrecioEquipoPlan()) <= rango[1])) {
                listaEquiposRango.add(listaEquipos.get(i));
            }       
        }
        return listaEquiposRango;
    }
    
    public ArrayList <Equipo> buscarEquipoRangoPrecioLiberado(int[] rango) {
        ArrayList <Equipo> listaEquiposRango = new ArrayList();        
        int i;
        for (i = 0; i < listaEquipos.size() ; i++) {
            if((Integer.parseInt(listaEquipos.get(i).getPrecioEquipoLiberado()) >= rango[0]) && (Integer.parseInt(listaEquipos.get(i).getPrecioEquipoLiberado()) <= rango[1])) {
                listaEquiposRango.add(listaEquipos.get(i));
            }       
        }
        return listaEquiposRango;
    }
    
    public ArrayList <Equipo> buscarEquipoRangoAlmacenamiento(int[] rango) {
        ArrayList <Equipo> listaEquiposRango = new ArrayList();        
        int i;
        for (i = 0; i < listaEquipos.size() ; i++) {
            if((Integer.parseInt(listaEquipos.get(i).getAlmacenamientoEquipo()) >= rango[0]) && (Integer.parseInt(listaEquipos.get(i).getAlmacenamientoEquipo()) <= rango[1])) {
                listaEquiposRango.add(listaEquipos.get(i));
            }       
        }
        return listaEquiposRango;
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirEquipos() {
        Equipo equipo;
        int i;
        
        if (listaEquipos.isEmpty()) {
            System.out.println("No hay equipos");
        } else {
            for (i = 0 ; i < listaEquipos.size() ; i++) {
                equipo = (Equipo) listaEquipos.get(i);
                System.out.println("Nombre: " + equipo.getNombreEquipo() + " | " + "Marca: " + equipo.getMarcaEquipo() + " | " + "Almacenamiento (GB): " + equipo.getAlmacenamientoEquipo() + " | " + "Precio Plan: $" + equipo.getPrecioEquipoPlan() + " | " + "Precio Liberado: $" + equipo.getPrecioEquipoLiberado());          
            } 
        }
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirEquipos(ArrayList <Equipo> lista) {
        Equipo equipo;
        int i;
        
        if (lista.isEmpty()) {
            System.out.println("No hay equipos");
        } else {
            for (i = 0 ; i < lista.size() ; i++) {
                equipo = (Equipo) lista.get(i);
                System.out.println("Nombre: " + equipo.getNombreEquipo() + " | " + "Marca: " + equipo.getMarcaEquipo() + " | " + "Almacenamiento (GB): " + equipo.getAlmacenamientoEquipo() + " | " + "Precio Plan: $" + equipo.getPrecioEquipoPlan() + " | " + "Precio Liberado: $" + equipo.getPrecioEquipoLiberado());          
            } 
        }
    }
    
    @Override
    public void exportarArchivoCSV() throws FileNotFoundException {
        File file = new File("archivoEquipos.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Equipo equipo : listaEquipos) {
            writer.printf("%s, %s, %s, %s, %s\n", equipo.getNombreEquipo(), equipo.getMarcaEquipo(), equipo.getAlmacenamientoEquipo(), equipo.getPrecioEquipoPlan(), equipo.getPrecioEquipoLiberado());
        }
        writer.close();    
    }
    
    @Override
    public void exportarArchivoTXT() throws IOException {
        File file = new File("archivoEquipos.txt");
        PrintWriter writer = new PrintWriter(file);
        
        for (Equipo equipo : listaEquipos) {
            writer.printf("Modelo: %s | Marca: %s | Almacenamiento (GBs): %s | Precio Plan: %s | Precio Liberado: %s\n", equipo.getNombreEquipo(), equipo.getMarcaEquipo(), equipo.getAlmacenamientoEquipo(), equipo.getPrecioEquipoPlan(), equipo.getPrecioEquipoLiberado());
        }
        writer.close();
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }
    
    
}
