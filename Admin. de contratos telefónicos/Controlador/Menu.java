package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Menu {
    //Aparte del reader y opcion, los demás atributos son para llamar los métodos desde las otras clases
    private BufferedReader reader;
    private int opcion;
    
    private ClienteData dataCliente;
    private EquipoData dataEquipo;
    private PlanData dataPlan;
    
    private GUIAgregarElemento ae;
    
    public Menu() {
        reader  = new BufferedReader(new InputStreamReader(System.in));
        ae = new GUIAgregarElemento();
    }
    
    public void menuCarga(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        desplegarMenuCarga();
        opcion = leerOpcion(); 
        switch(opcion) {
            case 1:                                                                                 
                dataCliente.ingresarClientes(solicitarDireccionCSV());
                break;                            
            case 2:
                dataEquipo.ingresarEquipos(solicitarDireccionCSV());
                break;                            
            case 3: 
                dataPlan.ingresarPlanes(solicitarDireccionCSV());
                break;                            
            case 4:
                break;
            default:                            
                opcionInvalida();        
        }
    }
    
    public void menuAgregar(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        consultarTipoInterfaz();
        opcion = leerOpcion();
        switch(opcion) {
            case 1:
                desplegarMenuAgregar();
                opcion = leerOpcion();        
                switch(opcion) {
                    case 1: 
                        dataCliente.ingresarClientesManual(solicitarDatosCliente());                            
                        break;
                    case 2:                            
                        dataEquipo.ingresarEquiposManual(solicitarDatosEquipo());
                        break;
                    case 3: 
                        dataPlan.ingresarPlanesManual(solicitarDatosPlan());
                        break;
                    case 4:
                        break;
                    default:
                       opcionInvalida();                    
                }
            case 2:
                ae.setVisible(true);
                break;
            case 3: 
                break;
            default:
                opcionInvalida();
        }
    }
    
    public void menuMostrar(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        desplegarMenuMostrar();
        opcion = leerOpcion();
        switch(opcion) {
            case 1: 
                dataCliente.imprimirClientes();
                break;
            case 2:
                dataEquipo.imprimirEquipos();
                break;
            case 3: 
                dataPlan.imprimirPlanes();                            
                break;
            case 4: 
                break;
            default:
                opcionInvalida();
        }   
    }
    
    public void menuBusqueda(EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        desplegarMenuBusqueda();
        opcion = leerOpcion();
        switch (opcion) {
            case 1:
                dataEquipo.buscarEquipoRango(consultarRangoEquipo());
                break;
            case 2:
                consultarTipoBusquedaEquipo();
                opcion = leerOpcion();
                switch (opcion) {
                    case 1:
                        dataPlan.buscarMinPlanPrecio();
                        break;
                    case 2:
                        dataPlan.buscarMaxPlanPrecio();
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            default:
                opcionInvalida();
        }    
    }
    
    public void menuEditar(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        desplegarMenuEditar();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1:
                menuEdicionCliente(dataCliente);
                break;
            case 2:
                dataEquipo.modificarEquipo(solicitarModeloEquipo());
                break;
            case 3: 
                dataPlan.modificarPlan(solicitarNombrePlan());
                break;
            case 4: 
                break;                
            default: 
                opcionInvalida();
        }
    }
    
    public void menuEdicionCliente(ClienteData dataCliente) throws IOException {
        consultarTipoKeyCliente();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1:
                dataCliente.modificarCliente(solicitarNombreCliente());
                break;
            case 2: 
                dataCliente.modificarCliente(solicitarRutCliente());
                break;
            default: 
                opcionInvalida();
        }
    }
    
    public void menuEliminar(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException { 
        desplegarMenuEliminar();
        opcion = leerOpcion();
        switch (opcion) {
            case 1:
                menuEliminarCliente(dataCliente);
                break;
            case 2:
                dataEquipo.eliminarEquipo(solicitarModeloEquipo());
                break;
            case 3:
                dataPlan.eliminarPlan(solicitarNombrePlan());
                break;
            case 4:
                break;
            default:
                opcionInvalida();
        }        
    }
    
    public void menuExportar(ClienteData dataCliente, EquipoData dataEquipo, PlanData dataPlan) throws IOException {
        desplegarMenuExportar();
        opcion = leerOpcion();
        switch(opcion) {
            case 1:
                dataCliente.exportarArchivoCSV();
                break;
            case 2:
                dataEquipo.exportarArchivoCSV();
                break;
            case 3:
                dataPlan.exportarArchivoCSV();
                break;
            case 4:
                break;
            default:
                opcionInvalida();
        }
    }
    
    public void menuEliminarCliente (ClienteData dataCliente) throws IOException {
        consultarTipoKeyCliente();
        opcion = leerOpcion();        
        switch(opcion) {
            case 1: 
                dataCliente.eliminarCliente(solicitarNombreCliente());
                break;
            case 2: 
                dataCliente.eliminarCliente(solicitarRutCliente());
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
        System.out.println("Ej: C\\Users\\usuario\\Desktop\\archivo.csv");        
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
        System.out.println("Nombre,RUT,dirección,número telefónico");
        return reader.readLine();    
    }
    
    public String solicitarDatosEquipo() throws IOException {
        System.out.println("");
        System.out.println("Ingrese las características del equipo separadas por coma");
        System.out.println("Modelo,Marca,Almacenamiento,Precio Plan,PrecioLiberado");
        return reader.readLine();
    }
    
    public String solicitarDatosPlan() throws IOException {
        System.out.println("");
        System.out.println("Ingrese las características del plan separadas por coma");
        System.out.println("Nombre,Precio,Total de navegación,Total de minutos,Total de mensajes");
        return reader.readLine();    
    }
    
    public void consultarTipoKeyCliente() throws IOException {
       System.out.println("");
       System.out.println("Seleccione el criterio para buscar al cliente a modificar/eliminar:");
       System.out.println("1. Nombre");
       System.out.println("2. RUT");
    }
    
    public void consultarTipoBusquedaEquipo() throws IOException {
        System.out.println("");
        System.out.println("Seleccione la busqueda del plan:");
        System.out.println("1. Plan más barato");
        System.out.println("2. Plan más caro");
        System.out.println("3. Volver");
    }
    
    public int[] consultarRangoEquipo() throws IOException {
        int[] rango = new int[2];
        System.out.println("");
        System.out.println("Ingrese el precio mínimo");
        rango[0] = Integer.parseInt(reader.readLine());
        System.out.println("Ingrese el precio máximo");
        rango[1] = Integer.parseInt(reader.readLine());        
        return rango;
    }
    
    public void consultarTipoInterfaz() throws IOException {
        System.out.println("");
        System.out.println("Seleccione el tipo de interfaz");
        System.out.println("1. Consola");
        System.out.println("2. Gráfica");    
    }
    
    public void desplegarMenuPrincipal() {
        System.out.println("");
        System.out.println("Bienvenido al administrador de contratos telefónicos");
        System.out.println("1. Cargar archivo CSV");
        System.out.println("2. Agregar elemento");
        System.out.println("3. Mostrar elementos");
        System.out.println("4. Buscar elementos");        
        System.out.println("5. Modificar elemento");
        System.out.println("6. Eliminar elemento");
        System.out.println("7. Exportar CSV de elemento");
        System.out.println("8. Salir");
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
    
    public void desplegarMenuBusqueda() {
        System.out.println("");
        System.out.println("Seleccione el tipo de elemento a buscar");
        System.out.println("1. Equipo");
        System.out.println("2. Contrato");
        System.out.println("3. Volver");    
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
