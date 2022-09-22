public class Main {
    public static void main(String[] args) {
        System.out.println("- CINE -");

        // CINE:
        C_Cine cine = new C_Cine("Cinepolis", 2, 2, 4);

        // SALAS:
        cine.getSalasCine()[0] = new C_SalaCine("Sala 1", 20, "Avengers");
        cine.getSalasCine()[1] = new C_SalaCine("Sala 2", 1, "Avatar");

        System.out.println(cine.getSalasCine()[0].getNombreSala());
    }
}