package C8Mesas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {
    private Figura circulo;
    private Figura cuadrado;

    @BeforeEach
    void prepararDatos(){
        circulo = new Circulo(5);
        cuadrado = new Cuadrado(5);
    }

    @Test
    void calcularPerimetoCuadrado() {
        Cuadrado cuadrado = new Cuadrado(5);
        double perimetro = cuadrado.calcularPerimeto();

        assertEquals(20,perimetro);
    }

    @Test
    void calcularPerimetoCirculo() {
        Circulo circulo = new Circulo(5);
        double perimetro = circulo.calcularPerimeto();

        assertEquals(10*Math.PI,perimetro);
    }
}
