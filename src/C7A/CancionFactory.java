package C7A;

import java.util.HashMap;

public class CancionFactory {
    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();

    public static Cancion getCancion(String nombre){
        Cancion cancion = (Cancion) cancionMap.get(nombre);
        if (cancion == null){
            cancion = new Cancion(nombre);
            cancionMap.put(nombre, cancion);
            System.out.println("Creando objeto canción con el nombre: " + nombre);
        }
        return cancion;
    }
}
