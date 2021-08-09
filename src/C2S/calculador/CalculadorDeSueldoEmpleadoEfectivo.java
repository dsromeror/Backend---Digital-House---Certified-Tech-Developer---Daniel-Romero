package C2S.calculador;

import C2S.empleado.Empleado;
import C2S.empleado.EmpleadoEfectivo;

public class CalculadorDeSueldoEmpleadoEfectivo extends CalculadorDeNomina{
    @Override
    protected double calcularSueldo(Empleado e) {
        EmpleadoEfectivo empleado = (EmpleadoEfectivo) e;
        double sueldo = empleado.getSueldoBasico() - empleado.getDescuentos() + empleado.getPremios();
        return sueldo;
    }

    @Override
    protected void imprimirRecibo(Empleado e, double sueldoCalculado) {
        System.out.println("Imprimiendo recibo físico");
    }

}
