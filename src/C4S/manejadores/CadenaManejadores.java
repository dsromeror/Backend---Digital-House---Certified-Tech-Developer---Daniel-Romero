package C4S.manejadores;

public class CadenaManejadores {
    private Manejador manejadorInicial;

    public Manejador getManejadorInicial() {
        return manejadorInicial;
    }

    public void setManejadorInicial(Manejador manejadorInicial) {
        this.manejadorInicial = manejadorInicial;
    }

    public CadenaManejadores(){
        setManejadorInicial(new ManejadorLote());
        Manejador manejadorPeso = new ManejadorPeso();

        getManejadorInicial().setSiguiente(manejadorPeso);
    }


}
