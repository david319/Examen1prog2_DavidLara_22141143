public class Persona {

    // Atributos
    String nombre, poder, debilidad, heroe, villano;
    Integer fuerza, habilidadMental, habilidadFisica;
    boolean tiene_Escuadron;

    public Persona(String nombre, String poder, String debilidad, String heroe, String villano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe = heroe;
        this.villano = villano;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getHabilidadMental() {
        return habilidadMental;
    }

    public void setHabilidadMental(Integer habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public Integer getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(Integer habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTiene_Escuadron() {
        return tiene_Escuadron;
    }

    public void setTiene_Escuadron(boolean tiene_Escuadron) {
        this.tiene_Escuadron = tiene_Escuadron;
    }

    public void final_chance(Persona p1, Persona p2) {

    }

    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroe=" + heroe + ", villano=" + villano + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tiene_Escuadron=" + tiene_Escuadron + '}';
    }
}
