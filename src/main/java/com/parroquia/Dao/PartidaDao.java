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
String sql = "INSERT INTO partidas (tipo, nombre, fecha, sacerdote) VALUES (?,?,?,?)";
try {
cn = con.obtenerConexion();
ps = cn.prepareStatement(sql);
ps.setString(1, p.getTipoSacramento());
ps.setString(2, p.getNombreFeligres());
ps.setString(3, p.getFecha());
ps.setString(4, p.getSacerdote());
ps.execute();
System.out.println("Partida guardada en los libros digitales.");[cite: 1]
return true;
} catch (SQLException e) {
System.out.println("Error al guardar partida: " + e.getMessage());
return false;
}
}

public List<Partida> listarTodo() {
List<Partida> lista = new ArrayList<>();
String sql = "SELECT * FROM partidas";
try {
cn = con.obtenerConexion();
ps = cn.prepareStatement(sql);
rs = ps.executeQuery();
while (rs.next()) {
Partida p = new Partida();
p.setId(rs.getInt("id"));
p.setTipoSacramento(rs.getString("tipo"));
p.setNombreFeligres(rs.getString("nombre"));
p.setFecha(rs.getString("fecha"));
p.setSacerdote(rs.getString("sacerdote"));
lista.add(p);
}
} catch (SQLException e) {
System.out.println("No se pudieron leer las partidas: " + e.getMessage());
}
return lista;
}
}
