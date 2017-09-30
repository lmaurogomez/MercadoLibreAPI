package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class PublicacionProducto extends Publicacion{
    private int garantia;

    public PublicacionProducto(float comision, ArrayList<Venta> venta, int idPublicacion, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, int garantia) {
        super(comision, venta, idPublicacion, nombre, descripcion, fechaDesde, fechaHasta);
        this.garantia = garantia;
    }
}
