package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Menu {
    //Aparte del reader y opcion, los demás atributos son para llamar los métodos desde las otras clases
    private BufferedReader reader;
    private int opcion;
    private Cliente cliente;
    private Equipo equipo;
    private Plan plan;
    private Printer printer;
    
    public Menu() {
        reader  = new BufferedReader(new InputStreamReader(System.in));
        cliente = new Cliente();
        equipo = new Equipo();
        plan = new Plan();
        printer = new Printer();
    }
    
    public void menuCarga(HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes ) throws IOException {
        desplegarMenuCarga();
        opcion = leerOpcion(); 
        switch(opcion) {
            case 1:                                                                                 
                cliente.ingresarClientes(mapaClientesNombres, mapaClientesRut, solicitarDireccionCSV());                            
                break;                            
            case 2:
                equipo.ingresarEquipos(listaEquipos, solicitarDireccionCSV());
                break;                            
            case 3: 
                plan.ingresarPlanes(listaPlanes, solicitarDireccionCSV());
                break;                            
            case 4:
                break;
            default:                            
                opcionInvalida();        
        }
    }
    
    public void menuAgregar(HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes ) throws IOException {
        desplegarMenuAgregar();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1: 
                cliente.ingresarClientesManual(mapaClientesNombres, mapaClientesRut, solicitarDatosCliente());                            
                break;
            case 2:                            
                equipo.ingresarEquiposManual(listaEquipos, solicitarDatosEquipo());
                break;
            case 3: 
                plan.ingresarPlanesManual(listaPlanes, solicitarDatosPlan());
                break;
            case 4:
                break;
            default:
               opcionInvalida();                    
        }
    }
    
    public void menuMostrar(HashMap <String, Cliente> mapaClientesNombres, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes) throws IOException {
        desplegarMenuMostrar();
        opcion = leerOpcion();
        Printer printer = new Printer();
        switch(opcion) {
            case 1: 
                printer.imprimirClientes(mapaClientesNombres);
                break;
            case 2:
                printer.imprimirEquipos(listaEquipos);
                break;
            case 3: 
                printer.imprimirPlanes(listaPlanes);                            
                break;
            case 4: 
                break;
            default:
                opcionInvalida();
        }   
    }
    
    public void menuEditar(HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes ) throws IOException {
        desplegarMenuEditar();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1:
                menuEdicionCliente(mapaClientesNombres, mapaClientesRut);
                break;
            case 2:
                equipo.modificarEquipo(listaEquipos, solicitarModeloEquipo());
                break;
            case 3: 
                plan.modificarPlan(listaPlanes, solicitarNombrePlan());
                break;
            case 4: 
                break;
                
            default: 
                opcionInvalida();
        }
    }
    
    public void menuEdicionCliente(HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut) throws IOException {
        consultarTipoKeyCliente();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1: 
                cliente.modificarCliente(mapaClientesNombres, mapaClientesRut, solicitarNombreCliente());
                break;
            case 2: 
                cliente.modificarCliente(mapaClientesNombres, mapaClientesRut, solicitarRutCliente());
                break;
            default: 
                opcionInvalida();
        }
    }
    
    public void menuEliminar(HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes ) throws IOException { 
        desplegarMenuEliminar();
        opcion = leerOpcion();
        switch (opcion) {
            case 1:
                menuEliminarCliente(mapaClientesNombres, mapaClientesRut);
                break;
            case 2:
                equipo.eliminarEquipo(listaEquipos, solicitarModeloEquipo());
                break;
            case 3:
                plan.eliminarPlan(listaPlanes, solicitarNombrePlan());
                break;
            case 4:
                break;
            default:
                opcionInvalida();
        }        
    }
    
    public void menuExportar(HashMap <String, Cliente> mapaClientes, ArrayList <Equipo> listaEquipos, ArrayList <Plan> listaPlanes) throws IOException {
        desplegarMenuExportar();
        opcion = leerOpcion();
        switch(opcion) {
            case 1:
                printer.exportarArchivoClientes(mapaClientes);
                break;
            case 2:
                printer.exportarArchivoEquipos(listaEquipos);
                break;
            case 3:
                printer.exportarArchivoPlanes(listaPlanes);
                break;
            case 4:
                break;
            default:
                opcionInvalida();
        }
    }
    
    public void menuEliminarCliente (HashMap <String, Cliente> mapaClientesNombres, HashMap <Integer, Cliente> mapaClientesRut) throws IOException {
        consultarTipoKeyCliente();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1: 
                cliente.eliminarCliente(mapaClientesNombres, mapaClientesRut, solicitarNombreCliente());
                break;
            case 2: 
                cliente.eliminarCliente(mapaClientesNombres, mapaClientesRut, solicitarRutCliente());
                break;
            default: 
                opcionInvalida();
        }    
    }
    
    public int leerOpcion() throws IOException {
        return Integer.parseInt(reader.readLine());
    }
    
    public void opcionInvalida() throws IOException {
        System.out.println("");
        System.out.println("Opción inválida");        
    }
    
    public void elementoInexistente() {
        System.out.println("");
        System.out.println("El elemento no existe");        
    }
    
    public String solicitarDireccionCSV() throws IOException {
        System.out.println("");
        System.out.println("Ingrese dirección del archivo CSV");
        System.out.println("Ej: C:\\Users\\usuario\\Desktop\\archivo.csv");        
        return reader.readLine();
    }
    
    public String solicitarNombreCliente() throws IOException {
        System.out.println("Ingrese nombre del cliente");       
        return reader.readLine();
    }
    
    public int solicitarRutCliente() throws IOException {
        System.out.println("");
        System.out.println("Ingrese RUT del cliente");        
        return Integer.parseInt(reader.readLine());
    }
    
    public String solicitarModeloEquipo() throws IOException {
        System.out.println("");
        System.out.println("Ingrese modelo del equipo");
        return reader.readLine();        
    }
    
    public String solicitarNombrePlan() throws IOException {
        System.out.println("");
        System.out.println("Ingrese nombre del plan");
        return reader.readLine();
    }
    
    public String solicitarDatosCliente() throws IOException {
        System.out.println("");
        System.out.println("Ingrese los datos del cliente separados por coma");
        System.out.println("Nombre, RUT, dirección, número telefónico");
        return reader.readLine();    
    }
    
    public String solicitarDatosEquipo() throws IOException {
        System.out.println("");
        System.out.println("Ingrese las características del equipo separadas por coma");
        System.out.println("Modelo, Marca, Almacenamiento, Precio Plan, Precio Liberado");
        return reader.readLine();
    }
    
    public String solicitarDatosPlan() throws IOException {
        System.out.println("");
        System.out.println("Ingrese las características del plan separadas por coma");
        System.out.println("Nombre, Precio, Total de navegación, Total de minutos, Total de mensajes");
        return reader.readLine();    
    }
    
    public void consultarTipoKeyCliente() throws IOException {
       System.out.println("");
       System.out.println("Seleccione el criterio para buscar al cliente a modificar/eliminar:");
       System.out.println("1. Nombre");
       System.out.println("2. RUT");               
    }
    
    public void desplegarMenuPrincipal() {
        System.out.println("");
        System.out.println("Bienvenido al administrador de contratos telefónicos");
        System.out.println("1. Cargar archivo CSV");
        System.out.println("2. Agregar elemento");
        System.out.println("3. Mostrar elementos");
        System.out.println("4. Modificar elemento");
        System.out.println("5. Eliminar elemento");
        System.out.println("6. Exportar CSV de elemento");
        System.out.println("7. Salir");
    }
    
    public void desplegarMenuCarga() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a cargar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato");
        System.out.println("4. Volver");        
    }
    
    public void desplegarMenuAgregar() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a agregar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato"); 
        System.out.println("4. Volver");
    }
    
    public void desplegarMenuMostrar() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a mostrar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato");
        System.out.println("4. Volver");        
    }
    
    public void desplegarMenuEditar() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a editar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato");
        System.out.println("4. Volver");       
    }
        
    public void desplegarMenuEliminar() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a eliminar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato");
        System.out.println("4. Volver");        
    }
    
    public void desplegarMenuExportar() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a exportar");
        System.out.println("1. Cliente");
        System.out.println("2. Equipo");
        System.out.println("3. Contrato");
        System.out.println("4. Volver");        
    }
}
