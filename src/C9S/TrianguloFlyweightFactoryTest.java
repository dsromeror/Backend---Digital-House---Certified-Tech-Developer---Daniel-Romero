package C9S;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrianguloFlyweightFactoryTest {

    @Test
    public static void deberiaConservarElTamañoDeLaCacheCuandoIntentoAgregarUnTriangulo(){
        //DADO
        String colorTriangulo1 = "azul";
        int tamañoTriangulo1 = 5;
        TrianguloFlyweightFactory sujetoDePrueba = new TrianguloFlyweightFactory();

        //CUANDO
        sujetoDePrueba.crearTriangulo(colorTriangulo1, tamañoTriangulo1);
        sujetoDePrueba.crearTriangulo(colorTriangulo1, tamañoTriangulo1);

        //ENTONCES
        assertTrue(TrianguloFlyweightFactory.cache.size() == 1);
        //System.out.println(TrianguloFlyweightFactory.cache.size() == 1);
    }

    @Test
    public static void deberiaAmpliarElTamañoDeLaCacheCuandoIntentoAgregarUnTriangulo(){
        //DADO
        String colorTriangulo1 = "azul";
        String colorTriangulo2 = "verde";
        int tamañoTriangulo1 = 5;
        int tamañoTriangulo2 = 4;
        TrianguloFlyweightFactory sujetoDePrueba = new TrianguloFlyweightFactory();

        //CUANDO
        sujetoDePrueba.crearTriangulo(colorTriangulo1, tamañoTriangulo1);
        sujetoDePrueba.crearTriangulo(colorTriangulo2, tamañoTriangulo2);

        //ENTONCES
        assertTrue(TrianguloFlyweightFactory.cache.size() == 1);
        //System.out.println(TrianguloFlyweightFactory.cache.size() == 2);
    }

}