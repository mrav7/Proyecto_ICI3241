package ici3241.proyecto.controlador;
import ici3241.proyecto.modelo.*;
import ici3241.proyecto.vista.*;
import java.io.*;


public class Main {  
    
    public static void main(String[] args) throws IOException {      
        
        ClienteData clienteData = new ClienteData();     
        EquipoData equipoData = new EquipoData();
        PlanData planData = new PlanData();
        
        clienteData.inicializar();
        equipoData.inicializar();
        planData.inicializar();
          
        GUILogin login = new GUILogin(clienteData, equipoData, planData);
        login.inicializar();
        login.setVisible(true);
        
        
        /*
        Menu menu = new Menu();
        int opcion;
        
        do {
            menu.desplegarMenuPrincipal();
            opcion = menu.leerOpcion();
            
            switch(opcion) {                
                case 1:                    
                    menu.menuAgregar(clienteData, equipoData, planData);
                    break;
                case 2:
                    menu.menuMostrar(clienteData, equipoData, planData);
                    break;
                case 3:
                    menu.menuBusqueda(equipoData, planData);
                    break;
                case 4:
                    menu.menuEditar(clienteData, equipoData, planData);
                    break;                    
                case 5:
                    menu.menuEliminar(clienteData, equipoData, planData);
                    break;
                case 6:
                    menu.menuExportar(clienteData, equipoData, planData);
                    break;
                case 7:
                    return;                
                default:
                   menu.opcionInvalida();    
            }            
        } while(true); */     
    }
}