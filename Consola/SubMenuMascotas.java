package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuMascotas {
    private ArrayList<String> mascotas = new ArrayList<>();

    public void mostrarSubMenu() {
        System.out.println("---- Gestión de Mascotas ----");
        System.out.println("1. Agregar Mascota");
        System.out.println("2. Modificar Mascota");
        System.out.println("3. Buscar Mascota");
        System.out.println("4. Eliminar Mascota");
        System.out.println("7. Regresar al menu principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Agregar Mascota
                System.out.println("Ingrese los Datos de la Mascota:");
                System.out.print("Nombre de la Mascota: ");
                String nombreMascota = scanner.nextLine();
                mascotas.add(nombreMascota);
                System.out.println("Mascota Creada: " + nombreMascota);
                break;

            case 2: // Modificar Mascota
                System.out.println("Modificar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a modificar: ");
                String nombreActual = scanner.nextLine();
                if (mascotas.contains(nombreActual)) {
                    System.out.print("Ingrese el nuevo nombre de la mascota: ");
                    String nuevoNombre = scanner.nextLine();
                    int index = mascotas.indexOf(nombreActual);
                    mascotas.set(index, nuevoNombre);
                    System.out.println("Mascota modificada: " + nuevoNombre);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 3: // Buscar Mascota
                System.out.println("Buscar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a buscar: ");
                String nombreBusqueda = scanner.nextLine();
                if (mascotas.contains(nombreBusqueda)) {
                    System.out.println("Mascota encontrada: " + nombreBusqueda);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 4: // Eliminar Mascota
                System.out.println("Eliminar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                if (mascotas.remove(nombreEliminar)) {
                    System.out.println("Mascota eliminada: " + nombreEliminar);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 7: // Regresar al menú principal
                System.out.println("Regresando al menú principal...");
                break;

            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}

