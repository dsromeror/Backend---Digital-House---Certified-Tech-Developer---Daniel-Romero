package C9Mesas;

import C8S.Persona;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RopaFlyweightFactoryTest {

    @Test
    public void corroborarQueLaFabricaCreaUnaPrenda(){
        //Dado
        String tipo = "Pantalon";

        RopaFlyweightFactory sujetoDePrueba = new RopaFlyweightFactory();
        Ropa result = sujetoDePrueba.crearPrenda(tipo);

        //Entonces
        assertEquals(tipo,result.getTipo());
    }

    @Test
    public void validarQueElTamañoDeLaCacheSeaMenorAlosPedidosCreados(){
        //Dado
        int tamañoEsperado = 2;

        String pantalon1 = "Pantalon";
        String pantalon2 = "Pantalon";
        String pantalon3 = "Pantalon";
        String pantalon4 = "Pantalon";
        String pantalon5 = "Pantalon";
        String remera1 = "Remera";
        String remera2 = "Remera";
        RopaFlyweightFactory sujetoDePrueba = new RopaFlyweightFactory();
        //Dado
        sujetoDePrueba.crearPrenda(pantalon1);
        sujetoDePrueba.crearPrenda(pantalon2);
        sujetoDePrueba.crearPrenda(pantalon3);
        sujetoDePrueba.crearPrenda(pantalon4);
        sujetoDePrueba.crearPrenda(pantalon5);
        sujetoDePrueba.crearPrenda(remera1);
        sujetoDePrueba.crearPrenda(remera2);
        //Entonces
        assertTrue(RopaFlyweightFactory.cache.size() == tamañoEsperado);
    }


}