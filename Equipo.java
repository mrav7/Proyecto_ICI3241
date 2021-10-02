package ici3241.proyecto;
import java.io.*;
import java.util.*;

public class Equipo {
    
    private String nombreEquipo;
    private String marcaEquipo;    
    private String almacenamientoEquipo;    
    private String precioEquipoPlan;
    private String precioEquipoLiberado;
    
    //Necesario para pedir datos y mostrar info por pantalla
    private Menu menu;

    public Equipo(String nombreEquipo, String marcaEquipo, String almacenamientoEquipo, String precioEquipoPlan, String precioEquipoLiberado) {
        this.nombreEquipo = nombreEquipo;
        this.marcaEquipo = marcaEquipo;
        this.almacenamientoEquipo = almacenamientoEquipo;
        this.precioEquipoPlan = precioEquipoPlan;
        this.precioEquipoLiberado = precioEquipoLiberado;
    }
    
    public Equipo(){
    }
    
    //Lo mismo que con los metodos de ingreso de cliente y plan
    public Equipo crearEquipo(String datos) {
        String[] campos = new String[10];
        campos = datos.split(",");
        Equipo equipo = new Equipo(campos[0], campos[1], campos[2], campos[3], campos[4]);
        return equipo;    
    }
    //idem
    public void ingresarEquipos(ArrayList <Equipo> listaEquipos, String direccion) throws IOException, FileNotFoundException {
        File file = new File(direccion);
        BufferedReader reader = new BufferedReader(new FileReader(file));        
        String linea;      

        while ((linea = reader.readLine()) != null) {            
            Equipo equipo = crearEquipo(linea);
            listaEquipos.add(equipo);
        }
        reader.close();
        System.out.println("Archivo cargado en la aplicación.");
    }    

    //idem
    public void ingresarEquiposManual(ArrayList <Equipo> listaEquipos, String datos) {
        Equipo equipo = crearEquipo(datos);
        listaEquipos.add(equipo);
        System.out.println("Equipo añadido a la aplicación.");
    }
    
    //Retorna la posicion del equipo en el arraylist, de no encontrarlo retorna un -1 
    public int buscarEquipo(ArrayList <Equipo> listaEquipos, String modeloEquipo) {
        int i;
        for (i = 0 ; i < listaEquipos.size() ; i++) {
            if (listaEquipos.get(i).nombreEquipo.equals(modeloEquipo)) {
                return i;
            }
        }
        menu.elementoInexistente();
        return -1;
    }      
    
    //Revisa si el equipo está dentro del arreglo, de ser crea uno nuevo con los datos que da el usuario, elimina el que se pide del
    //arraylist y agrega el nuevo 
    public void modificarEquipo(ArrayList <Equipo> listaEquipos, String modeloEquipo) throws IOException {
        Menu menu = new Menu();
        if (buscarEquipo(listaEquipos, modeloEquipo) != -1) {
            Equipo equipo = crearEquipo(menu.solicitarDatosEquipo());
            listaEquipos.remove(buscarEquipo(listaEquipos, modeloEquipo));
            listaEquipos.add(equipo);
        } else menu.elementoInexistente();
    }
    
    public void eliminarEquipo(ArrayList <Equipo> listaEquipos, String modeloEquipo) {
        Menu menu = new Menu();
        if (buscarEquipo(listaEquipos, modeloEquipo) != -1) {
            listaEquipos.remove(buscarEquipo(listaEquipos, modeloEquipo));
        } else menu.elementoInexistente();    
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

    public String getAlmacenamientoEquipo() {
        return almacenamientoEquipo;
    }

    public void setAlmacenamientoEquipo(String almacenamientoEquipo) {
        this.almacenamientoEquipo = almacenamientoEquipo;
    }

    public String getPrecioEquipoPlan() {
        return precioEquipoPlan;
    }

    public void setPrecioEquipoPlan(String precioEquipoPlan) {
        this.precioEquipoPlan = precioEquipoPlan;
    }

    public String getPrecioEquipoLiberado() {
        return precioEquipoLiberado;
    }

    public void setPrecioEquipoLiberado(String precioEquipoLiberado) {
        this.precioEquipoLiberado = precioEquipoLiberado;
    }    
}
