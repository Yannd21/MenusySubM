package Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuLugarAdopcion {
    private ArrayList<String> lugares = new ArrayList<>();
    public void mostrarSubMenu() {
        System.out.println("---- Gestión de Lugar de Adopcion ----");
        System.out.println("1. Crear lugar de adopcion");
        System.out.println("2. Modificar lugar de adopcion");
        System.out.println("3. Buscar lugar de adopcion");
        System.out.println("4. Eliminar lugar de adopcion");
        System.out.println("7. Regresar al menu principal");
    }
    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese Lugar de Adopcion:");
                System.out.print("Luagar de Adopcion:");
                String lugarAdp = scanner.nextLine();
                System.out.println("Lugar de Adopcion Creado: " + lugarAdp);
                break;
            case 2:
                System.out.println("Modificar Lugar de Adopcion:");
                System.out.print("Ingrese el lugar de adopción a modificar: ");
                String lugarActual = scanner.nextLine();
                if (lugares.contains(lugarActual)) {
                    System.out.print("Ingrese el nuevo nombre del lugar: ");
                    String nuevoLugar = scanner.nextLine();
                    int index = lugares.indexOf(lugarActual);
                    lugares.set(index, nuevoLugar);
                    System.out.println("Lugar de Adopcion modificado: " + nuevoLugar);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 3:
                System.out.println("Buscar Lugar de Adopcion:");
                System.out.print("Ingrese el nombre del lugar a buscar: ");
                String lugarBusqueda = scanner.nextLine();
                if (lugares.contains(lugarBusqueda)) {
                    System.out.println("Lugar de Adopción encontrado: " + lugarBusqueda);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 4:
                System.out.println("Eliminar Lugar de Adopcion:");
                System.out.print("Ingrese el lugar de adopción a eliminar: ");
                String lugarEliminar = scanner.nextLine();
                if (lugares.remove(lugarEliminar)) {
                    System.out.println("Lugar de Adopcion eliminado: " + lugarEliminar);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 7:
                System.out.println("Regresando al menu principal");
                break;
            default:
                System.out.println("Opcion Invalida.");
        }
    }
}
