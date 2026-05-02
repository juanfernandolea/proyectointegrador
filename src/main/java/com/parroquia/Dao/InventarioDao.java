package com.parroquia.Dao;

import com.parroquia.Config.Conexion;
import com.parroquia.Modelo.Inventario;
import java.sql.*;

public class InventarioDao {
private Conexion con = new Conexion();

public void agregarArticulo(Inventario i) {
String sql = "INSERT INTO inventario (nombre_articulo, cantidad) VALUES (?,?)";
try {
Connection cn = con.obtenerConexion();
PreparedStatement ps = cn.prepareStatement(sql);
ps.setString(1, i.getNombreArticulo());
ps.setInt(2, i.getCantidad());
ps.execute();
System.out.println("Artículo añadido al inventario parroquial.");
} catch (SQLException e) {
System.out.println("Error en inventario: " + e.getMessage());
}
}
}
