package C2Mesas.menu;

public abstract class Menu {
    private double precioBase;

    //Agregar atributos comunes a cada menú

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
