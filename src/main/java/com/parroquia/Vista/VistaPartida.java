package com.parroquia.Vista;

import com.parroquia.Modelo.Partida;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class VistaPartida {

public Partida formularioNuevaPartida() {
JTextField txtTipo = new JTextField();
JTextField txtNombre = new JTextField();
JTextField txtFecha = new JTextField();
JTextField txtSacerdote = new JTextField();

JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
panel.add(new JLabel("Tipo de sacramento:"));
panel.add(txtTipo);

panel.add(new JLabel("Nombre del feligrés:"));
panel.add(txtNombre);

panel.add(new JLabel("Fecha (DD/MM/AAAA):"));
panel.add(txtFecha);

panel.add(new JLabel("Sacerdote:"));
panel.add(txtSacerdote);

int opcion = JOptionPane.showConfirmDialog(
null,
panel,
"Registrar Partida Sacramental",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.PLAIN_MESSAGE
);

if (opcion == JOptionPane.OK_OPTION) {
return new Partida(
txtTipo.getText(),
txtNombre.getText(),
txtFecha.getText(),
txtSacerdote.getText()
);
}

return null;
}

public void mostrarMensaje(String mensaje) {
JOptionPane.showMessageDialog(null, mensaje);
}
}