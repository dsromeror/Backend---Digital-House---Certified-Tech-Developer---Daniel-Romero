package Patron_Facade_a;

public class Direccion {
    private String avenida;
    private String calle;
    private String Nro;
    private String ciudad;
    private String barrio;

    public Direccion(String avenida, String calle, String nro, String ciudad, String barrio) {
        this.avenida = avenida;
        this.calle = calle;
        Nro = nro;
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return Nro;
    }

    public void setNro(String nro) {
        this.Nro = nro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
