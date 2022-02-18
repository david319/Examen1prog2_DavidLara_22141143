import java.util.ArrayList;

public class Universo {
    // Atributos
    String nombre;
    ArrayList<Escuadron> squads;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadron> squads) {
        this.squads = squads;
    }
}
