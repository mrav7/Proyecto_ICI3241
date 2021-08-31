package ici3241.proyecto;

public class Cliente {
    
    private String nombre;
    private String rut;    
    private String direccion;    
    private String numeroCliente;
    private String planCliente;

    public Cliente(String nombre, String rut, String direccion, String numeroCliente, String planCliente) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.numeroCliente = numeroCliente;
        this.planCliente = planCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getPlanCliente() {
        return planCliente;
    }

    public void setPlanCliente(String planCliente) {
        this.planCliente = planCliente;
    }   
    
}
