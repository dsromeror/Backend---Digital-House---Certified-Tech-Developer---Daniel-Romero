package C5S;

import java.time.LocalDate;

public interface ServicioDeVacunacion {
    void vacunar(String dni, LocalDate fechaProgramadaDeVacunaci√≥n); //La fecha programada de vacunaci√≥n corresponde a la que debe ser registrada en el sistema.
}

