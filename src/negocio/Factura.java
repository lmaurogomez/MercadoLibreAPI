package negocio;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Factura extends ObserverEntidadBancaria{
    private Venta venta;
    private float importe;
    private boolean confirmada;

    public Factura(Venta venta, float importe, boolean confirmada) {
        this.venta = venta;
        this.importe = importe;
        this.confirmada = confirmada;
    }
}
