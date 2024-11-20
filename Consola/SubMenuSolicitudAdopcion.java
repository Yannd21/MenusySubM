package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuSolicitudAdopcion {
    private ArrayList<String> solicitudes = new ArrayList<>(); // Lista para almacenar solicitudes de adopción

    public void mostrarSubMenu() {
        System.out.println("---- Gestión de Solicitud de Adopción ----");
        System.out.println("1. Agregar Solicitud de Adopción");
        System.out.println("2. Modificar Solicitud de Adopción");
        System.out.println("3. Buscar Solicitud de Adopción");
        System.out.println("4. Cancelar Solicitud de Adopción");
        System.out.println("5. Eliminar Solicitud de Adopción");
        System.out.println("7. Regresar al menú principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Agregar Solicitud de Adopción
                System.out.println("Agregar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud: ");
                String nuevaSolicitud = scanner.nextLine();
                solicitudes.add(nuevaSolicitud);
                System.out.println("Solicitud de Adopción Creada: " + nuevaSolicitud);
                break;

            case 2: // Modificar Solicitud de Adopción
                System.out.println("Modificar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a modificar: ");
                String solicitudActual = scanner.nextLine();
                if (solicitudes.contains(solicitudActual)) {
                    System.out.print("Ingrese la nueva descripción: ");
                    String nuevaDescripcion = scanner.nextLine();
                    int index = solicitudes.indexOf(solicitudActual);
                    solicitudes.set(index, nuevaDescripcion);
                    System.out.println("Solicitud modificada exitosamente.");
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 3: // Buscar Solicitud de Adopción
                System.out.println("Buscar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a buscar: ");
                String solicitudBuscar = scanner.nextLine();
                if (solicitudes.contains(solicitudBuscar)) {
                    System.out.println("Solicitud encontrada: " + solicitudBuscar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 4: // Cancelar Solicitud de Adopción
                System.out.println("Cancelar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a cancelar: ");
                String solicitudCancelar = scanner.nextLine();
                if (solicitudes.contains(solicitudCancelar)) {
                    System.out.println("Solicitud cancelada: " + solicitudCancelar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 5: // Eliminar Solicitud de Adopción
                System.out.println("Eliminar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a eliminar: ");
                String solicitudEliminar = scanner.nextLine();
                if (solicitudes.remove(solicitudEliminar)) {
                    System.out.println("Solicitud eliminada: " + solicitudEliminar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 7: // Regresar al menú principal
                System.out.println("Regresando al menú principal...");
                break;

            default: // Opción inválida
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}
