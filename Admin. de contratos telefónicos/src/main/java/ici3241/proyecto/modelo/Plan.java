package ici3241.proyecto.modelo;

public class Plan {
    
    protected String nombrePlan;
    private int precioPlan;
    private int totalNavegacion;
    private String totalMinutos;
    private int totalMensajes;
    
    public Plan(String nombrePlan, int precioPlan, int totalNavegacion, String totalMinutos, int totalMensajes) {
        this.nombrePlan = nombrePlan;
        this.precioPlan = precioPlan;
        this.totalNavegacion = totalNavegacion;
        this.totalMinutos = totalMinutos;
        this.totalMensajes = totalMensajes;
    }
    
    public Plan() {
    }
       
    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public int getPrecioPlan() {
        return precioPlan;
    }

    public void setPrecioPlan(int precioPlan) {
        this.precioPlan = precioPlan;
    }

    public int getTotalNavegacion() {
        return totalNavegacion;
    }

    public void setTotalNavegacion(int totalNavegacion) {
        this.totalNavegacion = totalNavegacion;
    }

    public String getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(String totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public int getTotalMensajes() {
        return totalMensajes;
    }

    public void setTotalMensajes(int totalMensajes) {
        this.totalMensajes = totalMensajes;
    }
    
    
}
