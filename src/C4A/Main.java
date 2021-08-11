package C4A;

import C4A.template.Diputados;
import C4A.template.Ministros;
import C4A.template.Presidente;

public class Main {
    public static void main(String[] args) {
        Gobierno usuario1 = new Diputados();
        Gobierno usuario2 = new Ministros();
        Gobierno usuario3 = new Presidente();

        usuario2.setSigUsuario(usuario3);
        usuario1.setSigUsuario(usuario2);

        System.out.println("-----------------------------------------");
        usuario1.procesarDocumento("Contenido de un documento reservado",1);
        usuario2.procesarDocumento("Contenido de un documento reservado",1);
        usuario3.procesarDocumento("Contenido de un documento reservado",1);
        System.out.println("-----------------------------------------");
        usuario1.procesarDocumento("Contenido de un documento secreto",2);
        usuario2.procesarDocumento("Contenido de un documento secreto",2);
        usuario3.procesarDocumento("Contenido de un documento secreto",2);
        System.out.println("-----------------------------------------");
        usuario1.procesarDocumento("Contenido de un documento muy secreto",3);
        usuario2.procesarDocumento("Contenido de un documento muy secreto",3);
        usuario3.procesarDocumento("Contenido de un documento muy secreto",3);
    }
}
