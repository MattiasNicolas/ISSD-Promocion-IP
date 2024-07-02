package adivinarNumero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Juego {
    private int numeroAleatorio;
    private final int intentosMaximos = 5;

   
    public void iniciar() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(50) + 1; 
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar un número entre 1 y 50.");

        while (intentos < intentosMaximos && !adivinado) {
            System.out.print("Ingresa tu intento: ");
            try {
                int intento = scanner.nextInt(); 
                intentos++;

                if (intento == numeroAleatorio) {
                    adivinado = true;
                    System.out.println("¡Felicidades! Has adivinado el número correcto.");
                } else if (intento < numeroAleatorio) {
                    System.out.println("Tu intento es demasiado bajo.");
                } else {
                    System.out.println("Tu intento es demasiado alto.");
                }

                System.out.println("Intentos restantes: " + (intentosMaximos - intentos));
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); 
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has usado todos tus intentos. El número correcto era " + numeroAleatorio + ".");
        }
    }
}
