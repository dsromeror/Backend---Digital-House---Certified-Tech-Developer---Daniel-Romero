package C5S;

import java.time.LocalDate;

//Esta clase no debe ser modificada
public class ServicioDeVacunacionConcreto implements ServicioDeVacunacion{
    @Override
    public void vacunar(String dni, LocalDate fechaProgramadaDeVacunaci√≥n) {
        System.out.println("La persona con DNI " + dni + " fue vacunada en la fecha " + fechaProgramadaDeVacunaci√≥n.toString());
    }
}
