import java.util.Scanner;

public class HMediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero, suma = 0, contador = 0;

        System.out.println("Ingrese números positivos (ingrese un número negativo para terminar):");

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}