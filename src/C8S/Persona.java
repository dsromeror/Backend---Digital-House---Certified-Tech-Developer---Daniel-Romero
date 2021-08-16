package C8S;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private String email;

    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
