package ici3241.proyecto;

public class Equipo {
    
    private String nombreEquipo;
    private String marcaEquipo;
    private String disponibilidadEquipo;
    private int almacenamientoEquipo;    
    private int precioEquipoPlan;
    private int precioEquipoLiberado;

    public Equipo(String nombreEquipo, String marcaEquipo, String disponibilidadEquipo, int almacenamientoEquipo, int precioEquipoPlan, int precioEquipoLiberado) {
        this.nombreEquipo = nombreEquipo;
        this.marcaEquipo = marcaEquipo;
        this.disponibilidadEquipo = disponibilidadEquipo;
        this.almacenamientoEquipo = almacenamientoEquipo;
        this.precioEquipoPlan = precioEquipoPlan;
        this.precioEquipoLiberado = precioEquipoLiberado;
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

    public String getDisponibilidadEquipo() {
        return disponibilidadEquipo;
    }

    public void setDisponibilidadEquipo(String disponibilidadEquipo) {
        this.disponibilidadEquipo = disponibilidadEquipo;
    }

    public int getAlmacenamientoEquipo() {
        return almacenamientoEquipo;
    }

    public void setAlmacenamientoEquipo(int almacenamientoEquipo) {
        this.almacenamientoEquipo = almacenamientoEquipo;
    }

    public int getPrecioEquipoPlan() {
        return precioEquipoPlan;
    }

    public void setPrecioEquipoPlan(int precioEquipoPlan) {
        this.precioEquipoPlan = precioEquipoPlan;
    }

    public int getPrecioEquipoLiberado() {
        return precioEquipoLiberado;
    }

    public void setPrecioEquipoLiberado(int precioEquipoLiberado) {
        this.precioEquipoLiberado = precioEquipoLiberado;
    }
  
    
    
}
