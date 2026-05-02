package com.parroquia.Servicios;

import com.parroquia.Dao.BovedaDao;

public class BovedaService {
private BovedaDao dao = new BovedaDao();

public void cambiarDisponibilidad(int id, String estado) {

dao.actualizarEstado(id, estado);
System.out.println("El servicio ha procesado el cambio de estado.");
}
}
