package C5S;

import java.time.LocalDate;

public class Cliente {

    public static void main(String[] args) {
        ServicioDeVacunacion servicio = new ProxyServicioDeVacunacion();
        servicio.vacunar("123456", LocalDate.of(2021, 8, 14));
    }
}
