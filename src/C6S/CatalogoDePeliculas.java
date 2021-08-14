package C6S;

import java.util.ArrayList;

public class CatalogoDePeliculas {
    private ArrayList<Pelicula> catalogo; //Reto Opcional: Usar correctamente el patron Facade que ofrece Java y no usar ArrayList para los tipos de dato si no usar la interfaz List

    public CatalogoDePeliculas(){
        Pelicula p1 = new Pelicula("The Artist", "Colombia", "www.theartist.co");
        Pelicula p2 = new Pelicula("Avengers", "Argentina", "www.avengers.ar");
        Pelicula p3 = new Pelicula("Good Morning Vietnam", "Brasil", "www.goodmorning.br");
        setCatalogo(new ArrayList<>());
        getCatalogo().add(p1);
        getCatalogo().add(p2);
        getCatalogo().add(p3);


        //catalogo = (ArrayList<Pelicula>)List.of(new Pelicula("The Artist", "Colombia", "www.theartist.co"), new Pelicula("Avengers", "Argentina", "www.avengers.ar"), new Pelicula("Good Morning Vietnam", "Brasil", "www.goodmorning.br"));
    }

    public ArrayList<Pelicula> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Pelicula> catalogo) {
        this.catalogo = catalogo;
    }
}