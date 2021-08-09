package C2S.calculador;

import C2S.empleado.Empleado;
import C2S.empleado.EmpleadoContratado;

public class CalculadorDeSueldoEmpleadoContratado extends CalculadorDeNomina{
    @Override
    protected double calcularSueldo(Empleado e) {
        EmpleadoContratado empleado = (EmpleadoContratado) e;
        double sueldo = empleado.getCantidadHoras()*empleado.getValorPorHora();
        return sueldo;
    }

    @Override
    protected void imprimirRecibo(Empleado e, double sueldoCalculado) {
        System.out.println("Generando recibo virtual");
    }

}
