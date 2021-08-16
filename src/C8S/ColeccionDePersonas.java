package C8S;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ColeccionDePersonas {

    private List<Persona> personas = new ArrayList<>();

    public List<Persona> agregarNuevaPersonaALaColeccion(Persona p){

        if(p.getNombre().length() >= 5){
            Period lapso = Period.between(p.getFechaDeNacimiento(), LocalDate.now());
            int edad = lapso.getYears();
            if(edad >= 18){
                getPersonas().add(p);
            }
        }

        return getPersonas();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}