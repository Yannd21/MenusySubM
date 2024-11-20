package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuAdoptante {
    private ArrayList<String> adoptantes = new ArrayList<>();

    public void mostrarSubMenu() {
        System.out.println("---- Gestión de Adoptantes ----");
        System.out.println("1. Crear adoptante");
        System.out.println("2. Modificar adoptante");
        System.out.println("3. Consultar adoptante");
        System.out.println("4. Eliminar adoptante");
        System.out.println("7. Regresar al menu principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Crear adoptante
                System.out.println("Ingrese los Datos del Adoptante:");
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                adoptantes.add(nombre);
                System.out.println("Adoptante Creado: " + nombre);
                break;

            case 2: // Modificar adoptante
                System.out.println("Modificar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a modificar: ");
                String nombreActual = scanner.nextLine();
                if (adoptantes.contains(nombreActual)) {
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    int index = adoptantes.indexOf(nombreActual);
                    adoptantes.set(index, nuevoNombre);
                    System.out.println("Adoptante modificado: " + nuevoNombre);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 3: // Consultar adoptante
                System.out.println("Consultar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a consultar: ");
                String nombreConsulta = scanner.nextLine();
                if (adoptantes.contains(nombreConsulta)) {
                    System.out.println("Adoptante encontrado: " + nombreConsulta);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 4: // Eliminar adoptante
                System.out.println("Eliminar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                if (adoptantes.remove(nombreEliminar)) {
                    System.out.println("Adoptante eliminado: " + nombreEliminar);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 7: // Salir
                System.out.println("Regresando al menu principal");
                break;

            default: // Opción inválida
                System.out.println("Opcion Invalida.");
        }
    }
}

