package C9Mesas;

import java.util.HashSet;
import java.util.Set;

public class RopaFlyweightFactory {
    public final static Set<Ropa> cache = new HashSet<>();

    public Ropa crearPrenda(String tipo){
        Ropa resultado = null;

        for (Ropa r:cache) {
            if(r.getTipo().equals(tipo)){
                resultado = r;
            }
        }

        if(resultado == null){
            resultado = new Ropa(null,tipo);
            cache.add(resultado);
        }
        return resultado;
    }
}
