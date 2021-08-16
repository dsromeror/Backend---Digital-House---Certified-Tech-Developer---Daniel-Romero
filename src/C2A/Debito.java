package C2A;

import java.util.Date;

public class Debito extends Tarjeta{
    private double saldoDisponible;

    public Debito(int numerosFrente, int codigoSeguridad, Date fechaExpiracion, double saldoDisponible) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    protected void procesarPago(double saldo) {
        if (saldo<saldoDisponible){
            System.out.println("Pago autorizado");
        }else{
            System.out.println("Pago no autorizado");
        }
    }
}
