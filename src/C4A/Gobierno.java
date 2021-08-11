package C4A;

public abstract class Gobierno {
    protected Gobierno sigUsuario;
    public abstract void procesarDocumento(String contenido, Integer tipo);

    public Gobierno setSigUsuario(Gobierno sigUsuario) {
        this.sigUsuario = sigUsuario;
        return this;
    }
}
