package C7Mesas;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static final Map<String, Arbol> arbolMap = new HashMap<>();
    private static final Map<String, Arbol> caracteristicas = new HashMap<>();

    public static Arbol getArbol(String tipo){
        Arbol arbol = (Arbol) arbolMap.get(tipo);
        if(arbol == null){
            arbol = new Arbol(tipo);
            arbolMap.put(tipo, arbol);
            System.out.println("Creando objeto árbol de tipo: "+tipo);
        }
        return arbol;
    }
}
