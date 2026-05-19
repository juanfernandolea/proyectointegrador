package com.parroquia.Vista;

import com.parroquia.Modelo.Partida;
import com.parroquia.Servicios.PartidaService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaGeneral extends JFrame {

public VistaGeneral() {

setTitle("Parroquia La Inmaculada Concepción de Villagorgona");
setSize(900, 600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JMenuBar barraMenu = new JMenuBar();

JMenu menuPartidas = new JMenu("Partidas");
JMenu menuBovedas = new JMenu("Bóvedas");
JMenu menuInventario = new JMenu("Inventario");
JMenu menuMisas = new JMenu("Misas");

barraMenu.add(menuPartidas);
barraMenu.add(menuBovedas);
barraMenu.add(menuInventario);
barraMenu.add(menuMisas);

setJMenuBar(barraMenu);

// PARTIDAS
menuPartidas.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
VistaPartida vistaPartida = new VistaPartida();
Partida partida = vistaPartida.formularioNuevaPartida();

PartidaService service = new PartidaService();
String mensaje = service.guardarNuevaPartida(partida);

vistaPartida.mostrarMensaje(mensaje);
}
});

// BÓVEDAS
menuBovedas.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
VistaBoveda vista = new VistaBoveda();
vista.setVisible(true);
}
});

JLabel titulo = new JLabel("Sistema de Gestión Parroquial");
titulo.setHorizontalAlignment(SwingConstants.CENTER);
titulo.setFont(new Font("Arial", Font.BOLD, 28));

add(titulo);

setVisible(true);
}
}