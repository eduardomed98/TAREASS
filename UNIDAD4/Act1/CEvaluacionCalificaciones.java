import java.util.Scanner;

public class CEvaluacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int calificacion;

        System.out.print("Ingrese la calificación (0-100): ");
        calificacion = scanner.nextInt();

        String nota;

        if (calificacion >= 90) {
            nota = "A";
        } else if (calificacion >= 80) {
            nota = "B";
        } else if (calificacion >= 70) {
            nota = "C";
        } else if (calificacion >= 60) {
            nota = "D";
        } else {
            nota = "F";
        }

        System.out.println("La calificación equivalente en letra es: " + nota);

        scanner.close();
    }
}