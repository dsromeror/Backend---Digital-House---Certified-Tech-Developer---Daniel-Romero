package C2Mesas.template;

import C2Mesas.menu.Menu;
import C2Mesas.menu.MenuVegetariano;

public class ProcesadorMenuVegetariano extends ProcesadorDeMenus{
    @Override
    protected void armar(Menu menu) {
        System.out.println("Armando menú vegetariano:" +
                "\n\t\t\t\tHamburguesa de tofu" +
                "\n\t\t\t\tEnsalada" +
                "\n\t\t\t\tJugo natural");
    }

    @Override
    protected double calcularPrecioDeVenta(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        return menu.getPrecioBase()*1.01 + menuVegetariano.getPrecioEnvase();
    }
}
