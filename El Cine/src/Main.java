import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CINE:
        C_Cine cine = new C_Cine("Cinepolis", 2, 2, 4);

        // SALAS:
        cine.getSalasCine()[0] = new C_SalaCine("Sala 1", 2, "Avengers");
        cine.getSalasCine()[1] = new C_SalaCine("Sala 2", 1, "One Piece");

        //PROGRAMA:
        System.out.println("- Bienvenido a " + cine.getNombreCine() + " -");
        System.out.println();

        System.out.println("¿Que sala desea modificar?");
        System.out.println("1. " + cine.getSalasCine()[0].getNombreSala());
        System.out.println("2. " + cine.getSalasCine()[1].getNombreSala());
        System.out.println("3. Salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Que desea modificar?");
                System.out.println("1. Agregar espectador");
                System.out.println("2. Cambiar pelicula");
                System.out.println("3. Salir");
                int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:

                            break;

                        case 2:

                            break;

                        case 3:
                            System.out.println("Saliendo...");
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                System.out.println("Gracias por usar el programa.");
                break;
            case 2:

            case 3:
                System.out.println("Gracias por usar el programa.");
                break;

            default:
                System.out.println("No existe esa sala");
                System.out.println();
                System.out.println("Gracias por usar el programa.");
                break;
        }
    }
}