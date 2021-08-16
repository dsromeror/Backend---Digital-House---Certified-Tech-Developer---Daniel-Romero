package C7S;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, Computador> inventario = new HashMap<>();
    private Map<String, Computador> especificaciones = new HashMap<>();

    public Map<String, Computador> getInventario() {
        return inventario;
    }

    public void imprimirInventario(){
        for (String id: this.getInventario().keySet()) {
            Computador c = this.inventario.get(id);
            System.out.println("Computador "+id+", RAM= "+c.getRam()+", DD= "+c.getDiscoDuro());
        }
    }

    public Computador fabricarComputador(String id, String marca){
        Computador resultado = null;
        if(inventario.containsKey(id)){
            resultado = inventario.get(id);
        }else{
            Computador nuevoComputador = aplicarEspecificacionDeMarca(id, marca);
            inventario.put(id, nuevoComputador);
            resultado = nuevoComputador;
        }
        return resultado;
    }

    private Computador aplicarEspecificacionDeMarca(String id, String marca){
        Computador resultado = null;

        if(especificaciones.containsKey(marca)){
            resultado = especificaciones.get(marca);
        }else{
            if(marca.equals("Windows")){
                especificaciones.put(marca,new Computador(id, 2,128));
            }else{
                especificaciones.put(marca, new Computador(id, 16, 500));
            }
            resultado = especificaciones.get(marca);
        }
        return resultado;
    }
}
