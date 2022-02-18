import java.util.ArrayList;

public class Escuadron {
    // Atributos
    String nombre, lugar_base;
    Persona lider;
    boolean heroeOVillano;
    static ArrayList<Persona> miembros;

    public Escuadron(String nombre, String lugar_base, boolean heroeOVillano) {
        this.nombre = nombre;
        this.lugar_base = lugar_base;
        this.heroeOVillano = heroeOVillano;
        miembros = new ArrayList<>();
    }

    public static void addEscuadron(String nombre, String lugar_base, boolean heroeOVillano) {
        for (Universo universo : Universo.universos) {
            if (universo.getNombre().equals(lugar_base)) {
                universo.setSquads(new Escuadron(nombre, lugar_base, heroeOVillano));
            } else {
                System.out.println("No existe el universo");
            }
        }
    }

    public static void editEscuadron(String nombre, String nuevoNombre, String nuevolugar_base, boolean heroeOVillano) {
        for (Universo universo : Universo.universos) {
            if (universo.getSquads().toString().equals(nombre)) {
                universo.setSquads(new Escuadron(nuevoNombre, nuevolugar_base, heroeOVillano));
            } else {
                System.out.println("No existe el escuadron");
            }
        }
    }

    public static void deleteSquad(String nombre) {
        for (Universo universo : Universo.universos) {
            if (universo.getSquads().toString().equals(nombre)) {
                universo.setSquads(null);
            } else {
                System.out.println("No existe el escuadron");
            }
        }
    }

    public static void addMiembro(String nombre, String nombreM){
        for (Escuadron universo : Universo.squads) {
            if (universo.getNombre().equals(nombre)) {
                for (Persona persona : Escuadron.miembros) {
                    if (persona.getNombre().equals(nombreM)) {
                        miembros.add(persona);
                    }
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
