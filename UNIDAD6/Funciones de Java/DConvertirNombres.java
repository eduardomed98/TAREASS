import java.util.Scanner;

public class DConvertirNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        do {
            System.out.print("Ingrese un nombre completo (o 'salir' para terminar): ");
            nombre = scanner.nextLine();

            if (!nombre.equalsIgnoreCase("salir")) {

                String[] palabras = nombre.split(" ");
                StringBuilder nombreTitulo = new StringBuilder();
                for (String palabra : palabras) {
                    nombreTitulo.append(Character.toUpperCase(palabra.charAt(0)))
                                .append(palabra.substring(1).toLowerCase()).append(" ");
                }
                System.out.println(nombreTitulo.toString().trim());
            }
        } while (!nombre.equalsIgnoreCase("salir"));
    }
}