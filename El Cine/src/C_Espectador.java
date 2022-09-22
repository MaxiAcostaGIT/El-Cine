public class C_Espectador extends A_Persona {
    public C_Espectador(String nombre, int dni) {
        super(nombre, dni);
    }

    //METODOS:
    public String toString() {
        return "Nombre: " + this.getNombre() + " DNI: " + this.getDni();
    }
    public String getName() {
        return "C_Espectador";
    }

}
