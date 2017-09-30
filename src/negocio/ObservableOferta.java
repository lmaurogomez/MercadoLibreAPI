package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class ObservableOferta {
    private ArrayList<ObserverOferta> observadores;

    public ObservableOferta(ArrayList<ObserverOferta> observadores) {
        this.observadores = observadores;
    }
}
