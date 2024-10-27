import java.util.Scanner;

public class DCalcularPrecioConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioOriginal, descuento, precioFinal;

        System.out.print("Ingrese el precio original del producto: ");
        precioOriginal = scanner.nextDouble();

        descuento = 0;

        if (precioOriginal > 500) {
            descuento = 0.25; // 25% de descuento
        } else if (precioOriginal > 200) {
            descuento = 0.20; // 20% de descuento
        } else if (precioOriginal > 100) {
            descuento = 0.10; // 10% de descuento
        }

        precioFinal = precioOriginal * (1 - descuento);

        System.out.println("El precio final del producto es: $" + precioFinal);

        scanner.close();
    }
}   