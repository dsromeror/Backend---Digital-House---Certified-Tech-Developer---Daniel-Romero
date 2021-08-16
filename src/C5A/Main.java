package C5A;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> usuariosAutorizados = new ArrayList<>();
        usuariosAutorizados.add("daniel@gmail.com");
        usuariosAutorizados.add("steven@gmail.com");
        Documentos doc1 = new Documentos();
        doc1.setContenido("Página de búsquedas");
        doc1.setId(1);
        doc1.setUrl("www.google.com");
        Documentos doc2 = new Documentos();
        doc2.setContenido("Red social");
        doc2.setId(2);
        doc2.setUrl("www.facebook.com");
        Documentos doc3 = new Documentos();
        doc3.setContenido("Página de videos");
        doc3.setId(3);
        doc3.setUrl("www.youtube.com");
        IDocumentos proxy;
        proxy = new ProxyDocumentos(new Documentos(),usuariosAutorizados);
        proxy.accederDocumento(doc1.getUrl(), "daniel@gmail.com");
        proxy.accederDocumento(doc2.getUrl(), "steven@gmail.com");
        proxy.accederDocumento(doc3.getUrl(), "prueba@gmail.com");

    }
}
