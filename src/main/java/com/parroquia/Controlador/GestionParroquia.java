package com.parroquia.Controlador;

import javax.swing.SwingUtilities;
import com.parroquia.Vista.VistaGeneral;

public class GestionParroquia {

    public void menuPrincipal() {
        SwingUtilities.invokeLater(() -> {
            new VistaGeneral();
        });
    }
}