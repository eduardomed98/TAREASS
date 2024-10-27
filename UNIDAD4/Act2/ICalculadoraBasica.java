import java.util.Scanner;

public class ICalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        double num1, num2, resultado;

        do {
            System.out.println("\nCALCULADORA BASICA");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("La suma es: " + resultado);
                    break;
                case '2':
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("La resta es: " + resultado);
                    break;
                case '3':
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion es: " + resultado);
                    break;
                case '4':
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("La divicion es: " + resultado);
                    break;
                case '5':
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != '5');
    }
}