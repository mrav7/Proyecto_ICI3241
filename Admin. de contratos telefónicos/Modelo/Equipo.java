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
