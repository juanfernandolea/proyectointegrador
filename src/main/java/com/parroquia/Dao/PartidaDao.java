package com.parroquia.Dao;

import com.parroquia.Config.Conexion;
import com.parroquia.Modelo.Partida;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaDao {
private Conexion con = new Conexion();
private Connection cn;
private PreparedStatement ps;
private ResultSet rs;

public boolean registrar(Partida p) {
try {
cn = con.obtenerConexion();

// ESPÍA DE COLUMNAS: Esto lee los nombres reales de tu tabla en PostgreSQL
DatabaseMetaData metaData = cn.getMetaData();
ResultSet columnas = metaData.getColumns(null, null, "partidas", null);
System.out.println("=== LAS COLUMNAS REALES DE TU TABLA 'PARTIDAS' SON: ===");
while (columnas.next()) {
System.out.println("-> " + columnas.getString("COLUMN_NAME"));
}
System.out.println("=====================================================");

return false; // Retorna falso a propósito para revisar la terminal primero
} catch (SQLException e) {
System.out.println("Error de diagnóstico: " + e.getMessage());
return false;
} finally {
cerrarRecursos();
}
}

public List<Partida> listarTodo() {
return new ArrayList<>();
}

private void cerrarRecursos() {
try {
if (rs != null) rs.close();
if (ps != null) ps.close();
if (cn != null) cn.close();
} catch (SQLException e) {
System.out.println("Error al cerrar: " + e.getMessage());
}
}
}