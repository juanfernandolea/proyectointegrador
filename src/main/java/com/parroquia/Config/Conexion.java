package com.parroquia.Config;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

public Connection obtenerConexion() {
try {
String url = "jdbc:postgresql://localhost:5432/parroquia_db";
String usuario = "postgres";
String password = "iglesiavg";

return DriverManager.getConnection(url, usuario, password);

} catch (Exception e) {
JOptionPane.showMessageDialog(
null,
"Error de conexión a la base de datos:\n" + e.getMessage(),
"Error",
JOptionPane.ERROR_MESSAGE
);
return null;
}
}
}
