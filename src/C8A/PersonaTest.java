package C8A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void nombreCompleto() {
        Persona persona = new Persona("Daniel","Romero","dsromeror@unal.edu.co",25);
        String nombreCompleto = persona.nombreCompleto();

        assertEquals("Daniel Romero",nombreCompleto);

    }

    @Test
    public void esMayor() {
        Persona persona = new Persona("Daniel","Romero","dsromeror@unal.edu.co",5);
        boolean esMayor = persona.esMayor();

        assertTrue(esMayor);

    }
}