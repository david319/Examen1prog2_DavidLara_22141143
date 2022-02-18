import java.util.Scanner;

public class Examen1prog2_DavidLara_22141143 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Declaración de variables
        int opcion;
        System.out.println("Menu de opciones");
        do {
            System.out.println("""
                    1. Crear SuperHeroe/Villano
                    2. Modificar SuperHeroe/Villano
                    3. Eliminar SuperHeroe/Villano
                    4. Crear Escuadrón
                    5. Modificar Escuadrón
                    6. Eliminar Escuadrón
                    7. Iniciar Batalla
                    8. Salir
                    """);
            opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println("Crear SuperHeroe/Villano");
                System.out.println("Ingrese el nombre del SuperHeroe/Villano");
                String nombre = leer.next();
                System.out.println("Ingrese el poder: ");
                String poder = leer.next();

            }

        } while (opcion != 8);
    }
}
