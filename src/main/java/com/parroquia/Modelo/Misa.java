package com.parroquia.Modelo;

public class Misa {
private int idMisa;
private String fecha;
private String hora;
private String intencion; // Por quién se ofrece la misa
private String sacerdoteCelebrante;

public Misa() {}

public String getIntencion() { return intencion; }
public void setIntencion(String intencion) { this.intencion = intencion; }
}