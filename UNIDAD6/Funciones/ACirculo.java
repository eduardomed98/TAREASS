import java.util.Scanner;

public class ACirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}