package ici3241.proyecto.controlador;
import ici3241.proyecto.modelo.Exportador;
import ici3241.proyecto.modelo.*;

import java.io.*;
import java.util.*;

public class ClienteData implements Exportador {
    private static HashMap <String, Cliente> mapaClientesNombres;           
    private static HashMap <Integer, Cliente> mapaClientesRut; 
    
    public ClienteData() {
        mapaClientesNombres = new HashMap();
        mapaClientesRut = new HashMap();
    }
    
    public Cliente crearCliente(String datos) {
        String[] campos = new String[4];
        campos = datos.split(",");
        Cliente cliente = new Cliente(campos[0], Integer.parseInt(campos[1]), campos[2], campos[3]);
        return cliente;
    }
    
    public EquipoCliente crearEquipoCliente(String datos) {
        String[] campos = new String[8];
        campos = datos.split(","); 
        EquipoCliente eq = new EquipoCliente(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
        return eq;        
    }
    
    public PlanCliente crearPlanCliente(String datos) {
        String[] campos = new String[8];
        campos = datos.split(",");
        PlanCliente pc = new PlanCliente(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]), campos[5], campos[6]);
        return pc;
    }
    
    public void ingresarClientes() throws IOException, FileNotFoundException {          
        BufferedReader reader = new BufferedReader(new FileReader("./clientes.csv"));        
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
    
    public void ingresarEquiposClientes() throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("./equiposcliente.csv"));
        String linea;        
        while ((linea = reader.readLine()) != null) {
            EquipoCliente eq = crearEquipoCliente(linea);
            if (mapaClientesNombres.containsKey(eq.getNombreCliente())) mapaClientesNombres.get(eq.getNombreCliente()).getEquiposCliente().add(eq);
            else System.out.println("Error al ingresar elemento");
        }        
    }
    
    public void ingresarPlanesClientes() throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("./planescliente.csv"));
        String linea;        
        while ((linea = reader.readLine()) != null) {
            PlanCliente pc = crearPlanCliente(linea);
            if (mapaClientesNombres.containsKey(pc.getNombreCliente())) mapaClientesNombres.get(pc.getNombreCliente()).getPlanesCliente().add(pc);
            else System.out.println("Error al ingresar elemento");
        }    
    }
    
    public Cliente buscarCliente(String key) {
        if (mapaClientesNombres.containsKey(key))
            return mapaClientesNombres.get(key);
        else {
            return null;
        }
    }
    
    public Cliente buscarCliente(int key) {
        if (mapaClientesRut.containsKey(key))
            return mapaClientesRut.get(key);
        else {
            return null;
        }
    }
        
    public void modificarCliente(String key) throws IOException {                                                             
        Menu menu = new Menu();
        if (mapaClientesNombres.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente()); 
            mapaClientesRut.replace(mapaClientesNombres.get(key).getRut(), cliente);            
            mapaClientesNombres.replace(key, cliente);            
        } else System.out.println("Elemento inexistente");
    }
    
    public void modificarCliente(int key) throws IOException{        
        Menu menu = new Menu();
        if (mapaClientesRut.containsKey(key)) {
            Cliente cliente = crearCliente(menu.solicitarDatosCliente());
            mapaClientesNombres.replace(mapaClientesRut.get(key).getNombre(), cliente);
            mapaClientesRut.replace(key, cliente);            
        } else System.out.println("Elemento inexistente");
    }
    
    //Estos metodos reciben de parametros una key de un cliente en forma de string (nombre) o int (rut) y los dos mapas, el cliente
    //queda eliminado de los dos
    public void eliminarCliente(String key) {        
        if (mapaClientesNombres.containsKey(key)) {
            mapaClientesRut.remove(mapaClientesNombres.get(key).getRut());
            mapaClientesNombres.remove(key);     
        } else System.out.println("Elemento inexistente");
    }
    
    public void eliminarCliente(int key) {        
        if (mapaClientesRut.containsKey(key)) {
            mapaClientesNombres.remove(mapaClientesRut.get(key).getNombre());
            mapaClientesRut.remove(key);     
        } else System.out.println("Elemento inexistente");
    }
    
    public void eliminarPlanCliente(String key, int nroPlan) {
        if (mapaClientesNombres.containsKey(key)) {
            mapaClientesNombres.get(key).getPlanesCliente().remove(nroPlan-1);
            mapaClientesRut.get(mapaClientesNombres.get(key).getRut()).getPlanesCliente().remove(nroPlan-1);
        } else System.out.println("Elemento inexistente");
    }
    
    public void eliminarPlanCliente(int key, int nroPlan) {
        if (mapaClientesRut.containsKey(key)) {
            mapaClientesRut.get(key).getPlanesCliente().remove(nroPlan-1);
            mapaClientesNombres.get(mapaClientesRut.get(key).getNombre()).getPlanesCliente().remove(nroPlan-1);
        } else System.out.println("Elemento inexistente");
    }
    
    public void eliminarEquipoCliente(String key, int nroEquipo) {
        if (mapaClientesNombres.containsKey(key)) {
            mapaClientesNombres.get(key).getEquiposCliente().remove(nroEquipo-1);
            mapaClientesRut.get(mapaClientesNombres.get(key).getRut()).getPlanesCliente().remove(nroEquipo-1);
        } else System.out.println("Elemento inexistente");
    }
    
    public void eliminarEquipoCliente(int key, int nroEquipo) {
        if (mapaClientesRut.containsKey(key)) {
            mapaClientesRut.get(key).getPlanesCliente().remove(nroEquipo-1);
            mapaClientesNombres.get(mapaClientesRut.get(key).getNombre()).getPlanesCliente().remove(nroEquipo-1);
        } else System.out.println("Elemento inexistente");
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirClientes() {
        Cliente cliente;
        int i, j;
        ArrayList listaClientes = new ArrayList(mapaClientesNombres.values());       
        for (i = 0 ; i < listaClientes.size() ; i++) {
            cliente = (Cliente) listaClientes.get(i);
            System.out.println("Nombre: " + cliente.getNombre() + " | " + "RUT: " + Integer.toString(cliente.getRut()) + " | " + "Direccion: " + cliente.getDireccion() + " | " + "Número Telefónico: " + cliente.getNumeroCliente());
            System.out.println("Planes:");
            imprimirPlanesCliente(cliente);
            System.out.println("Equipos:");
            imprimirEquiposCliente(cliente);
            System.out.println("");
        }
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirEquiposCliente(Cliente c) {        
        int i;
        for (i = 0 ; i < c.getEquiposCliente().size() ; i++) {
            EquipoCliente eq = c.getEquiposCliente().get(i);
            System.out.println("    Modelo: " + eq.getNombreEquipo() + " | Marca: " + eq.getMarcaEquipo() + " | Plan: " +eq.getPlanEquipo());
        }
    }
    
    // Método sin uso, reemplazado por interfaz gráfica
    public void imprimirPlanesCliente(Cliente c) {
        int i;
        for (i = 0 ; i < c.getPlanesCliente().size() ; i++) {
            PlanCliente pc = c.getPlanesCliente().get(i);
            System.out.println("    Plan: " + pc.getNombrePlan() + " | Navegación gastada (GBs): " + pc.getTotalNavegacionGastado() + " | Minutos gastados: " + pc.getTotalMinutosGastado() + " | Mensajes gastados: " + pc.getTotalMensajesGastado()+ " | Fecha Inicio contrato: " + pc.getFechaInicioContrato() + " | Fecha Siguiente Factura: " + pc.getFechaSiguienteFactura());
        }
    }
    
    @Override
    public void exportarArchivoCSV() throws IOException {
        ArrayList <Cliente> listaClientes = new ArrayList(mapaClientesNombres.values());
        File file = new File("archivoClientes.csv");
        PrintWriter writer = new PrintWriter(file);        
        for (Cliente cliente : listaClientes) {
            writer.printf("%s,%d,%s,%s", cliente.getNombre(), cliente.getRut(), cliente.getDireccion(), cliente.getNumeroCliente());
        }
    }
    
    @Override
    public void exportarArchivoTXT() throws IOException {
        ArrayList <Cliente> listaClientes = new ArrayList(mapaClientesNombres.values());
        File file = new File("archivoClientes.txt");
        PrintWriter writer = new PrintWriter(file);        
        for (Cliente cliente : listaClientes) {
            writer.printf("Nombre: %s | RUT: %d | Direccion: %s | Teléfono: %s\n", cliente.getNombre(), cliente.getRut(), cliente.getDireccion(), cliente.getNumeroCliente());
            writer.printf("\n");
            for (PlanCliente pc : cliente.getPlanesCliente()) {
                writer.printf("Plan: "+ pc.getNombrePlan()+" | Navegación gastada (GBs): "+pc.getTotalNavegacionGastado()+" | Minutos gastados: "+pc.getTotalMinutosGastado()+" | Mensajes gastados: "+pc.getTotalMensajesGastado()+" | Fecha Inicio contrato: "+pc.getFechaInicioContrato()+" | Fecha Siguiente Factura: "+pc.getFechaSiguienteFactura()+ "\n");
            }
            writer.printf("\n");
            for (EquipoCliente eq : cliente.getEquiposCliente()) {
                writer.printf("Modelo: "+eq.getNombreEquipo()+" | Marca: "+eq.getMarcaEquipo()+" | Plan: "+eq.getPlanEquipo()+"\n");
            }
            writer.printf("-----------------------------------------------------------------------------------------------------------------------------------\n");
            
        }        
        writer.close();    
    }
    
    // Se cargan los datos iniciales contenidos en clientes.csv, planescliente.csv y equiposcliente.csv
    public void inicializar() throws IOException {
        ingresarClientes();
        ingresarEquiposClientes();
        ingresarPlanesClientes();    
    }

    public HashMap<String, Cliente> getMapaClientesNombres() {
        return mapaClientesNombres;
    }

    public HashMap<Integer, Cliente> getMapaClientesRut() {
        return mapaClientesRut;
    }    
}
