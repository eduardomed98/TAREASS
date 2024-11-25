import java.util.*;

public class OrdMetodoBurbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números que deseas agregar al arreglo: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Ingresa " + cantidad + " números enteros:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {

                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        scanner.close();
    }
}
