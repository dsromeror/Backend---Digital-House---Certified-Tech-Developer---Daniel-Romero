package Patron_Cadena_Responsabilidades;

public abstract class EmpleadoBanco {
    protected EmpleadoBanco sigEmpleadoBanco;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) {
        this.sigEmpleadoBanco = sigEmpleadoBanco;
        return this;
    }
}
