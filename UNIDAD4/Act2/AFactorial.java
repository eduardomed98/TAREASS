import java.util.Scanner;

public class AFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número entero no negativo: ");
        numero = scanner.nextInt();

        long factorial = 1; // Iniciamos el factorial en 1

        // Calculamos el factorial usando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}