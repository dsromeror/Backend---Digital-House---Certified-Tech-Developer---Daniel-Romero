package Patron_Facade;

public class Tarjeta {
    private String NumerosFrente;
    private String CodSeguridad;
    private String fecha;

    public Tarjeta(String codigo, String clave, String fecha) {
        this.NumerosFrente = codigo;
        this.CodSeguridad = clave;
        this.fecha = fecha;
    }

    public String getNumerosFrente() {
        return NumerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.NumerosFrente = numerosFrente;
    }

    public String getCodSeguridad() {
        return CodSeguridad;
    }

    public void setCodSeguridad(String codSeguridad) {
        this.CodSeguridad = codSeguridad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
