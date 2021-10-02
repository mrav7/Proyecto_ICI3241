package ici3241.proyecto;

import java.io.*;
import java.util.*;

public class Plan {
    
    private String nombrePlan;
    private int precioPlan;
    private int totalNavegacion;
    private String totalMinutos;
    private int totalMensajes;
    
    //Para pedir datos al usuario y mostrar info por pantalla
    private Menu menu;

    public Plan(String nombrePlan, int precioPlan, int totalNavegacion, String totalMinutos, int totalMensajes) {
        this.nombrePlan = nombrePlan;
        this.precioPlan = precioPlan;
        this.totalNavegacion = totalNavegacion;
        this.totalMinutos = totalMinutos;
        this.totalMensajes = totalMensajes;
    }
    
    public Plan() {
    }
    
    public Plan crearPlan(String datos) {
        String[] campos = new String[10];
        campos = datos.split(",");
        Plan plan = new Plan(campos[0], Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]));
        return plan;    
    }
    //Lo mismo que con los metodos de ingreso de cliente y equipo
    public void ingresarPlanes(ArrayList <Plan> listaPlanes, String direccion) throws IOException, FileNotFoundException {
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

    public void ingresarPlanesManual(ArrayList <Plan> listaPlanes, String datos) {
        Plan plan = crearPlan(datos);
        listaPlanes.add(plan);
        System.out.println("Plan añadido a la aplicación.");
    }
    //De parametro recibe el nombre del plan y retorna su posición en el arreglo, de no encontrarlo retorna -1
    public int buscarPlan(ArrayList <Plan> listaPlanes, String nombrePlan) {
        Menu menu = new Menu();
        int i;        
        for (i = 0 ; i < listaPlanes.size() ; i++) {
            if (listaPlanes.get(i).nombrePlan.equals(nombrePlan)) {
                return i;
            }
        }
        menu.elementoInexistente();
        return -1;
    }
    
    public void modificarPlan(ArrayList <Plan> listaPlanes, String nombrePlan) throws IOException {
        Menu menu = new Menu();
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            Plan plan = crearPlan(menu.solicitarDatosPlan());
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
            listaPlanes.add(plan);
        } else menu.elementoInexistente();    
    }
    
    public void eliminarPlan(ArrayList <Plan> listaPlanes, String nombrePlan) {
        Menu menu = new Menu();
        if (buscarPlan(listaPlanes, nombrePlan) != -1) {
            listaPlanes.remove(buscarPlan(listaPlanes, nombrePlan));
        } else menu.elementoInexistente();
    
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public int getPrecioPlan() {
        return precioPlan;
    }

    public void setPrecioPlan(int precioPlan) {
        this.precioPlan = precioPlan;
    }

    public int getTotalNavegacion() {
        return totalNavegacion;
    }

    public void setTotalNavegacion(int totalNavegacion) {
        this.totalNavegacion = totalNavegacion;
    }

    public String getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(String totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public int getTotalMensajes() {
        return totalMensajes;
    }

    public void setTotalMensajes(int totalMensajes) {
        this.totalMensajes = totalMensajes;
    }
    
    
}
