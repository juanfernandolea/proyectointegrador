package com.parroquia.Modelo;

public class Inventario {
private int idProducto;
private String nombreArticulo;
private int cantidad;
private String estadoArticulo;

public Inventario() {}

public String getNombreArticulo() { return nombreArticulo; }
public void setNombreArticulo(String nom) { this.nombreArticulo = nom; }
public int getCantidad() { return cantidad; }
public void setCantidad(int cant) { this.cantidad = cant; }
}