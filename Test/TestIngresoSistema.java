package Test;

import Consola.SubMenuIngresodeSistema;

public class TestIngresoSistema{
    public static void main(String[] args) {
        SubMenuIngresodeSistema subMenu = new SubMenuIngresodeSistema();
        subMenu.mostrarSubMenu();
        subMenu.seleccionarOpcion(1);
    }
}