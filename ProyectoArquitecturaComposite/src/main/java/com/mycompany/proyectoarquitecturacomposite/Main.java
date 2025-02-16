package com.mycompany.proyectoarquitecturacomposite;

import java.util.Scanner;
import com.mycompany.proyectoarquitecturacomposite.modelo.GrupoEstaciones;
import com.mycompany.proyectoarquitecturacomposite.modelo.EstacionIndividual;
import com.mycompany.proyectoarquitecturacomposite.modelo.EstacionTransporte;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GrupoEstaciones transportePublico = new GrupoEstaciones("Transporte Público");

        int opcion;
        do {
            System.out.println("\n🚍 MENÚ DEL SISTEMA DE TRANSPORTE 🚇");
            System.out.println("1️⃣ Agregar estación individual");
            System.out.println("2️⃣ Crear un grupo de estaciones");
            System.out.println("3️⃣ Listar todas las estaciones");
            System.out.println("4️⃣ Buscar una estación");
            System.out.println("5️⃣ Contar el número total de estaciones");
            System.out.println("6️⃣ Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre de la nueva estación: ");
                    String nombreEstacion = scanner.nextLine();
                    transportePublico.agregarEstacion(new EstacionIndividual(nombreEstacion));
                    System.out.println("✅ Estación '" + nombreEstacion + "' agregada correctamente.");
                }

                case 2 -> {
                    System.out.print("Ingrese el nombre del grupo de estaciones: ");
                    String nombreGrupo = scanner.nextLine();
                    GrupoEstaciones nuevoGrupo = new GrupoEstaciones(nombreGrupo);
                    transportePublico.agregarEstacion(nuevoGrupo);
                    System.out.println("✅ Grupo de estaciones '" + nombreGrupo + "' creado.");
                }

                case 3 -> {
                    System.out.println("\n📌 Listado de todas las estaciones:");
                    transportePublico.listarEstaciones();
                }

                case 4 -> {
                    System.out.print("Ingrese el nombre de la estación a buscar: ");
                    String buscar = scanner.nextLine();
                    boolean encontrada = transportePublico.buscarEstacion(buscar);
                    System.out.println(encontrada ? "✅ La estación '" + buscar + "' existe en la red."
                            : "❌ La estación '" + buscar + "' no fue encontrada.");
                }

                case 5 -> System.out.println("\n📊 Número total de estaciones: " + transportePublico.contarEstaciones());

                case 6 -> System.out.println("🚪 Saliendo del sistema...");

                default -> System.out.println("⚠️ Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
