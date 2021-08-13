package C5Mesas;

public class Main {
    public static void main(String[]args){
        IServicioDescarga servicioDescarga = new ProxyServicioDescarga();
        servicioDescarga.descargar(2, "premium");
        servicioDescarga.descargar(3, "free");

    }
}
