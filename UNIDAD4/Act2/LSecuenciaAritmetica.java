import java.util.Scanner;

public class LSecuenciaAritmetica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero, diferencia, numeroMaximo;

        do {
            System.out.print("Ingrese el primer número de la secuencia: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
            primerNumero = scanner.nextInt();

            System.out.print("Ingrese la diferencia entre los números: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
            diferencia = scanner.nextInt();

            System.out.print("Ingrese el número máximo de la secuencia: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
            numeroMaximo = scanner.nextInt();
        } while (primerNumero <= 0 || diferencia <= 0 || numeroMaximo <= primerNumero);

        System.out.println("La secuencia aritmética es:");
        int numeroActual = primerNumero;
        do {
            System.out.print(numeroActual + " ");
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);
    }
}