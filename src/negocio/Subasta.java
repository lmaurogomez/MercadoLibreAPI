package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class Subasta extends PublicacionPadre {
    private int idSubasta;
    private String nombre;
    private String descripcion;
    private Date fechaDesde;
    private Date fechaHasta;
    private float precioInicial;

    private ArrayList<Oferta> ofertas;

    public Subasta(float comision, ArrayList<Venta> venta, int idSubasta, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, float precioInicial) {
        super(comision, venta);
        this.idSubasta = idSubasta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.precioInicial = precioInicial;
    }
}
