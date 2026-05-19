package com.parroquia.Servicios;

import com.parroquia.Dao.BovedaDao;

public class BovedaService {

private BovedaDao dao = new BovedaDao();

public String cambiarDisponibilidad(int id, String estado) {

if (estado == null || estado.isEmpty()) {
return "El estado no puede estar vacío.";
}

if (!estado.equalsIgnoreCase("Disponible") &&
!estado.equalsIgnoreCase("Ocupada")) {
return "Estado inválido. Usa 'Disponible' u 'Ocupada'.";
}

dao.actualizarEstado(id, estado);
return "Estado de la bóveda actualizado correctamente.";
}
}