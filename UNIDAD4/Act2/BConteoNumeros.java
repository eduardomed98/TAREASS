import java.util.Scanner;

public class BConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros, positivos, negativos, ceros, numero;

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        cantidadNumeros = scanner.nextInt();

        positivos = 0;
        negativos = 0;
        ceros = 0;

        System.out.println("Ingrese los números:");
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Números mayores que 0: " + positivos);
        System.out.println("Números menores que 0: " + negativos);
        System.out.println("Números iguales a 0: " + ceros);
    }
}