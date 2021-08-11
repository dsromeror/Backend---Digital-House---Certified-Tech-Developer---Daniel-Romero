package C4S.manejadores;

import C4S.articulo.Articulo;

public class ManejadorLote extends Manejador{
    @Override
    public String comprobar(Articulo a) {
        this.setNombre("Manejador de lote");
        boolean esAceptable = (a.getLote() >= 1000 && a.getLote() <= 2000);
        String resultado = "Producto: OK";

        if (!esAceptable){
            resultado = "Producto rechazado por lote";
        }else{
            boolean soyElUltimo = this.siguiente == null;
            if (!soyElUltimo){
                resultado = this.siguiente.comprobar(a);
            }
        }
        System.out.println(this.getNombre() + ": " + resultado);
        return resultado;
    }
}
