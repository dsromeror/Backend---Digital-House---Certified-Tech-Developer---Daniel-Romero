package C4S;

import C4S.articulo.Articulo;
import C4S.manejadores.CadenaManejadores;
import C4S.manejadores.Manejador;
import C4S.manejadores.ManejadorLote;
import C4S.manejadores.ManejadorPeso;

public class Main {
    public static void main(String[] args) {
        Articulo articuloRevisar = new Articulo("Carros",1400,1210,"Sano");

        CadenaManejadores cadena = new CadenaManejadores();

        String resultado = cadena.getManejadorInicial().comprobar(articuloRevisar);
        System.out.println(resultado);
    }
}
