import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CINE:
        C_Cine cine = new C_Cine("Cinepolis", 2, 2);

        // SALAS:
        cine.getSalasCine()[0] = new C_SalaCine("Sala 1", 5, "Avengers");
        cine.getSalasCine()[1] = new C_SalaCine("Sala 2", 5, "One Piece");

        //PROGRAMA:
        System.out.println("- Bienvenido a " + cine.getNombreCine() + " -");
        System.out.println();

        System.out.println("¿Que desea modificar?");
        System.out.println("1. " + cine.getSalasCine()[0].getNombreSala());
        System.out.println("2. " + cine.getSalasCine()[1].getNombreSala());
        System.out.println("3. Cambiar sueldo de empleado");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Que desea modificar?");
                System.out.println("1. Agregar espectadores");
                System.out.println("2. Cambiar pelicula");
                System.out.println("3. Salir");
                int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            char flag = 's';
                            try{
                                do {
                                    System.out.println("Ingrese nombre del espectador:");
                                    String nombre = sc.next();
                                    System.out.println("Ingrese DNI:");
                                    int dni = sc.nextInt();
                                    System.out.println("Ingrese fila:");
                                    int fila = sc.nextInt();
                                    System.out.println("Ingrese asiento:");
                                    int asiento = sc.nextInt();
                                    cine.getSalasCine()[0].getEspectadores()[fila][asiento] = new C_Espectador(nombre, dni);
                                    System.out.println("¿Desea agregar otro espectador? (s/n)");
                                    flag = sc.next().charAt(0);
                                } while (flag == 's');
                                if (cine.getSalasCine()[0].getCapacidad() > 5) {
                                    System.out.println("La sala esta llena");
                                } else if(cine.getSalasCine()[0].getCapacidad() == 0) {
                                    System.out.println("La sala esta vacia");
                                }
                            } catch (Exception e) {
                                System.out.println("Ha ingresado un dato erroneo");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese pelicula:");
                            String pelicula = sc.next();
                            cine.getSalasCine()[0].setPelicula(pelicula);
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
                System.out.println("¿Que desea modificar?");
                System.out.println("1. Agregar espectadores");
                System.out.println("2. Cambiar pelicula");
                System.out.println("3. Salir");
                int opcion3 = sc.nextInt();
                switch (opcion3) {
                    case 1:
                        char flag = 's';
                        try{
                            do {
                                System.out.println("Ingrese nombre del espectador:");
                                String nombre = sc.next();
                                System.out.println("Ingrese DNI:");
                                int dni = sc.nextInt();
                                System.out.println("Ingrese fila:");
                                int fila = sc.nextInt();
                                System.out.println("Ingrese asiento:");
                                int asiento = sc.nextInt();
                                cine.getSalasCine()[1].getEspectadores()[fila][asiento] = new C_Espectador(nombre, dni);
                                System.out.println("¿Desea agregar otro espectador? (s/n)");
                                flag = sc.next().charAt(0);
                            } while (flag == 's');
                            if (cine.getSalasCine()[1].getCapacidad() > 5) {
                                System.out.println("La sala esta llena");
                            } else if(cine.getSalasCine()[1].getCapacidad() == 0) {
                                System.out.println("La sala esta vacia");
                            }
                        } catch (Exception e) {
                            System.out.println("Ha ingresado un dato erroneo");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese pelicula:");
                        String pelicula = sc.next();
                        cine.getSalasCine()[1].setPelicula(pelicula);
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
            case 3:
                System.out.println("Seleccione un Empleado:");
                for (int i = 0; i < cine.getEmpleados().length; i++) {
                    System.out.println(i + ". " + cine.getEmpleados()[i].toString());
                }
                int opcionEmpleado = sc.nextInt();
                System.out.println("Ingrese nuevo sueldo:");
                int nuevoSueldo = sc.nextInt();
                cine.getEmpleados()[opcionEmpleado].setSueldo(nuevoSueldo);
                System.out.println("Gracias por usar el programa.");
                break;
            case 4:
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