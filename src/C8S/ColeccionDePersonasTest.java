package C8S;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColeccionDePersonasTest {

    private Persona sujetoDePrueba1;
    private Persona sujetoDePrueba2;
    private Persona sujetoDePrueba3;
    private Persona sujetoDePrueba4;
    private Persona sujetoDePrueba5;
    private Persona sujetoDePrueba6;
    private Persona sujetoDePrueba7;
    private Persona sujetoDePrueba8;
    private Persona sujetoDePrueba9;
    private Persona sujetoDePrueba10;
    ColeccionDePersonas coleccionDePersonas;


    @BeforeEach
    void prepararDatos(){
        coleccionDePersonas = new ColeccionDePersonas();
        sujetoDePrueba1 = new Persona("Addy", "Gomez", LocalDate.of(1987, 5, 6));
        sujetoDePrueba2 = new Persona("Soledad", "Jimenez", LocalDate.of(1987, 5, 6));
        sujetoDePrueba3 = new Persona("Pedro", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba4 = new Persona("Ana1", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba5 = new Persona("Ana2", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba6 = new Persona("Ana3", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba7 = new Persona("Ana4", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba8 = new Persona("Teresa", "Infante", LocalDate.of(2015, 5, 6));
        sujetoDePrueba9 = new Persona("Felipe", "Infante", LocalDate.of(1980, 5, 6));
        sujetoDePrueba10 = new Persona("Mauricio", "Infante", LocalDate.of(2015, 5, 6));
    }

    @Test
    void noDeberiaAgregarAUnaPersonaConUnNombreDeMenosDeCincoLetras(){
        //DADO

        //CUANDO
        List<Persona> resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba1);

        //ENTONCES
        assertEquals(0, resultado.size());
    }

    @Test
    void noDeberiaAgregarAUnaPersonaConUnaEdadMenorQue25Años(){
        //DADO

        //CUANDO
        List<Persona> resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba3);

        //ENTONCES
        assertEquals(0, resultado.size());
    }

    @Test
    void deberiaAgregarAUnaPersonaMayorDeEdadConUnNombreDeMasDeCincoLetras(){
        //DADO

        //CUANDO
        List<Persona> resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba2);

        //ENTONCES
        assertEquals(1, resultado.size());
    }

    @Test
    void deberiaAgregarSoloLasPersonasMayoresDeEdadConUnNombreDeMasDeCincoLetras(){
        //DADO
        List<Persona> resultado;
        int tamañoEsperado = 2;

        //CUANDO
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba1);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba2);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba3);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba4);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba5);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba6);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba7);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba8);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba9);
        resultado = coleccionDePersonas.agregarNuevaPersonaALaColeccion(sujetoDePrueba10);


        //ENTONCES
        assertEquals(tamañoEsperado, resultado.size());
    }
}