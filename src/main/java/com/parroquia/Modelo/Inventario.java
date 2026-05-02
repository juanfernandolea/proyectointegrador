package com.parroquia.Modelo;

public class Inventario {
private int idProducto;
private String nombreArticulo;
private int cantidad;

public Inventario() {}

// --- Túneles para idProducto (El que faltaba) ---
public int getIdProducto() { return idProducto; }
public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

// --- Túneles para nombreArticulo ---
public String getNombreArticulo() { return nombreArticulo; }
public void setNombreArticulo(String n) { this.nombreArticulo = n; }

// --- Túneles para cantidad ---
public int getCantidad() { return cantidad; }
public void setCantidad(int c) { this.cantidad = c; }
}