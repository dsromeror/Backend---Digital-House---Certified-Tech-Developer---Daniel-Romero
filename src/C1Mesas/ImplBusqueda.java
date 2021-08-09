package C1Mesas;

public class ImplBusqueda {
    private BusquedaVuelo vuelo;
    private  BusquedaHotel hotel;

    public ImplBusqueda(){
        this.vuelo = new BusquedaVuelo();
        this.hotel = new BusquedaHotel();
    }
    public void buscar(String fechaSalida, String fechaRegreso, String origen, String destino){
        vuelo.buscar(fechaSalida,fechaRegreso,origen,destino);
        hotel.buscar(fechaSalida,fechaRegreso,destino);
    }
}
