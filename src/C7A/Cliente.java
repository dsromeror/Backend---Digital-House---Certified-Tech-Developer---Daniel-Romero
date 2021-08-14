package C7A;

public class Cliente {
    private static final String canciones[] = {"One", "The trooper", "Don't Stop the party", "My friend of misery", "The hills", "My desire"};
    public static void main(String[] args) {
        for (int i = 0; i<10;i++){
            Cancion cancion = CancionFactory.getCancion(cancionAleatoria());
            cancion.setArtista("a".repeat(i));
            cancion.setGenero("b".repeat(i));
            cancion.sonarCancion();
        }

    }
    private static String cancionAleatoria(){
        return canciones[(int)(Math.random()*canciones.length)];
    }
}
