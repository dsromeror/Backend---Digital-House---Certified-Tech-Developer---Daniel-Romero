package Patron_Facade;

public class Producto {
    private String productoId;
    private int cantidad;
    private double valor;
    private String descripcion;

    public Producto(String id, int cantidad, double valor, String descripcion) {
        this.productoId = id;
        this.cantidad = cantidad;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
