package C4A.template;

import C4A.Gobierno;

public class Ministros extends Gobierno {
    @Override
    public void procesarDocumento(String contenido, Integer tipo) {
        if (tipo.equals(1) || tipo.equals(2))
            System.out.println("Puedo leer el "+ contenido+" del documento "+getClass().getName());
        else if(this.sigUsuario != null)
            System.out.println("No tengo acceso, solo puedo ver hasta el tipo 2 porque soy "+getClass().getName());
            //this.sigUsuario.procesarDocumento(contenido,tipo);
    }
}
