package Test;

import Consola.SubMenuAdoptante;

import java.util.Scanner;

public class TestAdoptante {
    public static void main(String[] args) {
        SubMenuAdoptante subMenu = new SubMenuAdoptante();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            subMenu.mostrarSubMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
            subMenu.seleccionarOpcion(opcion);
        } while (opcion != 7); // El valor 6 regresa al menú principal

        System.out.println("Saliendo del Submenú de Adoptantes...");
    }
}

