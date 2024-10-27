import java.util.Scanner;

public class JNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("Los números impares desde 1 hasta " + numero + " son:");
        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
    }
}