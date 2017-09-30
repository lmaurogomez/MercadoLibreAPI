package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class SubastaDePublicacion extends Subasta {
    private PublicacionProducto publicacion;

    public SubastaDePublicacion(float comision, ArrayList<Venta> venta, int idSubasta, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, float precioInicial, PublicacionProducto publicacion) {
        super(comision, venta, idSubasta, nombre, descripcion, fechaDesde, fechaHasta, precioInicial);
        this.publicacion = publicacion;
    }
}
