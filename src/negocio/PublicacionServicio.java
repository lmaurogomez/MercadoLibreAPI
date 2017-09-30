package negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Lucas on 29/9/2017.
 */
public class PublicacionServicio extends Publicacion {
    private int matriculaProfesional;
    private int cantidadHs;

    public PublicacionServicio(float comision, ArrayList<Venta> venta, int idPublicacion, String nombre, String descripcion, Date fechaDesde, Date fechaHasta, int matriculaProfesional, int cantidadHs) {
        super(comision, venta, idPublicacion, nombre, descripcion, fechaDesde, fechaHasta);
        this.matriculaProfesional = matriculaProfesional;
        this.cantidadHs = cantidadHs;
    }
}
