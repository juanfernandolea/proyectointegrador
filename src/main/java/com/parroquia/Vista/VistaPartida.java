package com.parroquia.Vista;

import com.parroquia.Modelo.Partida;
import java.util.Scanner;

public class VistaPartida {
private Scanner entrada = new Scanner(System.in);

public Partida formularioNuevaPartida() {
System.out.println("\n--- REGISTRO DE NUEVA PARTIDA SACRAMENTAL ---");[cite: 1]

System.out.print("Tipo de sacramento (Bautismo, Matrimonio, etc.): ");[cite: 1]
String tipo = entrada.nextLine();

System.out.print("Nombre completo del feligrés: ");[cite: 1]
String nombre = entrada.nextLine();

System.out.print("Fecha del evento (DD/MM/AAAA): ");[cite: 1]
String fecha = entrada.nextLine();

System.out.print("Sacerdote que celebró: ");[cite: 1]
String sacerdote = entrada.nextLine();

return new Partida(tipo, nombre, fecha, sacerdote);
}

public void mostrarMensaje(String mensaje) {
System.out.println(">>> " + mensaje);
}
}