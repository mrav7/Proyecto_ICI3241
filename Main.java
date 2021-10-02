package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Main {  
    
    public static void main(String[] args) throws IOException {
        HashMap <String, Cliente> mapaClientesNombres = new HashMap();              //Se instancian las variables y colecciones para que
        HashMap <Integer, Cliente> mapaClientesRut = new HashMap();                 //funcione el menú, traté haciendo un método para que
        ArrayList listaEquipos = new ArrayList();                                   //se hiciera todo esto en uan sola linea pero no funciono
        ArrayList listaPlanes = new ArrayList();
        Printer printer = new Printer();
        Menu menu = new Menu();
        Cliente cliente = new Cliente();        
        Equipo equipo = new Equipo(); 
        Plan plan = new Plan();               
        int opcion;
        
        do {
            menu.desplegarMenuPrincipal();
            opcion = menu.leerOpcion();
            
            switch(opcion) {
                case 1:
                    menu.menuCarga(mapaClientesNombres, mapaClientesRut, listaEquipos, listaPlanes);
                    break;
                case 2:                    
                    menu.menuAgregar(mapaClientesNombres, mapaClientesRut, listaEquipos, listaPlanes);
                    break;
                case 3:
                    menu.menuMostrar(mapaClientesNombres, listaEquipos, listaPlanes);
                    break;
                case 4:
                    menu.menuEditar(mapaClientesNombres, mapaClientesRut, listaEquipos, listaPlanes);
                    break;                    
                case 5:
                    menu.menuEliminar(mapaClientesNombres, mapaClientesRut, listaEquipos, listaPlanes);
                    break;
                case 6:
                    menu.menuExportar(mapaClientesNombres, listaEquipos, listaPlanes);
                    break;
                case 7:
                    return;
                default:
                   menu.opcionInvalida();    
            }            
        } while(true);     
    }
}