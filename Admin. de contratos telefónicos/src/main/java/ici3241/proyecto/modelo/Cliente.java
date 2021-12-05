package ici3241.proyecto.modelo;
import java.util.*;

public class Cliente {
    
    private String nombre;
    private int rut;    
    private String direccion;    
    private String numeroCliente;
    private String plan;
    private ArrayList <PlanCliente> planesCliente;
    private ArrayList <EquipoCliente> equiposCliente;

    public Cliente (String nombre, String rut, String direccion, String numero, String plan) {
        this.nombre = nombre;
        this.rut = Integer.parseInt(rut);
        this.direccion = direccion;
        this.numeroCliente = numero;
        this.plan = plan;    
    }

    public Cliente(String nombre, int rut, String direccion, String numeroCliente) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numeroCliente = numeroCliente;
        this.planesCliente = new ArrayList();
        this.equiposCliente = new ArrayList();       
    }
    
    public Cliente() {
    }
    
    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ArrayList<PlanCliente> getPlanesCliente() {
        return planesCliente;
    }

    public ArrayList<EquipoCliente> getEquiposCliente() {
        return equiposCliente;
    }
}
