package C9S;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrianguloFlyweightFactory {

    public final static Set<Triangulo> cache = new HashSet<>();

    /**
     *
     * @param color
     * @param tamaño
     * @return
     */
    public Triangulo crearTriangulo(String color, int tamaño){
        Triangulo resultado = null;

        for(Triangulo t: cache){
            if(t.getColor().equals(color)){
                t.setTamaño(tamaño);
                resultado = t;
            }
        }

        if(resultado == null){
            resultado = new Triangulo(color, tamaño);
            cache.add(resultado);
        }

        return resultado;

    }
}

