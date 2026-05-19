package com.parroquia.Servicios;

import com.parroquia.Dao.PartidaDao;
import com.parroquia.Modelo.Partida;
import java.util.List;

public class PartidaService {

private PartidaDao dao = new PartidaDao();

public String guardarNuevaPartida(Partida p) {
if (p == null) {
return "Operación cancelada.";
}

if (p.getNombreFeligres() == null || p.getNombreFeligres().trim().isEmpty()) {
return "El nombre del feligrés no puede estar vacío.";
}

if (p.getTipoSacramento() == null || p.getTipoSacramento().trim().isEmpty()) {
return "Debe ingresar el tipo de sacramento.";
}

if (dao.registrar(p)) {
return "Partida registrada correctamente.";
} else {
return "Error al guardar la partida.";
}
}

public List<Partida> obtenerListaDePartidas() {
return dao.listarTodo();
}
}