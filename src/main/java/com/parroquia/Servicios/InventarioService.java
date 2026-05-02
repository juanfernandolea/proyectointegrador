package com.parroquia.Servicios;

import com.parroquia.Dao.InventarioDao;
import com.parroquia.Modelo.Inventario;

public class InventarioService {
private InventarioDao dao = new InventarioDao();

public String registrarArticulo(Inventario i) {
// Regla: No permitir cantidades negativas
if (i.getCantidad() < 0) {
return "Error: No puedes ingresar cantidades negativas.";
}

dao.agregarArticulo(i);
return "Artículo registrado en el inventario.";
}
}
