package com.parroquia.Vista;

import java.util.Scanner;

public class VistaGeneral {
private Scanner entrada = new Scanner(System.in);

public int menuPrincipal() {
System.out.println("\n****************************************");
System.out.println("*      SISTEMA DE GESTIÓN PARROQUIAL    *");[cite: 1]
System.out.println("*  Parroquia La Inmaculada Concepción   *");[cite: 1]
System.out.println("****************************************");
System.out.println("1. Gestión de Partidas Sacramentales");[cite: 1]
System.out.println("2. Control de Bóvedas (Cementerio)");[cite: 1]
System.out.println("3. Inventario de la Parroquia");[cite: 1]
System.out.println("4. Agenda de Misas");[cite: 1]
System.out.println("5. Salir");
System.out.print("\nPor favor, elija una opción: ");

return Integer.parseInt(entrada.nextLine());
}
}