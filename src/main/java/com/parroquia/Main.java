package com.parroquia;

import com.parroquia.Controlador.GestionParroquia;

public class Main {
public static void main(String[] args) {
// Mensaje de bienvenida para saber que el programa arrancó
System.out.println("Iniciando el Sistema de Gestión - Parroquia La Inmaculada Concepción...");[cite: 1]

try {
// Creamos el "Director de Orquesta" (Controlador)
GestionParroquia despacho = new GestionParroquia();

// Le decimos al controlador que tome el mando
despacho.iniciar();[cite: 1]

} catch (Exception e) {
// Por si algo falla feo al arrancar, que nos diga qué pasó
System.out.println("Vaya, el sistema no pudo arrancar.");
System.out.println("Error técnico: " + e.getMessage());
}
}
}