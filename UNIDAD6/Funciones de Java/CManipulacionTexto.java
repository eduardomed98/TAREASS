import java.util.Scanner;

public class CManipulacionTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        String palabraBuscar = "ingeniería";
        int contador = 0;
        int indice = 0;
        while ((indice = texto.indexOf(palabraBuscar, indice)) != -1) {
            contador++;
            indice += palabraBuscar.length();
        }

        System.out.println("La palabra 'ingeniería' aparece " + contador + " veces.");
    }
}