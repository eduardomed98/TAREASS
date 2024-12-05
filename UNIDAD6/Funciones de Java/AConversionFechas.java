import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AConversionFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una fecha (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);

        LocalDate unaSemanaDespues = fecha.plusWeeks(1);
        LocalDate unMesAntes = fecha.minusMonths(1);

        System.out.println("Una semana después: " + unaSemanaDespues.format(formatter));
        System.out.println("Un mes antes: " + unMesAntes.format(formatter));
    }
}