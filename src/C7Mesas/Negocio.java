package C7Mesas;

public class Negocio {
    private static final int alto[] = {200,500,100};
    private static final int horizontal[] = {400,300,200};
    private static final String colores[] = {"verde","rojo","celeste"};
    private static final String tipo[] = {"Ornamentales", "Frutales"};
    public static void main(String[] args) {
        for (int i= 0;i<100;i++){
            Arbol arbol = ArbolFactory.getArbol(tipoAleatorio());
            arbol.setColor(colorAleatorio());
            arbol.descripcionArbol();
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
    private static String tipoAleatorio(){
        return tipo[(int)(Math.random()*tipo.length)];
    }
    private static String colorAleatorio(){
        return colores[(int)(Math.random()*colores.length)];
    }
    private static int altoAleatorio(){
        return alto[(int)(Math.random()*alto.length)];
    }
    private static int anchoAleatorio(){
        return horizontal[(int)(Math.random()*horizontal.length)];
    }
}
