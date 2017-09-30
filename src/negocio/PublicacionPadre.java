package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class PublicacionPadre {
    private float comision;
    private ArrayList<Venta> venta;

    public PublicacionPadre(float comision, ArrayList<Venta> venta) {
        this.comision = comision;
        this.venta = venta;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public ArrayList<Venta> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Venta> venta) {
        this.venta = venta;
    }
}
