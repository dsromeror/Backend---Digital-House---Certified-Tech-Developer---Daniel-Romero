package C2Mesas;

import C2Mesas.menu.Menu;
import C2Mesas.menu.MenuClasico;
import C2Mesas.menu.MenuInfantil;
import C2Mesas.menu.MenuVegetariano;
import C2Mesas.template.ProcesadorDeMenus;
import C2Mesas.template.ProcesadorMenuClasico;
import C2Mesas.template.ProcesadorMenuInfantil;
import C2Mesas.template.ProcesadorMenuVegetariano;

public class Main {
    public static void main(String[] args) {
/*
        ProcesadorDeMenus procesadorClasico = new ProcesadorMenuClasico();
        MenuClasico menuClasico = new MenuClasico();
        menuClasico.setPrecioBase(500);
        procesadorClasico.procesarMenu(menuClasico);
        procesadorClasico*/

        /*
        ProcesadorDeMenus procesadorMenuInfantil = new ProcesadorMenuInfantil();
        Menu menuInfantil = new MenuClasico();
        menuInfantil.setPrecioBase(500);
        ((MenuInfantil)menuInfantil).setRegalo(200);
        ((ProcesadorDeMenus)procesadorMenuInfantil).procesarMenu(menuInfantil);*/

        ProcesadorDeMenus procesadorClasico = new ProcesadorMenuClasico();
        ProcesadorDeMenus procesadorVegetariano = new ProcesadorMenuVegetariano();
        ProcesadorDeMenus procesadorInfantil = new ProcesadorMenuInfantil();

        Menu menuClasico = new MenuClasico();
        menuClasico.setPrecioBase(500.00);

        Menu menuVeggie = new MenuVegetariano();
        menuVeggie.setPrecioBase(500.00);
        ((MenuVegetariano)menuVeggie).setPrecioEnvase(150.00);

        Menu menuInf = new MenuInfantil();
        menuInf.setPrecioBase(500);
        ((MenuInfantil)menuInf).setRegalo(200.00);

        System.out.println("----------------------------");
        procesadorClasico.procesarMenu(menuClasico);
        System.out.println("----------------------------");
        procesadorVegetariano.procesarMenu(menuVeggie);
        System.out.println("----------------------------");
        procesadorInfantil.procesarMenu(menuInf);

    }
}
