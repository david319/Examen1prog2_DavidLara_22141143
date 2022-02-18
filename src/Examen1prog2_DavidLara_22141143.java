import java.util.Scanner;

public class Examen1prog2_DavidLara_22141143 {

    public static boolean verifyPts(int fuerza, int habilidadM, int habilidadF) {
        int pts = fuerza + habilidadM + habilidadF;
        return pts >= 100 && pts <= 150;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Declaración de variables
        int opcion;
        System.out.println("Menu de opciones");
        do {
            System.out.println("""
                  0. Salir
                  1. Opciones Universo
                  2. Opciones Escuadrón
                  3. Opciones Persona
                  Ingrese una opción:""");
            opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println("Opciones del Universo");
                System.out.println("""
                        1. Crear universo
                        2. Modificar universo
                        3. Eliminar universo
                        4. Mostrar universo
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    Universo.addUniverso(nombre);
                } else if (opcion == 2) {
                    System.out.println("Modificar universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nuevo nombre del universo:");
                    String nuevoNombre = leer.next();
                    Universo.editUniverso(nombre, nuevoNombre);
                } else if (opcion == 3) {
                    System.out.println("Eliminar universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    Universo.deleteUniverso(nombre);
                } else if (opcion == 4) {
                    System.out.println("Mostrar universo");
                    Universo.listUniversos();
                }
            } else if (opcion == 2) {
                System.out.println("Opciones del Escuadrón");
                System.out.println("""
                        1. Crear escuadrón
                        2. Modificar escuadrón
                        3. Eliminar escuadrón
                        4. Agregar miembros al escuadrón
                        5. Mostrar escuadrones
                        6. Simular batalla
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el lugar/base del escuadrón:");
                    String lugar = leer.next();
                    System.out.println("""
                            Tipo de escuadrón:
                            1. Héroe
                            2. Villano
                            Ingrese una opción:""");
                    opcion = leer.nextInt();
                    if (opcion == 1) {
                        Escuadron.addEscuadron(nombre, lugar, true);
                    } else if (opcion == 2) {
                        Escuadron.addEscuadron(nombre, lugar, false);
                    } else {
                        System.out.println("Opción no valida");
                    }
                } else if (opcion == 2) {
                    System.out.println("Modificar escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nuevo nombre del escuadrón:");
                    String nuevoNombre = leer.next();
                    System.out.println("Ingrese el nuevo lugar/base del escuadrón:");
                    String nuevoLugar = leer.next();
                    System.out.println("""
                            Tipo de escuadrón:
                            1. Héroe
                            2. Villano
                            Ingrese una opción:""");
                    opcion = leer.nextInt();
                    if (opcion == 1) {
                        Escuadron.editEscuadron(nombre, nuevoNombre, nuevoLugar, true);
                    } else if (opcion == 2) {
                        Escuadron.editEscuadron(nombre, nuevoNombre, nuevoLugar, false);
                    }
                } else if (opcion == 3) {
                    System.out.println("Eliminar escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    Escuadron.deleteSquad(nombre);
                } else if (opcion == 4) {
                    System.out.println("Agregar miembros al escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nombre del miembro:");
                    String nombreMiembro = leer.next();
                    Escuadron.addMiembro(nombre, nombreMiembro);
                } else if (opcion == 5) {
                    System.out.println("Mostrar escuadrones");
                    Universo.listSquads();
                }
            } else if (opcion == 3) {
                System.out.println("Opciones Persona");
                System.out.println("""
                        1. Crear persona
                        2. Modificar persona
                        3. Eliminar persona
                        4. Listar personas
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear persona");
                    System.out.println("""
                            Ingrese el tipo de persona:
                            1. Persona Normal
                            2. Mutante
                            3. Por Accidente Radioactivo
                            4. Super Humano
                            Ingrese una opción:""");
                    opcion = leer.nextInt();

                    if (opcion == 1) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        if (verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PersonaNormal.addPersonaN(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 2) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese el factor Mutante:");
                        String factor = leer.next();
                        if (verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PersonaNormal.Mutante.addMutante(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, factor);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 3) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese la edad al momento del accidente:");
                        int edad = leer.nextInt();
                        if (verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PersonaNormal.PorAccidenteRadioA.addAccidente(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, edad);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 4) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese el superpoder:");
                        String superpoder = leer.next();
                        if (verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PersonaNormal.SuperHumano.addSuperH(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, superpoder);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    }

                }
            }

        } while (opcion != 0);
    }
}
