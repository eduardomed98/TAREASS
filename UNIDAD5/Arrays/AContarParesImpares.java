import java.util.*;

public class AContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int conteoPares = 0;
        int conteoImpares = 0;

        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                conteoPares++;
            } else {
                conteoImpares++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de números pares: " + conteoPares);
        System.out.println("Cantidad de números impares: " + conteoImpares);

        scanner.close();
    }
}
