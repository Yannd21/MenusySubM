package Test;

import Consola.SubMenuSolicitudAdopcion;

import java.util.Scanner;

public class TestSolicitudAdopcion {
    public static void main(String[] args) {
        SubMenuSolicitudAdopcion subMenu = new SubMenuSolicitudAdopcion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            subMenu.mostrarSubMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
            subMenu.seleccionarOpcion(opcion);
        } while (opcion != 7); // El valor 7 regresa al menú principal

        System.out.println("Saliendo del Submenú de Solicitud de Adopción...");
    }
}
