package com.parroquia.Controlador;

import com.parroquia.Dao.*;
import com.parroquia.Modelo.*;
import java.util.Scanner;

public class GestionParroquia {
    private PartidaDao partidaDao = new PartidaDao();
    private Scanner leer = new Scanner(System.in);

    public void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\n--- SISTEMA PARROQUIAL ---");
            System.out.println("1. Registrar Partida");
            System.out.println("2. Ver todas las Partidas");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: registrarPartida(); break;
                case 2: mostrarPartidas(); break;
            }
        } while (opcion != 3);
    }

    private void registrarPartida() {
        Partida p = new Partida();
        System.out.print("Tipo (Bautismo/Matrimonio): ");
        p.setTipoSacramento(leer.nextLine());
        System.out.print("Nombre del feligrés: ");
        p.setNombreFeligres(leer.nextLine());
        System.out.print("Fecha (AAAA-MM-DD): ");
        p.setFecha(leer.nextLine());
        System.out.print("Sacerdote: ");
        p.setSacerdote(leer.nextLine());
        
        if(partidaDao.registrar(p)) {
            System.out.println("¡Éxito!");
        }
    }

    private void mostrarPartidas() {
        for (Partida p : partidaDao.listarTodo()) {
            System.out.println(p.getId() + " | " + p.getNombreFeligres() + " | " + p.getTipoSacramento());
        }
    }
}