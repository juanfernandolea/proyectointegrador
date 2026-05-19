package com.parroquia.Vista;

import com.parroquia.Modelo.Partida;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

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

    // NUEVO MÉTODO: Abre una ventana independiente y muestra los registros existentes
    public void mostrarTablaPartidas(List<Partida> listaPartidas) {
        JFrame ventanaTabla = new JFrame("Listado de Partidas Sacramentales");
        ventanaTabla.setSize(700, 400);
        ventanaTabla.setLocationRelativeTo(null);
        ventanaTabla.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Definir columnas de la tabla
        String[] columnas = {"ID", "Tipo Sacramento", "Feligrés", "Fecha", "Sacerdote"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);

        // Llenar el modelo con los datos de la lista
        for (Partida p : listaPartidas) {
            Object[] fila = {
                p.getId(),
                p.getTipoSacramento(),
                p.getNombreFeligres(),
                p.getFecha(),
                p.getSacerdote()
            };
            modeloTabla.addRow(fila);
        }

        JTable tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla); // Permite hacer scroll si hay muchos datos

        ventanaTabla.add(scrollPane, BorderLayout.CENTER);
        ventanaTabla.setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}