package C5A;

public class Documentos implements IDocumentos{
    private int id;
    private String url;
    private String contenido;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void accederDocumento(String url, String email) {
        System.out.println("Accediendo al documento con la url: "+url+
                "\n\tel email del usuario es: "+email+
                "\n-----------------------------------------");
    }
}
