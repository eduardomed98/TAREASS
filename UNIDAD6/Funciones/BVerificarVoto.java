import java.util.Scanner;

public class BVerificarVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        int añoActual = 2024;

        boolean puedeVotar = verificarEdad(añoNacimiento, añoActual);

        if (puedeVotar) {
            System.out.println("¡Puedes votar!");
        } else {
            System.out.println("Aún no puedes votar.");
        }
    }

    public static boolean verificarEdad(int añoNacimiento, int añoActual) {
        int edad = añoActual - añoNacimiento;
        return edad >= 18;
    }
}