package C6S;

public class GrillaPelicula implements IGrillaPelicula{

    private CatalogoDePeliculas catalogo = new CatalogoDePeliculas();

    @Override
    public Pelicula obtenerPelicula(String nombre) {
        Pelicula resultado = null;

        for (Pelicula p: catalogo.getCatalogo()) {
            if(p.getNombre().equals(nombre)){
                resultado = p;
                break;
            }
        }
        return resultado;
    }
}