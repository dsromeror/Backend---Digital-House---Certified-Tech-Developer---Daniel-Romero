package C2Mesas.template;

import C2Mesas.menu.Menu;
import C2Mesas.menu.MenuClasico;

public class ProcesadorMenuClasico extends ProcesadorDeMenus{

    @Override
    protected void armar(Menu menu) {
        System.out.println("Armando menú clásico (adulto):" +
                "\n\t\t\t\tHamburguesa" +
                "\n\t\t\t\tPapas fritas" +
                "\n\t\t\t\tGaseosa");
    }

    @Override
    protected double calcularPrecioDeVenta(Menu menu) {
        return menu.getPrecioBase();
    }

}
