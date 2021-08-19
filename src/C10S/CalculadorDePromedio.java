package C10S;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculadorDePromedio {

    private static final Logger logger = Logger.getLogger(CalculadorDePromedio.class);

    public void calcularPromedio(List<Integer> valores) throws Exception {
        logger.debug("Iniciando metodo calcular promedio()" + valores.toString());

        if(valores.size() >0 ){

            if(valores.size() > 5 ){
                logger.info("La lista es mayor que 5");
            }

            if(valores.size()>10){
                logger.info("La lista es mayor que 10");
            }
        }else{
            throw new Exception("La lista no tiene elementos!!!");
        }

        //Calcular el promedio
        double resultado = 0;
        for (int v:valores) {
            resultado += v;
        }

        double promedio = resultado/valores.size();
        logger.info("La lista tiene un promedio de: " + promedio);

        //Encontrar el número mayor
        logger.info("El número máximo de la lista es de : " + Collections.max(valores));
        //Encontrar el número menor
        logger.info("El número mínimo de la lista es de : " + Collections.min(valores));

        logger.debug("Terminó la ejecución del metodo calcular promedio()");
    }
}
