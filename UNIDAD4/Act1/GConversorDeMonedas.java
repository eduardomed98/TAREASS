import java.util.Scanner;

public class GConversorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesos, resultado;

        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        pesos = scanner.nextDouble();

        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.println("(Numero del 1 al 10))");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        resultado = 0;

        switch (opcion) {

            // La tasa de cambio esta simplificada

            case 1: // Dólar (USD)
                resultado = pesos / 19; 
                break;
            case 2: // Euro (EUR)
                resultado = pesos / 21; 
                break;
            case 3: // Bath (THB)
                resultado = pesos / 0.5; 
                break;
            case 4: // Yen (JPY)
                resultado = pesos / 0.15; 
                break;
            case 5: // Won (KRW)
                resultado = pesos / 0.015; 
                break;
            case 6: // Dolar Australiano (AUD)
                resultado = pesos / 13; 
                break;
            case 7: // Sol (PEN)
                resultado = pesos / 5; 
                break;
            case 8: // Dolar Canadiense (CAD)
                resultado = pesos / 14; 
                break;
            case 9: // Bolivar (ves)
                resultado = pesos / 0.000005; 
                break;
            case 10: // Peso Argentino (ARS)
                resultado = pesos / 0.02; 
                break;


            default:
                System.out.println("Opción inválida.");
        }

        if (opcion >= 1 && opcion <= 10) {
            System.out.println(pesos + " pesos mexicanos equivalen a " + resultado + " " + obtenerNombreMoneda(opcion));
        }

        scanner.close();
    }

    private static String obtenerNombreMoneda(int opcion) {
        String nombreMoneda = "";
        switch (opcion) {
            case 1:
                nombreMoneda = "dólar";
                break;
            case 2:
                nombreMoneda = "euros";
                break;
            case 3:
                nombreMoneda = "bath";
                break;
            case 4:
                nombreMoneda = "yen";
                break;
            case 5:
                nombreMoneda = "won";
                break;
            case 6:
                nombreMoneda = "dolar australiano";
                break;
            case 7:
                nombreMoneda = "sol";
                break;
            case 8:
                nombreMoneda = "dolar canadiense";
                break;
            case 9:
                nombreMoneda = "bolivar";
                break;
            
            case 10:
                nombreMoneda = "pesos argentinos";
                break;
        }
        return nombreMoneda;
    }
}