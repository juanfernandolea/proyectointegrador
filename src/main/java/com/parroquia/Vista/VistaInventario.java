package com.parroquia.Vista;

import com.parroquia.Modelo.Inventario;
import java.util.Scanner;

public class VistaInventario {
private Scanner entrada = new Scanner(System.in);

public Inventario formularioArticulo() {
System.out.println("\n--- ENTRADA DE INVENTARIO PARROQUIAL ---");
Inventario objeto = new Inventario();

System.out.print("Nombre del artículo o bien: ");
objeto.setNombreArticulo(entrada.nextLine());

System.out.print("Cantidad que ingresa: ");
objeto.setCantidad(Integer.parseInt(entrada.nextLine()));

return objeto;
}
}
