package C5S;

import java.time.LocalDate;

public class ProxyServicioDeVacunacion implements ServicioDeVacunacion{

    @Override
    public void vacunar(String dni, LocalDate fechaProgramadaDeVacunación) {
        boolean laFechaEsValida = validarLaFecha(fechaProgramadaDeVacunación);

        if(laFechaEsValida){
            ServicioDeVacunacion servicioConcreto = new ServicioDeVacunacionConcreto();
            servicioConcreto.vacunar(dni, LocalDate.now());
        }else{
            System.out.println("No sea vivo, aún no puede vacunarse :p");
        }
    }

    private boolean validarLaFecha(LocalDate fechaProgramada) {
        LocalDate fechaDeHoy = LocalDate.now();

        return fechaProgramada.isBefore(fechaDeHoy) || fechaProgramada.isEqual(fechaDeHoy);
    }
}

