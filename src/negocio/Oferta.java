package negocio;

import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Oferta {
    private Usuario usuarioComprador;
    private float oferta;
    private Date fechaOferta;

    public Oferta(Usuario usuarioComprador, float oferta, Date fechaOferta) {
        this.usuarioComprador = usuarioComprador;
        this.oferta = oferta;
        this.fechaOferta = fechaOferta;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public float getOferta() {
        return oferta;
    }

    public void setOferta(float oferta) {
        this.oferta = oferta;
    }

    public Date getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(Date fechaOferta) {
        this.fechaOferta = fechaOferta;
    }
}
