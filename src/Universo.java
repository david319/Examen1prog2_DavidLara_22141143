import java.util.ArrayList;

public class Universo {
    // Atributos
    String nombre;
    static ArrayList<Universo> universos;
    static ArrayList<Escuadron> squads;

    public Universo(String nombre) {
        this.nombre = nombre;
        squads = new ArrayList<>();
    }

    public static void addUniverso(String nombre) {
        universos.add(new Universo(nombre));
    }

    public static void deleteUniverso(String nombre) {
        universos.removeIf(universo -> universo.getNombre().equals(nombre));
    }

    public static void editUniverso(String nombre, String nuevoNombre) {
        for (Universo universo : universos) {
            if (universo.getNombre().equals(nombre)) {
                universo.setNombre(nuevoNombre);
            }
        }
    }

    public static void listUniversos(){
        for (Universo universo : universos) {
            System.out.println(universo.getNombre());
        }
    }

    public static void listSquads() {
        for (Escuadron squad : squads) {
            System.out.println(squad.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(Escuadron squads) {
        Universo.squads.add(squads);
    }
}
