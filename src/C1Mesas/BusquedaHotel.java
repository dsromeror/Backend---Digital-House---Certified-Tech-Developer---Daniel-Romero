package C1Mesas;

public class BusquedaHotel {
    public void buscar(String fechaSalida, String fechaRegreso, String destino){
        System.out.println("Buscando hoteles con:\n"+
                            "\tFecha check-in: "+fechaSalida+
                            "\n\tFecha chek-out: "+fechaRegreso+
                            "\n\tEn la ciudad: "+destino);
    }
}
