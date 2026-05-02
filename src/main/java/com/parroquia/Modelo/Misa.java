package com.parroquia.Modelo;

public class Misa {
    private int idMisa;
    private String fecha;
    private String hora;
    private String intencion; 
    private String sacerdoteCelebrante;

    public Misa() {}

    // --- Túneles para idMisa ---
    public int getIdMisa() { return idMisa; }
    public void setIdMisa(int idMisa) { this.idMisa = idMisa; }

    // --- Túneles para fecha ---
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    // --- Túneles para hora ---
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    // --- Túneles para intencion ---
    public String getIntencion() { return intencion; }
    public void setIntencion(String intencion) { this.intencion = intencion; }

    // --- Túneles para sacerdoteCelebrante ---
    public String getSacerdoteCelebrante() { return sacerdoteCelebrante; }
    public void setSacerdoteCelebrante(String sacerdoteCelebrante) { this.sacerdoteCelebrante = sacerdoteCelebrante; }
}