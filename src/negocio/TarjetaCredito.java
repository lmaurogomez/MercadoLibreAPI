package negocio;

import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class TarjetaCredito extends Venta {
    private int nroTarjeta;
    private Date vtoTarjeta;
    private String nombreTitular;
    private int dniTitular;

    public TarjetaCredito(int idVenta, Usuario vendedor, Usuario comprador, float importe, PublicacionPadre publicacionPadre, boolean pagoConfirmado, int nroTarjeta, Date vtoTarjeta, String nombreTitular, int dniTitular) {
        super(idVenta, vendedor, comprador, importe, publicacionPadre, pagoConfirmado);
        this.nroTarjeta = nroTarjeta;
        this.vtoTarjeta = vtoTarjeta;
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
    }
}
