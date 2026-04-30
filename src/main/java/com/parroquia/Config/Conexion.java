package com.parroquia.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
// conexión activa
private Connection miConexion = null;

// Datos para entrar a tu base de datos de Postgres
// Asegúrate de que la base de datos se llame 'parroquia_db' o cámbialo aquí
private String url = "jdbc:postgresql://localhost:5432/parroquia_db";
private String usuario = "postgres"; 
private String clave = "tu_password_aqui";

public Connection obtenerConexion() {
try {
// Cargamos el driver de PostgreSQL
Class.forName("org.postgresql.Driver");

// Intentamos conectar usando los datos de arriba
miConexion = DriverManager.getConnection(url, usuario, clave);

System.out.println("¡Éxito! El sistema ya está conectado a la base de datos.");[cite: 1]

} catch (ClassNotFoundException e) {
System.out.println("Error: No se encontró el driver de Postgres.");
} catch (SQLException e) {
System.out.println("Vaya, no pude conectar a la base de datos. Revisa el usuario o la clave.");
System.out.println("Detalle del error: " + e.getMessage());
}

return miConexion;
}

public void cerrarConexion() {
if (miConexion != null) {
try {
miConexion.close();
System.out.println("Conexión con la parroquia cerrada correctamente.");
} catch (SQLException e) {
System.out.println("No se pudo cerrar la conexión: " + e.getMessage());
}
}
}
}
