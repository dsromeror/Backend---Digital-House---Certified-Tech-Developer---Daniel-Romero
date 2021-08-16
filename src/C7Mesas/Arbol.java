package C7Mesas;

public class Arbol {
    private int alto;
    private int ancho;
    private String color;
    private String tipo;

    public Arbol(String tipo) {
        this.tipo = tipo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void descripcionArbol(){
        System.out.println("Soy un árbol de tipo "+this.tipo+" y color "+this.color + ", mi alto es "+this.alto+" y mi ancho "+this.ancho);
    }
}

