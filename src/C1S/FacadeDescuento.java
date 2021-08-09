package C1S;

public class FacadeDescuento {
    //guarda en las variables una instancia de cada una
    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;

    //Constructor que crea las instancias
    public FacadeDescuento(){
        apiTarjeta = new ApiTarjeta();
        apiProducto = new ApiProducto();
        apiCantidad = new ApiCantidad();
    }

    //Simplifica el descuento
    public int descuento (Tarjeta tarjeta, Producto producto, int cant){
        int elDescuento = 0;
        elDescuento = elDescuento + apiCantidad.descuento(cant);
        elDescuento = elDescuento + apiProducto.descuento(producto);
        elDescuento = elDescuento + apiTarjeta.descuento(tarjeta);
        return elDescuento;
    }
}
