import java.util.ArrayList;

public class PersonaNormal extends Persona {
    // Constructor
    public PersonaNormal(String nombre, String poder, String debilidad, String heroe, String villano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, habilidadMental, habilidadFisica);
    }

    public void final_chance(Persona p1, Persona p2) {

    }

    public static class Mutante extends Persona {
        // Atributos
        ArrayList<String> factoresMutantes = new ArrayList<>();

        // Constructor
        public Mutante(String nombre, String poder, String debilidad, String heroe, String villano, Integer fuerza,
                       Integer habilidadMental, Integer habilidadFisica, String  factorMutante) {
            super(nombre, poder, debilidad, heroe, villano, fuerza, habilidadMental, habilidadFisica);
            factoresMutantes.add(factorMutante);
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }

    public static class PorAccidenteRadioA extends Persona {
        // Atributos
        Integer edadAlMomentoA;

        // Constructor
        public PorAccidenteRadioA(String nombre, String poder, String debilidad, String heroe, String villano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, Integer edadAlMomentoA) {
            super(nombre, poder, debilidad, heroe, villano, fuerza, habilidadMental, habilidadFisica);
            this.edadAlMomentoA = edadAlMomentoA;
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }

    public static class SuperHumano extends Persona {
        // Atributos
        String superPoder;

        // Constructor
        public SuperHumano(String nombre, String poder, String debilidad, String heroe, String villano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String superPoder) {
            super(nombre, poder, debilidad, heroe, villano, fuerza, habilidadMental, habilidadFisica);
            this.superPoder = superPoder;
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }
}
