public class Extrasterreste extends Persona{

    public Extrasterreste(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        super(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica);
    }

    public static class Deidad extends Extrasterreste {
        // Atributos
        private boolean tieneCreyentes;
        String religionMitologia;

        // Constructor
        public Deidad(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, boolean tieneCreyentes, String religionMitologia) {
            super(nombre, poder, debilidad, heroeOVillano, fuerza, habilidadMental, habilidadFisica);
            this.tieneCreyentes = tieneCreyentes;
            this.religionMitologia = religionMitologia;
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

        public void final_chance(Persona p1, Persona p2){

        }
    }

}
