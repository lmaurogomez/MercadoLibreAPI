package negocio;

import javax.swing.undo.UndoableEditSupport;
import java.util.ArrayList;

/**
 * Created by Lucas on 29/9/2017.
 */
public class AdmUsuarios {
    private static AdmUsuarios admUsuarios;

    private ArrayList<Usuario> usuarios;

    private AdmUsuarios(){
    }

    public static AdmUsuarios getInstance(){
        if(admUsuarios == null){
            admUsuarios = new AdmUsuarios();
        }
        return admUsuarios;
    }
}
