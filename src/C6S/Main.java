package C6S;

public class Main {
    public static void main(String[] args) {
        IGrillaPelicula servicio = new GrillaPeliculaProxy();
        try {
            Pelicula pelicula = servicio.obtenerPelicula("The Artist");
            System.out.println(pelicula.getUrl());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
