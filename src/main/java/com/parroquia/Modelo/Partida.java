package com.parroquia.Modelo;

public class Partida {
private int id;
private String tipoSacramento;
private String nombreFeligres;
private String fecha;
private String sacerdote;

public Partida() {
}

public Partida(String tipoSacramento, String nombreFeligres, String fecha, String sacerdote) {
this.tipoSacramento = tipoSacramento;
this.nombreFeligres = nombreFeligres;
this.fecha = fecha;
this.sacerdote = sacerdote;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getTipoSacramento() {
return tipoSacramento;
}

public void setTipoSacramento(String tipoSacramento) {
this.tipoSacramento = tipoSacramento;
}

public String getNombreFeligres() {
return nombreFeligres;
}

public void setNombreFeligres(String nombreFeligres) {
this.nombreFeligres = nombreFeligres;
}

public String getFecha() {
return fecha;
}

public void setFecha(String fecha) {
this.fecha = fecha;
}

public String getSacerdote() {
return sacerdote;
}

public void setSacerdote(String sacerdote) {
this.sacerdote = sacerdote;
}
}
