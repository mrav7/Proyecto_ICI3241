package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class ClienteData implements Exportador {
    private HashMap <String, Cliente> mapaClientesNombres;           
    private HashMap <Integer, Cliente> mapaClientesRut;
    
    
    
    public ClienteData() {
        mapaClientesNombres = new HashMap();
        mapaClientesRut = new HashMap();
    }
    
    public Cliente crearCliente(String datos) {
        String[] campos = new String[10];
        campos = datos.split(",");
        ArrayList <Equipo> equiposCliente = new ArrayList();
        ArrayList <Plan> planesCliente = new ArrayList();
        Cliente cliente = new Cliente(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3], planesCliente, equiposCliente);
        return cliente;
    }

    public void ingresarClientes(String direccion) throws IOException, FileNotFoundException {
        File file = new File(direccion);
        BufferedReader reader = new BufferedReader(new FileReader(file));        
        String linea;
        
        while ((linea = reader.readLine()) != null) {
            Cliente cliente = crearCliente(linea);
            mapaClientesNombres.put(cliente.getNombre(), cliente);
            mapaClientesRut.put(cliente.getRut(), cliente);            
        }        
        reader.close();
        System.out.println("Archivo cargado en la aplicación.");
    }
   
    public void ingresarClientesManual(String datos) {
        Cliente cliente = crearCliente(datos);
        mapaClientesNombres.put(cliente.getNombre(), cliente);
        mapaClientesRut.put(cliente.getRut(), cliente);
        System.out.println("Cliente añadido a la aplicación.");
    }
    
        //Los metodos para modificar clientes funcionan, pero el nuevo cliente agregado queda mapeado en la posición según la key del anterior
    //por lo que no se puede acceder para modificar de nuevo o eliminar
    public void modificarCliente(String key) throws IOException {
        Menu menu = new Menu();                                                     
        if (mapaClientesNombres.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente()); 
            mapaClientesRut.replace(mapaClientesNombres.get(key).getRut(), cliente);            
            mapaClientesNombres.replace(key, cliente);            
        } else menu.elementoInexistente();
    }
    
    public void modificarCliente(int key) throws IOException{
        Menu menu = new Menu();
        if (mapaClientesRut.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente());
            mapaClientesNombres.replace(mapaClientesRut.get(key).getNombre(), cliente);
            mapaClientesRut.replace(key, cliente);            
        } else menu.elementoInexistente();
    }
    
        //Estos metodos reciben de parametros una key de un cliente en forma de string (nombre) o int (rut) y los dos mapas, el cliente
    //queda eliminado de los dos
    public void eliminarCliente(String key) {
        Menu menu = new Menu();
        if (mapaClientesNombres.containsKey(key)) {
            mapaClientesRut.remove(mapaClientesNombres.get(key).getRut());
            mapaClientesNombres.remove(key);     
        } else menu.elementoInexistente();
    }
    
    public void eliminarCliente(int key) {
        Menu menu = new Menu();
        if (mapaClientesRut.containsKey(key)) {
            mapaClientesNombres.remove(mapaClientesRut.get(key).getNombre());
            mapaClientesRut.remove(key);     
        } else menu.elementoInexistente();
    }
    
    public void imprimirClientes() {
        Cliente cliente;
        int i;
        ArrayList listaClientes = new ArrayList(mapaClientesNombres.values());        
        
        for (i = 0 ; i < listaClientes.size() ; i++) {
            cliente = (Cliente) listaClientes.get(i);
            System.out.println("Nombre: " + cliente.getNombre() + " | " + "RUT: " + Integer.toString(cliente.getRut()) + " | " + "Direccion: " + cliente.getDireccion() + " | " + "Número Telefónico: " + cliente.getNumeroCliente());            
        }
    }
    
    public void exportarArchivoCSV() throws IOException{
        ArrayList <Cliente> listaClientes = new ArrayList(mapaClientesNombres.values());
        File file = new File("archivoClientes.csv");
        PrintWriter writer = new PrintWriter(file);
        
        for (Cliente cliente : listaClientes) {
            writer.printf("%s, %d, %s, %s\n", cliente.getNombre(), cliente.getRut(), cliente.getDireccion(), cliente.getNumeroCliente());
        }        
        writer.close();    
    }
    
}
