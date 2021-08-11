package C4S.articulo;

public class Articulo {
    private String nombre;
    private int lote;
    private int peso;
    private String estadoDelEnvase;

    public Articulo(String nombre, int lote, int peso, String estadoDelEnvase) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.estadoDelEnvase = estadoDelEnvase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstadoDelEnvase() {
        return estadoDelEnvase;
    }

    public void setEstadoDelEnvase(String estadoDelEnvase) {
        this.estadoDelEnvase = estadoDelEnvase;
    }
}
