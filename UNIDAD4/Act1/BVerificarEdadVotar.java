import java.util.Scanner;

public class BVerificarEdadVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("Aún no eres elegible para votar.");
        }

        scanner.close();
    }
}