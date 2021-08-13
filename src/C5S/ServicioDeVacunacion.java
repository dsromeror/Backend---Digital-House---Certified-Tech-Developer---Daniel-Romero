package C5S;

import java.time.LocalDate;

public interface ServicioDeVacunacion {
    void vacunar(String dni, LocalDate fechaProgramadaDeVacunación); //La fecha programada de vacunación corresponde a la que debe ser registrada en el sistema.
}

