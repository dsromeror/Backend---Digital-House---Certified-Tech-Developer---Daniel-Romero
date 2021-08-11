package C4S.manejadores;

import C4S.articulo.Articulo;

public abstract class Manejador {
    protected Manejador siguiente;
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String comprobar(Articulo a);

    public Manejador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }
}
