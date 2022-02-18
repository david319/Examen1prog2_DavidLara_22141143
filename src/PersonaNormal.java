import java.util.ArrayList;

public class PersonaNormal extends Persona {
    // Constructor
    public PersonaNormal(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
    }

    public static void addPersonaN(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        for (Persona e : Escuadron.miembros) {
            if (e.getNombre().equals(nombre)) {
                System.out.println("Ya existe una persona con ese nombre");
            } else {
                Escuadron.miembros.add(new PersonaNormal(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica));
            }
        }
    }


    public void final_chance(Persona p1, Persona p2) {

    }

    public static class Mutante extends Persona {
        // Atributos
        ArrayList<String> factoresMutantes = new ArrayList<>();

        // Constructor
        public Mutante(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String factorMutant) {
            super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
            factoresMutantes.add(factorMutant);
        }

        public static void addMutante(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String factorMutant) {
            for (Persona e : Escuadron.miembros) {
                if (e.getNombre().equals(nombre)) {
                    System.out.println("Ya existe una persona con ese nombre");
                } else {
                    Escuadron.miembros.add(new Mutante(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, factorMutant));
                }
            }
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }

    public static class PorAccidenteRadioA extends Persona {
        // Atributos
        Integer edadAlMomentoA;

        // Constructor
        public PorAccidenteRadioA(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, Integer edadAlMomentoA) {
            super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
            this.edadAlMomentoA = edadAlMomentoA;
        }

        public static void addAccidente(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, Integer edadAlMomentoA) {
            for (Persona e : Escuadron.miembros) {
                if (e.getNombre().equals(nombre)) {
                    System.out.println("Ya existe una persona con ese nombre");
                } else {
                    Escuadron.miembros.add(new PorAccidenteRadioA(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, edadAlMomentoA));
                }
            }
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }

    public static class SuperHumano extends Persona {
        // Atributos
        String superPoder;

        // Constructor
        public SuperHumano(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String superPoder) {
            super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
            this.superPoder = superPoder;
        }

        public static void addSuperH(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String superPoder) {
            for (Persona e : Escuadron.miembros) {
                if (e.getNombre().equals(nombre)) {
                    System.out.println("Ya existe una persona con ese nombre");
                } else {
                    Escuadron.miembros.add(new SuperHumano(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, superPoder));
                }
            }
        }

        public void final_chance(Persona p1, Persona p2) {

        }
    }
}
