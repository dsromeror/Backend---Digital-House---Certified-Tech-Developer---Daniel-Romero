package C2Mesas.template;

import C2Mesas.menu.Menu;
import C2Mesas.menu.MenuInfantil;

public class ProcesadorMenuInfantil extends ProcesadorDeMenus{
    @Override
    protected void armar(Menu menu) {
        System.out.println("Armando menú infantil: " +
                "\n\t\t\t\tMini Hamburguesa" +
                "\n\t\t\t\tGaseosa pequeña" +
                "\n\t\t\t\tRegalo sorpresa");
    }

    @Override
    protected double calcularPrecioDeVenta(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        return menu.getPrecioBase() + menuInfantil.getRegalo();
    }
}
