package com.parroquia.Servicios;

import com.parroquia.Dao.PartidaDao;
import com.parroquia.Modelo.Partida;
import java.util.List;

public class PartidaService {
private PartidaDao dao = new PartidaDao();

public String guardarNuevaPartida(Partida p) {
// Regla: No dejar guardar si el nombre está vacío
if (p.getNombreFeligres().isEmpty()) {
return "Ojo: El nombre del feligrés no puede estar vacío.";[cite: 1]
}

// Regla: El tipo de sacramento debe ser válido
if (p.getTipoSacramento().equals("Seleccionar")) {
return "Debes elegir un tipo de sacramento válido.";[cite: 1]
}

if (dao.registrar(p)) {
return "¡Excelente! La partida se guardó correctamente.";[cite: 1]
} else {
return "Hubo un error al intentar guardar en la base de datos.";[cite: 1]
}
}

public List<Partida> obtenerListaDePartidas() {
return dao.listarTodo();
}
}