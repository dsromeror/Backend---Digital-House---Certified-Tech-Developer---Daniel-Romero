package C2A;

import C2Mesas.template.ProcesadorMenuClasico;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta {
    private int numerosFrente;
    private int codigoSeguridad;
    private Date fechaExpiracion;

    public Tarjeta(int numerosFrente, int codigoSeguridad, Date fechaExpiracion) {
        this.numerosFrente = numerosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public void validarPago(double saldo){
        estaVencida();
        validarFecha();
        procesarPago(saldo);
    }

    protected void validarFecha(){
        if(estaVencida()){
            System.out.println("No se encuentra vencida");
        }else{
            System.out.println("Se encuentra vencida");
        }
    }

    protected abstract void procesarPago(double saldo);

    public boolean estaVencida(){
        Date hoy = java.sql.Date.valueOf(LocalDate.now());

        if (!fechaExpiracion.after(hoy)) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(int numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}
/*
    public void hacerPizza(){
        prepararMasa();
        preCocinarMasa();
        prepararIngredientes();
        agregarIngredientes();
        cocinarPizza();
        empaquetarPizza();
    }

    protected abstract void prepararIngredientes();
    protected abstract void agregarIngredientes();
    private void prepararMasa(){
        System.out.println("Preparando masa..");
    }
    private void preCocinarMasa(){
        System.out.println("Pre cocinando masa..");
    }
    private void cocinarPizza(){
        System.out.println("Enviando al horno la pizza");
    }
    private void empaquetarPizza(){
        System.out.println("Empaquetando pizza");
    }
}
 */