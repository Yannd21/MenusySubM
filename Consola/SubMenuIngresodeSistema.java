package Consola;

import java.util.Scanner;

public class SubMenuIngresodeSistema {
    public void mostrarSubMenu() {
        System.out.println("1. Ingresar Usuario y Contraseña");
        System.out.println("7. Regresar al menu principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese Usuario:");
                System.out.print("Usuario:");
                String usuario = scanner.nextLine();
                System.out.println("Usuario: " + usuario);
                System.out.println("Ingrese Contraseña:");
                System.out.print("Contraseña:");
                String password = scanner.nextLine();
                System.out.println("Usuario: " + password);
                break;
            case 7:
                System.out.println("Regresando al menu principal");
                break;
            default:
                System.out.println("Opcion Invalida.");
        }
    }
}