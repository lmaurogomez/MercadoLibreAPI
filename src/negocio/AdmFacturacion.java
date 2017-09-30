package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class AdmFacturacion {
    private static AdmFacturacion admFacturacion;

    private ArrayList<Factura> facturas;


    private AdmFacturacion() {
    }

    public static AdmFacturacion getInstance() {
        if (admFacturacion == null) {
            admFacturacion = new AdmFacturacion();
        }
        return admFacturacion;
    }
}