import java.util.*;

public class BSumarNumeros {
    public static void main(String[] args) {
        Scanner scaNner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingresa 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scaNner.nextInt();
            suma += numeros[i];
        }

        System.out.println("\nLa suma de los números ingresados es: " + suma);

        scaNner.close();
    }
}
