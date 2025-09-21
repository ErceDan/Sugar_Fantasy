package src.app;
import java.util.Scanner;

public class SugarFantasy {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestión de Héroes");
            System.out.println("2. Gestión de Habilidades");
            System.out.println("3. Juego");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 ->
                    menuHeroes();
                case 2 ->
                    menuHabilidades();
                case 3 ->
                    menuJuego();
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("¡Gracias por jugar!");
    }

    // ===== Submenú Héroes =====
    private static void menuHeroes() {
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- Gestión de Héroes ---");
            System.out.println("1. Crear héroe");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Mostrar un héroe");
            System.out.println("4. Modificar un héroe");
            System.out.println("5. Eliminar un héroe");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    System.out.println(">> Crear héroe (pendiente implementar)");
                case 2 ->
                    System.out.println(">> Mostrar todos (pendiente implementar)");
                case 3 ->
                    System.out.println(">> Mostrar un héroe (pendiente implementar)");
                case 4 ->
                    System.out.println(">> Modificar un héroe (pendiente implementar)");
                case 5 ->
                    System.out.println(">> Eliminar un héroe (pendiente implementar)");
                case 0 ->
                    volver = true;
                default ->
                    System.out.println("Opción no válida.");
            }
        }
    }

    // ===== Submenú Habilidades =====
    private static void menuHabilidades() {
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- Gestión de Habilidades ---");
            System.out.println("1. Listado de héroes con sus habilidades");
            System.out.println("2. Mostrar un héroe con su libro de habilidades");
            System.out.println("3. Añadir habilidad a un héroe");
            System.out.println("4. Eliminar habilidad de un héroe");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    System.out.println(">> Listado de héroes con habilidades (pendiente implementar)");
                case 2 ->
                    System.out.println(">> Mostrar un héroe con su libro (pendiente implementar)");
                case 3 ->
                    System.out.println(">> Añadir habilidad a un héroe (pendiente implementar)");
                case 4 ->
                    System.out.println(">> Eliminar habilidad de un héroe (pendiente implementar)");
                case 0 ->
                    volver = true;
                default ->
                    System.out.println("Opción no válida.");
            }
        }
    }

    // ===== Submenú Juego =====
    private static void menuJuego() {
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- Juego ---");
            System.out.println("1. Duelo");
            System.out.println("2. Modo Arcade");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    System.out.println(">> Duelo entre héroes (pendiente implementar)");
                case 2 ->
                    System.out.println(">> Modo arcade (pendiente implementar)");
                case 0 ->
                    volver = true;
                default ->
                    System.out.println("Opción no válida.");
            }
        }
    }
}
