package C2A;

import java.util.Date;

public class Credito extends Tarjeta{
    private double limite;
    private double saldoUtilizado;

    public Credito(int numerosFrente, int codigoSeguridad, Date fechaExpiracion, double limite, double saldoUtilizado) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    protected void procesarPago(double saldo) {
        if (saldo<=limite){
            System.out.println("El paso se encuentra autorizado");
        }else{
            System.out.println("El pago no se encuentra autorizado");
        }
    }
}
