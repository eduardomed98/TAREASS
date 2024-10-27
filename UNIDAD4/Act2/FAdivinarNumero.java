import java.util.Random;
import java.util.Scanner;

public class FAdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100.");

        do {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es más alto.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es más bajo.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Felicidades! Has adivinado el número.");
    }
}