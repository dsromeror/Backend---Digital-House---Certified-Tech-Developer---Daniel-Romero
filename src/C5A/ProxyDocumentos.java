package C5A;

import Patron_Proxy.IConexionInternet;

import java.util.List;

public class ProxyDocumentos implements IDocumentos {
    private Documentos documentos;
    private List<String> usuariosAutorizados;

    public ProxyDocumentos(Documentos documentos, List<String> usuariosAutorizados) {
        this.documentos = documentos;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    @Override
    public void accederDocumento(String url, String email) {
        if (this.usuariosAutorizados.contains(email))
            this.documentos.accederDocumento(url, email);
        else
            System.out.println("No tiene acceso el usuario con email: "+email);
    }

}
