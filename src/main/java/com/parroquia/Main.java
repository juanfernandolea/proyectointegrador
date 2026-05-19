package com.parroquia;

import javax.swing.SwingUtilities;
import com.parroquia.Vista.VistaGeneral;

public class Main {
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
VistaGeneral vista = new VistaGeneral();
vista.setVisible(true);
});
}
}