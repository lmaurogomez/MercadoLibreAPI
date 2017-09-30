package negocio;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Venta {
    private int idVenta;
    private Usuario vendedor;
    private Usuario comprador;
    private float importe;
    private PublicacionPadre publicacionPadre;
    private boolean pagoConfirmado;

    public Venta(int idVenta, Usuario vendedor, Usuario comprador, float importe, PublicacionPadre publicacionPadre, boolean pagoConfirmado) {
        this.idVenta = idVenta;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.importe = importe;
        this.publicacionPadre = publicacionPadre;
        this.pagoConfirmado = pagoConfirmado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public PublicacionPadre getPublicacionPadre() {
        return publicacionPadre;
    }

    public void setPublicacionPadre(PublicacionPadre publicacionPadre) {
        this.publicacionPadre = publicacionPadre;
    }

    public boolean isPagoConfirmado() {
        return pagoConfirmado;
    }

    public void setPagoConfirmado(boolean pagoConfirmado) {
        this.pagoConfirmado = pagoConfirmado;
    }
}
