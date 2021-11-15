package ici3241.proyecto;
import java.util.*;
import java.io.*;

/**
 *
 * @author mandr
 */
public class Cliente {
    
    private String nombre;
    private int rut;    
    private String direccion;    
    private String numeroCliente;
    private String plan;
    private ArrayList<Plan> planesCliente;
    private ArrayList <Equipo> equiposCliente;

    //Necesario para pedir datos y mostrar info por pantalla   
    private Menu menu;

    public Cliente(String nombre, int rut, String direccion, String numeroCliente) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numeroCliente = numeroCliente;
    }
    
    public Cliente (String nombre, String rut, String direccion, String numero, String plan) {
        this.nombre = nombre;
        this.rut = Integer.parseInt(rut);
        this.direccion = direccion;
        this.numeroCliente = numero;
        this.plan = plan;    
    }

    public Cliente(String nombre, int rut, String direccion, String numeroCliente, ArrayList<Plan> planesCliente, ArrayList<Equipo> equiposCliente) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numeroCliente = numeroCliente;
        planesCliente = new ArrayList();
        equiposCliente = new ArrayList();       
    }
    
    public Cliente() {
    }
    
    
    public Cliente buscarCliente(HashMap <String, Cliente> mapaClientes, String key) {
        return mapaClientes.get(key); 
    }    
       
    public Cliente buscarCliente(HashMap <Integer, Cliente> mapaClientes, int key) {        
        return mapaClientes.get(key);
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
}
