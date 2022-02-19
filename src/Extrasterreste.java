public class Extrasterreste extends Persona{

    public Extrasterreste(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        super(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica);
    }

    public static class Deidad extends Extrasterreste {
        // Atributos
        protected boolean tieneCreyentes;
        protected String religionMitologia;

        // Constructor
        public Deidad(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, boolean tieneCreyentes, String religionMitologia) {
            super(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica);
            this.tieneCreyentes = tieneCreyentes;
            this.religionMitologia = religionMitologia;
        }

        public static void addDeidad(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, boolean tieneCreyentes, String religionMitologia){
            for (Persona persona : Escuadron.miembros) {
                if (persona.getNombre().equals(nombre)) {
                    System.out.println("Ya existe una deidad con ese nombre");
                } else {
                    Escuadron.miembros.add(new Deidad(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica, tieneCreyentes, religionMitologia));
                }
            }
        }
    }

    public static void setLider(Persona p) {
        for (Persona persona : Escuadron.miembros) {
            if (persona.getNombre().equals(p.getNombre())) {
                Escuadron.lider = p;
            }
        }
    }

    public static class Alien extends Extrasterreste {
        // Atributos
        String planeta;

        // Constructor
        public Alien(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String planeta) {
            super(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica);
            this.planeta = planeta;
        }

        public static void addAlien(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String planeta){
            for (Persona persona : Escuadron.miembros) {
                if (persona.getNombre().equals(nombre)) {
                    System.out.println("Ya existe un alien con ese nombre");
                } else {
                    Escuadron.miembros.add(new Alien(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica, planeta));
                }
            }
        }

        public static void setLider(Persona p) {
            Escuadron.lider = p;
        }

        public void final_chance(Persona p1, Persona p2){

        }
    }

}
