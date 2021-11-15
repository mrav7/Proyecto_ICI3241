package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class PlanData implements Exportador {
    
    private ArrayList <Plan> listaPlanes;
    
    public PlanData() {
        listaPlanes = new ArrayList();
    }
    
    public Plan crearPlan(String datos) {
        String[] campos = new String[10];
        campos = datos.split(",");
        Plan plan = new Plan(campos[0], Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]));
        return plan;    
    }
    //Lo mismo que con los metodos de ingreso de cliente y equipo
    public void ingresarPlanes(String direccion) throws IOException, FileNotFoundException {
        File file = new File(direccion);
        BufferedReader reader = new BufferedReader(new FileReader(file));
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
        Menu menu = new Menu();
        int i;        
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getNombrePlan().equals(nombrePlan)) {
                return i;
            }
        }
        menu.elementoInexistente();
        return -1;
    }
    
    public void modificarPlan(String nombrePlan) throws IOException {
        Menu menu = new Menu();
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            Plan plan = crearPlan(menu.solicitarDatosPlan());
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
            listaPlanes.add(plan);
        } else menu.elementoInexistente();    
    }
    
    public void eliminarPlan(String nombrePlan) {
        Menu menu = new Menu();
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
        } else menu.elementoInexistente();    
    }
    
    public void buscarMaxPlanPrecio() {
        int i, max = 0, aux = 0;
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getPrecioPlan() > aux) {
                aux = listaPlanes.get(i).getPrecioPlan();
                max = i;
            }
        }
        imprimirPlan(max);
    }
    
    public void buscarMinPlanPrecio() {
        int i, min = 0, aux = listaPlanes.get(0).getPrecioPlan();
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).getPrecioPlan() < min) {
                aux = listaPlanes.get(i).getPrecioPlan();
                min = i;
            }
        }
        imprimirPlan(min);        
    }
    
    public void exportarArchivoCSV() throws FileNotFoundException {
        File file = new File("archivoPlanes.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Plan plan : listaPlanes) {
            writer.printf("%s, %d, %,d, %s, %d\n", plan.getNombrePlan(), plan.getPrecioPlan(), plan.getTotalNavegacion(), plan.getTotalMinutos(), plan.getTotalMensajes());
        }
        writer.close();    
    }
    
    public void imprimirPlan(int i) {
        Plan plan = listaPlanes.get(i);
        System.out.println("Nombre: " + plan.getNombrePlan() + " | " + "Precio: $" + plan.getPrecioPlan() + " | " + "Navegación (GB): " + plan.getTotalNavegacion() + " | " + "Minutos: " + plan.getTotalMinutos() + " | " + "Mensajes: " + plan.getTotalMensajes());        
    }
    
    public void imprimirPlanes() {
        Plan plan;
        int i;
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            plan = (Plan) listaPlanes.get(i);
            System.out.println("Nombre: " + plan.getNombrePlan() + " | " + "Precio: $" + plan.getPrecioPlan() + " | " + "Navegación (GB): " + plan.getTotalNavegacion() + " | " + "Minutos: " + plan.getTotalMinutos() + " | " + "Mensajes: " + plan.getTotalMensajes());
        }
    }
    
}
