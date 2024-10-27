import java.util.Scanner;

public class EContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorDigitos;

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        contadorDigitos = contarDigitos(numero);

        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");
    }

    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // El número 0 tiene un dígito
        } else {
            int contador = 0;
            while (numero != 0) {
                numero /= 10; // Dividimos entre 10 para eliminar el último dígito
                contador++;
            }
            return contador;
        }
    }
}