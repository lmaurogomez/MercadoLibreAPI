package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class ObservableEntidadBancaria {
    private ArrayList<ObserverEntidadBancaria> observadores;

    public ObservableEntidadBancaria(ArrayList<ObserverEntidadBancaria> observadores) {
        this.observadores = observadores;
    }
}
