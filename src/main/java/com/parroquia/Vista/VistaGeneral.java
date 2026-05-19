package com.parroquia.Vista;

import com.parroquia.Modelo.Partida;
import com.parroquia.Servicios.PartidaService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VistaGeneral extends JFrame {

    public VistaGeneral() {
        setTitle("Parroquia La Inmaculada Concepción de Villagorgona");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Barra de menú y menús principales
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuPartidas = new JMenu("Partidas");
        JMenu menuBovedas = new JMenu("Bóvedas");
        JMenu menuInventario = new JMenu("Inventario");
        JMenu menuMisas = new JMenu("Misas");

        // 2. Ítems del menú Partidas
        JMenuItem itemNuevaPartida = new JMenuItem("Nueva Partida");
        JMenuItem itemConsultarPartidas = new JMenuItem("Consultar Partidas"); // NUEVO ÍTEM
        menuPartidas.add(itemNuevaPartida);
        menuPartidas.add(itemConsultarPartidas);

        // Ítems del menú Bóvedas
        JMenuItem itemGestionBovedas = new JMenuItem("Gestionar Bóvedas");
        menuBovedas.add(itemGestionBovedas);

        // Agregar menús a la barra principal
        barraMenu.add(menuPartidas);
        barraMenu.add(menuBovedas);
        barraMenu.add(menuInventario);
        barraMenu.add(menuMisas);
        setJMenuBar(barraMenu);

        // 3. Acción para Registrar Nueva Partida
        itemNuevaPartida.addActionListener(e -> {
            VistaPartida vistaPartida = new VistaPartida();
            Partida partida = vistaPartida.formularioNuevaPartida();

            if (partida != null) {
                PartidaService service = new PartidaService();
                String mensaje = service.guardarNuevaPartida(partida);
                vistaPartida.mostrarMensaje(mensaje);
            }
        });

        // 4. Acción para Consultar Partidas (Muestra la Tabla)
        itemConsultarPartidas.addActionListener(e -> {
            PartidaService service = new PartidaService();
            List<Partida> lista = service.obtenerListaDePartidas(); // Trae los datos de la BD
            
            VistaPartida vistaPartida = new VistaPartida();
            vistaPartida.mostrarTablaPartidas(lista); // Abre la ventana con la tabla
        });

        // 5. Acción para el módulo de Bóvedas
        itemGestionBovedas.addActionListener(e -> {
            VistaBoveda vista = new VistaBoveda();
            vista.setVisible(true);
        });

        // Diseño del título en la ventana principal
        JLabel titulo = new JLabel("Sistema de Gestión Parroquial");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        add(titulo);

        setVisible(true);
    }
}