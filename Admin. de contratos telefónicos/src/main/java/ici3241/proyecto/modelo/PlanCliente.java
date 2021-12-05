package ici3241.proyecto.modelo;


public class PlanCliente extends Plan {
    private String nombreCliente;
    private String rutCliente;
    private int totalNavegacionGastado;
    private String totalMinutosGastado;
    private int totalMensajesGastado;
    private String fechaInicioContrato;
    private String fechaSiguienteFactura;
    
    public PlanCliente(String nombreCliente, String nombrePlan, int navegacionGastado, String minutosGastado, int mensajesGastado, String fechaInicio, String fechaSig) {
        this.nombreCliente = nombreCliente;
        this.nombrePlan = nombrePlan;
        this.totalNavegacionGastado = navegacionGastado;
        this.totalMinutosGastado = minutosGastado;
        this.totalMensajesGastado = mensajesGastado;
        this.fechaInicioContrato = fechaInicio;
        this.fechaSiguienteFactura = fechaSig;    
    }
    
    public PlanCliente() {
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

    public int getTotalNavegacionGastado() {
        return totalNavegacionGastado;
    }

    public void setTotalNavegacionGastado(int totalNavegacionGastado) {
        this.totalNavegacionGastado = totalNavegacionGastado;
    }

    public String getTotalMinutosGastado() {
        return totalMinutosGastado;
    }

    public void setTotalMinutosGastado(String totalMinutosGastado) {
        this.totalMinutosGastado = totalMinutosGastado;
    }

    public int getTotalMensajesGastado() {
        return totalMensajesGastado;
    }

    public void setTotalMensajesGastado(int totalMensajesGastado) {
        this.totalMensajesGastado = totalMensajesGastado;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public String getFechaSiguienteFactura() {
        return fechaSiguienteFactura;
    }

    public void setFechaSiguienteFactura(String fechaSiguienteFactura) {
        this.fechaSiguienteFactura = fechaSiguienteFactura;
    }
}
