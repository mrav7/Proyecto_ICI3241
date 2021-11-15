package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Main {  
    
    public static void main(String[] args) throws IOException {      
        
        ClienteData clienteData = new ClienteData();        
        EquipoData equipoData = new EquipoData();
        PlanData planData = new PlanData();
                                            
        Menu menu = new Menu();
                      
        int opcion;
        
        do {
            menu.desplegarMenuPrincipal();
            opcion = menu.leerOpcion();
            
            switch(opcion) {
                case 1:
                    menu.menuCarga(clienteData, equipoData, planData);
                    break;
                case 2:                    
                    menu.menuAgregar(clienteData, equipoData, planData);
                    break;
                case 3:
                    menu.menuMostrar(clienteData, equipoData, planData);
                    break;
                case 4:
                    menu.menuBusqueda(equipoData, planData);
                    break;
                case 5:
                    menu.menuEditar(clienteData, equipoData, planData);
                    break;                    
                case 6:
                    menu.menuEliminar(clienteData, equipoData, planData);
                    break;
                case 7:
                    menu.menuExportar(clienteData, equipoData, planData);
                    break;
                case 8:
                    return;                
                default:
                   menu.opcionInvalida();    
            }            
        } while(true);     
    }
}