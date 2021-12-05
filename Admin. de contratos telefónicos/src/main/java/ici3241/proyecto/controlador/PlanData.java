package ici3241.proyecto.controlador;
import ici3241.proyecto.modelo.Exportador;
import ici3241.proyecto.modelo.Plan;
import java.io.*;
import java.util.*;

public class PlanData implements Exportador {    
    private static ArrayList <Plan> listaPlanes;
    
    
    public PlanData() {
        listaPlanes = new ArrayList();
    }
    
    public Plan crearPlan(String datos) {
        String[] campos = new String[5];
        campos = datos.split(",");
        Plan plan = new Plan(campos[0], Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]));
        return plan;    
    }
    
    public void inicializar() throws IOException {
        ingresarPlanes();
    }
    
    //Lo mismo que con los metodos de ingreso de cliente y equipo
    public void ingresarPlanes() throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("./planes.csv"));
        String linea;
        while ((linea = reader.readLine()) != null) {
            Plan plan = crearPlan(linea);
            listaPlanes.add(plan);
        }
        reader.close();
        System.out.println("Archivo cargado en la aplicación.");
    }

    public void ingresarPlanesManual(String datos) {
        Plan plan = crearPlan(datos);
        listaPlanes.add(plan);
        System.out.println("Plan añadido a la aplicación.");
    }
    //De parametro recibe el nombre del plan y retorna su posición en el arreglo, de no encontrarlo retorna -1
    public int buscarPlan(ArrayList <Plan> listaPlanes, String nombrePlan) {        
        int i;        
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getNombrePlan().equals(nombrePlan)) {
                return i;
            }
        }        
        System.out.println("Elemento inexistente");        
        return -1;
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void modificarPlan(String nombrePlan) throws IOException {        
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            // Plan plan = crearPlan(menu.solicitarDatosPlan());
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
            // listaPlanes.add(plan);
        } else System.out.println("Elemento inexistente");  
    }
    
    public void eliminarPlan(String nombrePlan) {
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
        } else System.out.println("Elemento inexistente");    
    }
    
    public Plan buscarMaxPlanPrecio() {
        int i, max = 0, aux = 0;
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getPrecioPlan() > aux) {
                aux = listaPlanes.get(i).getPrecioPlan();
                max = i;
            }
        }
        return listaPlanes.get(max);
    }
    
    public Plan buscarMinPlanPrecio() {
        int i, min = 0, aux = listaPlanes.get(0).getPrecioPlan();
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getPrecioPlan() < aux) {
                aux = listaPlanes.get(i).getPrecioPlan();
                min = i;
            }
        }
        return listaPlanes.get(min);        
    }
    
    @Override
    public void exportarArchivoCSV() throws FileNotFoundException {
        File file = new File("archivoPlanes.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Plan plan : listaPlanes) {
            writer.printf("%s, %d, %d, %s, %d\n", plan.getNombrePlan(), plan.getPrecioPlan(), plan.getTotalNavegacion(), plan.getTotalMinutos(), plan.getTotalMensajes());
        }
        writer.close();    
    }
    
    @Override
    public void exportarArchivoTXT() throws IOException {
        File file = new File("archivoPlanes.txt");
        PrintWriter writer = new PrintWriter(file);
        
        for (Plan plan : listaPlanes) {
            writer.printf("Nombre:%s | Precio: %d | Navegación (GBs): %d | Minutos: %s | Mensajes: %d\n", plan.getNombrePlan(), plan.getPrecioPlan(), plan.getTotalNavegacion(), plan.getTotalMinutos(), plan.getTotalMensajes());
        }
        writer.close(); 
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirPlan(int i) {
        Plan plan = listaPlanes.get(i);
        System.out.println("Nombre: " + plan.getNombrePlan() + " | " + "Precio: $" + plan.getPrecioPlan() + " | " + "Navegación (GB): " + plan.getTotalNavegacion() + " | " + "Minutos: " + plan.getTotalMinutos() + " | " + "Mensajes: " + plan.getTotalMensajes());        
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirPlanes() {
        Plan plan;
        int i;
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            plan = (Plan) listaPlanes.get(i);
            System.out.println("Nombre: " + plan.getNombrePlan() + " | " + "Precio: $" + plan.getPrecioPlan() + " | " + "Navegación (GB): " + plan.getTotalNavegacion() + " | " + "Minutos: " + plan.getTotalMinutos() + " | " + "Mensajes: " + plan.getTotalMensajes());
        }
    }

    public ArrayList<Plan> getListaPlanes() {
        return listaPlanes;
    }
}
