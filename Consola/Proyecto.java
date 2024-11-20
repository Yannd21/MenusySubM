package Consola;

import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        SubMenuAdoptante subMenuAdoptante = new SubMenuAdoptante();

        SubMenuIngresodeSistema subMenuIngresodeSistema = new SubMenuIngresodeSistema();

        SubMenuLugarAdopcion subMenuLugarAdopcion = new SubMenuLugarAdopcion();

        SubMenuMascotas subMenuMascotas = new SubMenuMascotas();

        SubMenuSolicitudAdopcion subMenuSolicitudAdopcion = new SubMenuSolicitudAdopcion();

        SubMenuSolicitudAdopcionTemp subMenuSolicitudAdopcionTemp = new SubMenuSolicitudAdopcionTemp();

        int opcion;

        do {
            menu.mostrarMenu();
            System.out.print("Seleccione una Opcion:");
            opcion = scanner.nextInt();
//Gestion:
            switch (opcion) {
                case 1: //Ingreso Sistema
                    int subOpcion1;
                    do {
                        subMenuIngresodeSistema.mostrarSubMenu();
                        System.out.println("--Ingrese los Datos--");
                        subOpcion1 = scanner.nextInt();
                        subMenuIngresodeSistema.seleccionarOpcion(subOpcion1);
                    } while (subOpcion1 != 7); // Regresar al menú principal
                    break;

                case 2: //Adoptantes
                    int subOpcion2;
                    do {
                        subMenuAdoptante.mostrarSubMenu();
                        System.out.print("Seleccione una Opcion del Submenu: ");
                        subOpcion2 = scanner.nextInt();
                        subMenuAdoptante.seleccionarOpcion(subOpcion2);
                    } while (subOpcion2 != 7); // Regresar al menú principal
                    break;
                case 3: //Lugar Adopcion
                    int subOpcion3;
                    do {
                        subMenuLugarAdopcion.mostrarSubMenu();
                        System.out.print("Seleccione una Opcion del Submenu: ");
                        subOpcion3 = scanner.nextInt();
                        subMenuLugarAdopcion.seleccionarOpcion(subOpcion3);
                    } while (subOpcion3 !=7); // Regresar menu principal
                case 4: //Mascotas
                    int subOpcion4;
                    do {
                        subMenuMascotas.mostrarSubMenu();
                        System.out.println("Seleccione una Opcion del Submenu: ");
                        subOpcion4 = scanner.nextInt();
                        subMenuMascotas.seleccionarOpcion(subOpcion4);
                    }while (subOpcion4 !=7);
                case 5: //Solicitudes
                    int subOpcion5;
                    do {
                        subMenuSolicitudAdopcion.mostrarSubMenu();
                        System.out.println("Seleccione una Opcion del Submenu: ");
                        subOpcion5 = scanner.nextInt();
                        subMenuSolicitudAdopcion.seleccionarOpcion(subOpcion5);
                    } while (subOpcion5 !=7);
                case 6: //Solicitudes Temporales
                    int subOpcion6;
                    do {
                        subMenuSolicitudAdopcionTemp.mostrarSubMenu();
                        System.out.println("Seleccione una Opcion del Submenu: ");
                        subOpcion6 = scanner.nextInt();
                        subMenuSolicitudAdopcionTemp.seleccionarOpcion(subOpcion6);
                    }while (subOpcion6 !=7);
                case 8: // Salir
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
