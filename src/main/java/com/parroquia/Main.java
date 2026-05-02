package com.parroquia;

import com.parroquia.Controlador.GestionParroquia;

public class Main {
public static void main(String[] args) {
// Aquí se crea el controlador y se inicia el menú
GestionParroquia gestion = new GestionParroquia();
gestion.menuPrincipal();
}
}