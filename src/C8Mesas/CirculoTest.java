package C8Mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void calcularPerimeto() {
        Circulo circulo = new Circulo(5);
        double perimetro = circulo.calcularPerimeto();

        assertEquals(10*Math.PI,perimetro);
    }
}