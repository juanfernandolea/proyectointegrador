package com.parroquia.Controlador;

import com.parroquia.Modelo.Partida;
import com.parroquia.Modelo.Inventario;
import com.parroquia.Servicios.PartidaService;
import com.parroquia.Servicios.InventarioService;
import com.parroquia.Vista.VistaPartida;
import com.parroquia.Vista.VistaInventario;
import com.parroquia.Vista.VistaGeneral;

public class GestionParroquia {
private VistaGeneral vistaMenu = new VistaGeneral();
private VistaPartida vistaPartida = new VistaPartida();
private VistaInventario vistaInventario = new VistaInventario();

private PartidaService servicioPartida = new PartidaService();
private InventarioService servicioInventario = new InventarioService();

public void iniciar() {
int opcion = 0;
do {
opcion = vistaMenu.menuPrincipal();

switch (opcion) {
case 1:
// Lógica para Partidas Sacramentales
Partida nueva = vistaPartida.formularioNuevaPartida();
String resultadoP = servicioPartida.guardarNuevaPartida(nueva);
vistaPartida.mostrarMensaje(resultadoP);
break;

case 2:
System.out.println("Módulo de Bóvedas en construcción...");[cite: 1]
break;

case 3:
// Lógica para Inventario
Inventario item = vistaInventario.formularioArticulo();
String resultadoI = servicioInventario.registrarArticulo(item);
System.out.println(resultadoI);
break;

case 4:
System.out.println("Módulo de Misas en construcción...");[cite: 1]
break;

case 5:
System.out.println("Cerrando el sistema del despacho. ¡Hasta luego!");[cite: 1]
break;

default:
System.out.println("Opción no válida.");
}
} while (opcion != 5);
}
}