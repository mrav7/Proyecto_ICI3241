package ici3241.proyecto;
import java.util.*;
import java.io.*;

public class Cliente {
    
    private String nombre;
    private int rut;    
    private String direccion;    
    private String numeroCliente;    
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
    
    //Creamos esto para facilitar la lectura de datos, para la entrega final tendremos un metodo mejor 
    public Cliente crearCliente(String datos) {
        String[] campos = new String[10];
        campos = datos.split(",");
        ArrayList <Equipo> equiposCliente = new ArrayList();
        ArrayList <Plan> planesCliente = new ArrayList();
        Cliente cliente = new Cliente(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3], planesCliente, equiposCliente);
        return cliente;
    }
    //idem
    public void ingresarClientes(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, String direccion) throws IOException, FileNotFoundException {
        File file = new File(direccion);
        BufferedReader reader = new BufferedReader(new FileReader(file));        
        String linea;
        
        while ((linea = reader.readLine()) != null) {
            Cliente cliente = crearCliente(linea);
            mapaClientesNombre.put(cliente.getNombre(), cliente);
            mapaClientesRut.put(cliente.getRut(), cliente);            
        }        
        reader.close();
        System.out.println("Archivo cargado en la aplicación.");
    }
    //idem
    public void ingresarClientesManual(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, String datos) {
        Cliente cliente = crearCliente(datos);
        mapaClientesNombre.put(cliente.getNombre(), cliente);
        mapaClientesRut.put(cliente.getRut(), cliente);
        System.out.println("Cliente añadido a la aplicación.");
    }    
    
    public Cliente buscarCliente(HashMap <String, Cliente> mapaClientes, String key) {
        return mapaClientes.get(key); 
    }    
       
    public Cliente buscarCliente(HashMap <Integer, Cliente> mapaClientes, int key) {        
        return mapaClientes.get(key);
    }
    
    //Los metodos para modificar clientes funcionan, pero el nuevo cliente agregado queda mapeado en la posición según la key del anterior
    //por lo que no se puede acceder para modificar de nuevo o eliminar
    public void modificarCliente(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, String key) throws IOException {
        Menu menu = new Menu();                                                     
        if (mapaClientesNombre.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente()); 
            mapaClientesRut.replace(mapaClientesNombre.get(key).rut, cliente);            
            mapaClientesNombre.replace(key, cliente);            
        } else menu.elementoInexistente();
    }
    
    public void modificarCliente(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, int key) throws IOException{
        Menu menu = new Menu();
        if (mapaClientesRut.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente());
            mapaClientesNombre.replace(mapaClientesRut.get(key).nombre, cliente);
            mapaClientesRut.replace(key, cliente);            
        } else menu.elementoInexistente();
    }
    
    //Estos metodos reciben de parametros una key de un cliente en forma de string (nombre) o int (rut) y los dos mapas, el cliente
    //queda eliminado de los dos
    public void eliminarCliente(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, String key) {
        Menu menu = new Menu();
        if (mapaClientesNombre.containsKey(key)) {
            mapaClientesRut.remove(mapaClientesNombre.get(key).rut);
            mapaClientesNombre.remove(key);     
        } else menu.elementoInexistente();
    }
    
    public void eliminarCliente(HashMap <String, Cliente> mapaClientesNombre, HashMap <Integer, Cliente> mapaClientesRut, int key) {
        Menu menu = new Menu();
        if (mapaClientesRut.containsKey(key)) {
            mapaClientesNombre.remove(mapaClientesRut.get(key).nombre);
            mapaClientesRut.remove(key);     
        } else menu.elementoInexistente();
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
