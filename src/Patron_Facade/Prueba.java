package Patron_Facade;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList();
        Producto productoUno = new Producto("1", 5, 1000, "Mouse");
        Producto productoDos = new Producto("2", 5, 3000, "Teclado");
        productos.add(productoUno);
        productos.add(productoDos);
        Tarjeta tarjeta = new Tarjeta("11231321", "012", "2025/07/09");
        Direccion direccion = new Direccion("Av Monroe", "860", "1428", "CABA", "Capital Federal");

        ICompraService compraService = new CompraService();
        //compraService.procesarCompra("1",2,tarjeta,direccion,productos);
    }
}
