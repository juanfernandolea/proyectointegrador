package com.parroquia.Modelo;

public class Boveda {
private int idBoveda;
private String ubicacion;
private String estado; // Disponible u Ocupada

public Boveda() {}

public Boveda(String ubicacion, String estado) {
this.ubicacion = ubicacion;
this.estado = estado;
}

public String getUbicacion() { return ubicacion; }
public void setUbicacion(String ubi) { this.ubicacion = ubi; }
public String getEstado() { return estado; }
public void setEstado(String est) { this.estado = est; }
}