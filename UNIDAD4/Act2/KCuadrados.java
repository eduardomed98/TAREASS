import java.util.Scanner;

public class KCuadrados{
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

        System.out.println("Los cuadrados de los números desde 1 hasta " + numero + " son:");
        int i = 1;
        do {
            System.out.println(i + "^2 = " + (i * i));
            i++;
        } while (i <= numero);
    }
}