package com.parroquia.Vista;

import com.parroquia.Modelo.Boveda;
import com.parroquia.Servicios.BovedaService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VistaBoveda extends JFrame {

private BovedaService service = new BovedaService();

public VistaBoveda() {
// 1. Configuración básica de la ventana
setTitle("Gestión de Bóvedas");
setSize(700, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLayout(new BorderLayout()); // Asegura el layout del JFrame

// 2. Creación de componentes
JButton btnCambiar = new JButton("Cambiar estado");
JTextField txtId = new JTextField(5);
JTextField txtEstado = new JTextField(10);

// 3. Panel superior para el formulario
JPanel panelTop = new JPanel();
panelTop.add(new JLabel("ID Bóveda:"));
panelTop.add(txtId);
panelTop.add(new JLabel("Nuevo Estado:"));
panelTop.add(txtEstado);
panelTop.add(btnCambiar);

// Agregar el panel a la zona NORTE del JFrame
add(panelTop, BorderLayout.NORTH);

// 4. Acción del botón con validación de errores (Try-Catch)
btnCambiar.addActionListener(e -> {
try {
// Validar que los campos no estén vacíos
if (txtId.getText().trim().isEmpty() || txtEstado.getText().trim().isEmpty()) {
JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
return;
}

// Intenta convertir el ID a número
int id = Integer.parseInt(txtId.getText().trim());
String estado = txtEstado.getText().trim();

// Llama al servicio y muestra la respuesta de la base de datos
String msg = service.cambiarDisponibilidad(id, estado);
JOptionPane.showMessageDialog(this, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);

// Limpiar campos después de guardar exitosamente
txtId.setText("");
txtEstado.setText("");

} catch (NumberFormatException ex) {
// Si el usuario escribe letras en el ID, evita que el programa se cierre (crash)
JOptionPane.showMessageDialog(this, "El ID debe ser un número entero válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
}
});
}
}