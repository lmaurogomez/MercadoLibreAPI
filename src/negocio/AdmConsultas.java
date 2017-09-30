package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class AdmConsultas {
    private static AdmConsultas admConsultas;

    private AdmConsultas() {
    }

    public static AdmConsultas getInstance() {
        if (admConsultas == null) {
            admConsultas = new AdmConsultas();
        }
        return admConsultas;
    }
}
