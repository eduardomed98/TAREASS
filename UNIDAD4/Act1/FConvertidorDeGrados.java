import java.util.Scanner;

public class FConvertidorDeGrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius, resultado;
        int opcion;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = scanner.nextDouble();

        System.out.println("Seleccione la conversión deseada:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("(Selecciona 1 o 2)");
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                resultado = (celsius * 9/5) + 32;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " Kelvin.");
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}