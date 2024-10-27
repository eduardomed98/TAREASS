import java.util.Scanner;

public class ACalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaParciales, notaProyecto, notaExamenFinal, notaFinal;
        
        System.out.print("Ingrese la nota de los parciales (0-100): ");
        notaParciales = scanner.nextDouble();

        System.out.print("Ingrese la nota del proyecto (0-100): ");
        notaProyecto = scanner.nextDouble();

        System.out.print("Ingrese la nota del examen final (0-100): ");
        notaExamenFinal = scanner.nextDouble();

        
        if (notaParciales < 0 || notaParciales > 100 ||
            notaProyecto < 0 || notaProyecto > 100 ||
            notaExamenFinal < 0 || notaExamenFinal > 100) {
            System.out.println("Las notas deben estar entre 0 y 100.");
            return;
        }

        
        notaFinal = (notaParciales * 0.4) + (notaProyecto * 0.3) + (notaExamenFinal * 0.3);

        
        System.out.println("La nota final es: " + notaFinal);
    }
}