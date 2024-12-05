import java.util.Scanner;

public class BComparacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
            if (cadena1.equals(cadena2)) {
                System.out.println("Y también el mismo contenido.");
            } else {
                System.out.println("Pero el contenido es diferente.");
            }
        } else {
            System.out.println("Las cadenas tienen diferente longitud.");
        }
    }
}