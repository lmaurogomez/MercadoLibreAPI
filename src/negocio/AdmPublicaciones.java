package negocio;

import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class AdmPublicaciones {
    private static AdmPublicaciones admPublicaciones;

    private ArrayList<PublicacionPadre> publicacionesPadres;


    private AdmPublicaciones(){
    }

    public static AdmPublicaciones getInstance(){
        if(admPublicaciones == null){
            admPublicaciones = new AdmPublicaciones();
        }
        return admPublicaciones;
    }
}
