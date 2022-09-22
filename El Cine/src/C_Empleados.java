public class C_Empleados extends A_Persona implements I_Informaciones {
    private int sueldo;

    public C_Empleados(String nombre, int dni, int sueldo) {
        super(nombre, dni);
        this.setSueldo(sueldo);
    }

    //METODOS:
    void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " DNI: " + this.getDni() + " Sueldo: " + this.sueldo;
    }

    public String getName() {
        return "C_Empleados";
    }
}
