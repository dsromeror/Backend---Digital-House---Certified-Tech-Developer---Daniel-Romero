package C2Mesas.template;

import C2Mesas.menu.Menu;

public abstract class ProcesadorDeMenus {
    public void procesarMenu(Menu menu){
        armar(menu);
        System.out.println("El precio de su menú es: "+calcularPrecioDeVenta(menu));
    }

    protected abstract void armar(Menu menu);//Método template

    protected abstract double calcularPrecioDeVenta(Menu menu); //Método template
}
