package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class SubastaBasica extends Subasta {

    public SubastaBasica(float comision, ArrayList<Venta> venta, int idSubasta, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, float precioInicial) {
        super(comision, venta, idSubasta, nombre, descripcion, fechaDesde, fechaHasta, precioInicial);
    }
}
