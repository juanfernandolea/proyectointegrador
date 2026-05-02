package com.parroquia.Config;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection obtenerConexion() {
        try {
            String url = "jdbc:postgresql://localhost:5432/parroquia_db";
            return DriverManager.getConnection(url, "postgres", "iglesiavg");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
