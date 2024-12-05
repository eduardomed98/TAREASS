import java.util.Scanner;

public class CPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        boolean esPalindromo = verificarPalindromo(cadena);

        if (esPalindromo) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    public static boolean verificarPalindromo(String cadena) {

        cadena = cadena.toLowerCase();

        cadena = cadena.replaceAll("\\s+", "");

        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(cadenaInvertida);
    }
}