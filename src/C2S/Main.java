package C2S;

import C2S.calculador.CalculadorDeNomina;
import C2S.calculador.CalculadorDeSueldoEmpleadoContratado;
import C2S.calculador.CalculadorDeSueldoEmpleadoEfectivo;
import C2S.empleado.Empleado;
import C2S.empleado.EmpleadoContratado;
import C2S.empleado.EmpleadoEfectivo;

public class Main {
    public static void main(String[] args) {
        CalculadorDeNomina calculadorEmpleadoContratado = new CalculadorDeSueldoEmpleadoContratado();
        EmpleadoContratado empleado1 = new EmpleadoContratado();
        empleado1.setNombre("Daniel");
        empleado1.setApellido("Romero");
        empleado1.setCuentaBancaria("12155121");
        empleado1.setCantidadHoras(10);
        empleado1.setValorPorHora(20);

        CalculadorDeNomina calculadorEmpleadoEfectivo = new CalculadorDeSueldoEmpleadoEfectivo();
        EmpleadoEfectivo empleado2 = new EmpleadoEfectivo();
        empleado2.setNombre("Steven");
        empleado2.setApellido("Rodríguez");
        empleado2.setCuentaBancaria("121515121");
        empleado2.setSueldoBasico(1000);
        empleado2.setDescuentos(200);
        empleado2.setPremios(50);

        calculadorEmpleadoContratado.liquidarSueldo(empleado1);
        calculadorEmpleadoEfectivo.liquidarSueldo(empleado2);
    }
}
