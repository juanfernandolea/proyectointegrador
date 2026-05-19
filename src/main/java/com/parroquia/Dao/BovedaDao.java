package com.parroquia.Dao;

import com.parroquia.Config.Conexion;
import java.sql.*;

public class BovedaDao {
private Conexion con = new Conexion();

public void actualizarEstado(int id, String nuevoEstado) {
String sql = "UPDATE bovedas SET estado = ? WHERE id_boveda = ?";

// Abre y cierra recursos automáticamente
try (Connection cn = con.obtenerConexion();
PreparedStatement ps = cn.prepareStatement(sql)) {

ps.setString(1, nuevoEstado);
ps.setInt(2, id);
ps.executeUpdate();
System.out.println("Estado de la bóveda actualizado en BD.");

} catch (SQLException e) {
System.out.println("Error al actualizar bóveda: " + e.getMessage());
// Lanza la excepción para que el servicio o la vista se enteren si algo falló
throw new RuntimeException(e); 
}
}
}
