import java.util.ArrayList;

public class Escuadron {
    // Atributos
    String nombre, lugar_base;
    Persona lider;
    boolean heroeOVillano;
    ArrayList<Persona> miembros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_base() {
        return lugar_base;
    }

    public void setLugar_base(String lugar_base) {
        this.lugar_base = lugar_base;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isHeroeOVillano() {
        return heroeOVillano;
    }

    public void setHeroeOVillano(boolean heroeOVillano) {
        this.heroeOVillano = heroeOVillano;
    }
}
