package C4S.manejadores;

import C4S.articulo.Articulo;

public class ManejadorPeso extends Manejador{
    @Override
    public String comprobar(Articulo a) {
        this.nombre = "Manejador de peso";
        boolean esAceptado = (a.getPeso() >=1200) && (a.getPeso()<=1300);
        String resultado = "Producto OK";

        if (!esAceptado){
            resultado = "Producto rechazado por peso";
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
