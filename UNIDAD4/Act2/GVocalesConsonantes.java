import java.util.Scanner;

public class GVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Ingrese letras (un espacio para terminar):");

        do {
            System.out.print("Ingrese una letra: ");
            letra = scanner.next().charAt(0);

            if (Character.isLetter(letra)) {
                if (esVocal(letra)) {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            } else if (letra == ' ') {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese una letra.");
            }
        } while (letra != ' ');
    }

    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}