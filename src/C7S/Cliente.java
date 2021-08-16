package C7S;

public class Cliente {
    public static void main(String[] args) {
        Factory fabricaDeComputadores = new Factory();

        fabricaDeComputadores.fabricarComputador("1","Mac");
        fabricaDeComputadores.fabricarComputador("2","Windows");
        fabricaDeComputadores.fabricarComputador("3","Windows");
        fabricaDeComputadores.fabricarComputador("4","Mac");
        fabricaDeComputadores.fabricarComputador("1","Mac");

        System.out.println("Computadores creados: "+Computador.instanciasActivas);
        fabricaDeComputadores.imprimirInventario();

    }
}
