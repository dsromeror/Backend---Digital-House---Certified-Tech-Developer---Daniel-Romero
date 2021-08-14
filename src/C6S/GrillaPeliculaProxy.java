package C6S;

public class GrillaPeliculaProxy implements IGrillaPelicula{

    private IP ip;

    public GrillaPeliculaProxy(){
        ip = new IP();
        ip.setDireccion("030.255.255.255");
    }

    @Override
    public Pelicula obtenerPelicula(String nombre) throws Exception {
        GrillaPelicula servicioConcreto = new GrillaPelicula();
        Pelicula pelicula = servicioConcreto.obtenerPelicula(nombre);

        if(pelicula != null){ //Si la película existe
            boolean sePuedeReproducirLaPelicula = ip.getPais().equals(pelicula.getPais());
            if(sePuedeReproducirLaPelicula){
                return pelicula;
            }else{
                throw new Exception("No es posible reproducir la película " + pelicula.getNombre() + " en este país");
            }
        }else{
            throw new Exception("No se encontró la película " + nombre + " en el catálogo");
        }
    }
}