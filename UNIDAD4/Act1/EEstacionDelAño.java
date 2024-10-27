import java.util.Scanner;

public class EEstacionDelAño  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes; 

        System.out.print("Ingrese el número de mes (1-12): ");
        mes = scanner.nextInt();

        String estacion;

        switch (mes) {
            case 12, 1, 2:
                estacion = "Invierno";
                break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10, 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
        }

        System.out.println("La estación correspondiente al mes " + mes + " es: " + estacion);

        scanner.close();
    }
}