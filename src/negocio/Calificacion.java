package negocio;

import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Calificacion extends ObserverEntidadBancaria{
    private Venta venta;
    private Usuario usuarioC;
    private Usuario usuarioV;
    private int calificacion;
    private Date fecha;
    private String observaciones;
    private boolean habilitada;

    public Calificacion(Venta venta, Usuario usuarioC, Usuario usuarioV, int calificacion, Date fecha, String observaciones, boolean habilitada) {
        this.venta = venta;
        this.usuarioC = usuarioC;
        this.usuarioV = usuarioV;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.habilitada = habilitada;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Usuario getUsuarioC() {
        return usuarioC;
    }

    public void setUsuarioC(Usuario usuarioC) {
        this.usuarioC = usuarioC;
    }

    public Usuario getUsuarioV() {
        return usuarioV;
    }

    public void setUsuarioV(Usuario usuarioV) {
        this.usuarioV = usuarioV;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
}
