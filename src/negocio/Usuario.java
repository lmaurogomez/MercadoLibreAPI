package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Usuario extends ObservableOferta   {
    private String nickName;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String email;
    private String contrasena;
    private int reputacion;
    private boolean estado;
    private ArrayList<Calificacion> calificacionesV;
    private ArrayList<Calificacion> calificacionesC;
    private Date fechaUltimaContrasena;

    public Usuario(ArrayList<ObserverOferta> observadores, String nickName, String nombre, String apellido, String domicilio, String email, String contrasena) {
        super(observadores);
        this.nickName = nickName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Calificacion> getCalificacionesV() {
        return calificacionesV;
    }

    public void setCalificacionesV(ArrayList<Calificacion> calificacionesV) {
        this.calificacionesV = calificacionesV;
    }

    public ArrayList<Calificacion> getCalificacionesC() {
        return calificacionesC;
    }

    public void setCalificacionesC(ArrayList<Calificacion> calificacionesC) {
        this.calificacionesC = calificacionesC;
    }

    public Date getFechaUltimaContrasena() {
        return fechaUltimaContrasena;
    }

    public void setFechaUltimaContrasena(Date fechaUltimaContrasena) {
        this.fechaUltimaContrasena = fechaUltimaContrasena;
    }
}
