package C2S.calculador;

import C2S.empleado.Empleado;

public abstract class CalculadorDeNomina {
    public void liquidarSueldo(Empleado e){
        double sueldoCalculado = calcularSueldo(e);
        imprimirRecibo(e, sueldoCalculado);
        depositar(e.getCuentaBancaria(), sueldoCalculado);
    }

    protected abstract double calcularSueldo(Empleado e);

    protected abstract void imprimirRecibo(Empleado e, double sueldoCalculado);

    protected void depositar(String numeroDeCuenta, double sueldoCalculado){
        System.out.println("Depositando "+sueldoCalculado + " en la cuenta "+numeroDeCuenta);
    }
}
