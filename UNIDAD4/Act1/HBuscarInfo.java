import java.util.Scanner;
public class HBuscarInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        System.out.println("RESUMEN DE PELICULAS");
        System.out.println("Selecciona una pelicula: ");
        System.out.println("1. Parasite");
        System.out.println("2. The Shawshank Redemption");
        System.out.println("3. The Dark Knight");
        System.out.println("4. Spirited Away");
        System.out.println("5. The Godfather");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("Una familia pobre surcoreana se infiltra en la vida de una rica familia, exponiendo las profundas desigualdades sociales y las consecuencias de la codicia. Esta película, ganadora del Oscar a Mejor Película, te mantendrá al borde del asiento con su trama intrigante y sus giros inesperados.");
                break;
            case 2:
            System.out.println("Un hombre inocente es condenado a cadena perpetua y debe encontrar una forma de sobrevivir y mantener la esperanza en medio de la brutalidad carcelaria. Considerada una de las mejores películas de todos los tiempos, este drama conmovedor te hará reflexionar sobre la amistad, la redención y la fuerza del espíritu humano.");
                break;
            case 3:
            System.out.println("Batman se enfrenta a su némesis más letal, el Joker, en una batalla épica que pone a prueba los límites de la justicia y la moralidad. Esta película, dirigida por Christopher Nolan, es un clásico moderno del cine de superhéroes que te dejará con la boca abierta.");
                break;
            case 4:
            System.out.println("Una niña se pierde en un mundo mágico lleno de espíritus y debe encontrar el camino de regreso a casa. Esta obra maestra de Studio Ghibli es una aventura fantástica y conmovedora que cautivará a niños y adultos por igual.");
                break;
            case 5:
            System.out.println("Una saga épica sobre el ascenso y la caída de una poderosa familia mafiosa italiana en Estados Unidos. Este clásico del cine, dirigido por Francis Ford Coppola, es una exploración profunda del poder, la lealtad y la corrupción.");
                break;
                default:
                System.out.println("La opcion ingresada no existe");
                break;
   
        }
        scanner.close();
    }
}
