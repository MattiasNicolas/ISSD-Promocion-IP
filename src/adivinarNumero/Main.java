package adivinarNumero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego();
        int opcion = 0;
        do {
            mostrarMenu();
            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        juego.iniciar(); 
                        break;
                    case 2:
                        System.out.println("Gracias por jugar. ¡Te esperamos de vuelta!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); 
            }
        } while (opcion != 2);

        scanner.close();
    }
    public static void mostrarMenu() {
        System.out.println("---- Menú de Juego ----");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
