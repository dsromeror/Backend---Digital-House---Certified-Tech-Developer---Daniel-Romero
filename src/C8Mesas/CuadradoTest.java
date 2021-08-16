package C8Mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void calcularPerimeto() {
        Cuadrado cuadrado = new Cuadrado(5);
        double perimetro = cuadrado.calcularPerimeto();

        assertEquals(20,perimetro);
    }
}