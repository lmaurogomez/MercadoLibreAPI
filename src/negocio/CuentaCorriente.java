package negocio;

/**
 * Created by Lucas on 29/9/2017.
 */
public class CuentaCorriente extends Venta {
    public CuentaCorriente(int idVenta, Usuario vendedor, Usuario comprador, float importe, PublicacionPadre publicacionPadre, boolean pagoConfirmado) {
        super(idVenta, vendedor, comprador, importe, publicacionPadre, pagoConfirmado);
    }
}
