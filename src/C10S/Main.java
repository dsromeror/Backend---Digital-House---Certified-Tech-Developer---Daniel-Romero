package C10S;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        CalculadorDePromedio calculador = new CalculadorDePromedio();
        List<Integer> valores = List.of(5,20,35);
        List<Integer> valoresVacio = new ArrayList<>();

        try {
            calculador.calcularPromedio(valores);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }


    }
}
