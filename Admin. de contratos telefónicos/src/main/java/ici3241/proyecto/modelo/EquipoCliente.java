package ici3241.proyecto.modelo;

public class EquipoCliente extends Equipo {    
    private String nombreCliente;
    private String rutCliente;
    private String planEquipo;

    public EquipoCliente(String nombreCliente, String rut, String modelo, String marca, String almacenamiento, String precioPlan, String precioLiberado, String nombrePlan) {
        super(modelo, marca, almacenamiento,precioPlan, precioLiberado);        
        this.nombreCliente = nombreCliente;
        this.rutCliente = rut;
        this.planEquipo = nombrePlan;
    }
    
    public EquipoCliente() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }    

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }   
    
    public String getPlanEquipo() {
        return planEquipo;
    }

    public void setPlanEquipo(String planEquipo) {
        this.planEquipo = planEquipo;
    }
}
