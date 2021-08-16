package C2A;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tarjeta debito = new Debito(12345,245,new Date(120,10,05),5000);
        debito.validarPago(2000);
    }
}
