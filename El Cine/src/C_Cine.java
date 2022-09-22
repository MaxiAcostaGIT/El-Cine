public class C_Cine implements I_Informaciones {
    // ATRIBUTOS:
    private String nombreCine;
    private C_SalaCine[] salasCine;
    private C_Empleados[] empleados;

    // CONSTRUCTORES:
    public C_Cine(String nombreCine, int numSalas, int numEmpleados) {
        this.setNombreCine(nombreCine);
        this.setSalasCine(new C_SalaCine[numSalas]);
        this.setEmpleados(new C_Empleados[numEmpleados]);
    }

    // METODOS:

    public String getNombreCine() {
        return nombreCine;
    }
    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }
    public C_SalaCine[] getSalasCine() {
        return salasCine;
    }
    public void setSalasCine(C_SalaCine[] salasCine) {
        this.salasCine = salasCine;
    }
    public C_Empleados[] getEmpleados() {
        return empleados;
    }
    public void setEmpleados(C_Empleados[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String getName() {
        return "C_Cine";
    }

    @Override
    public String toString() {
        return "Nombre del Cine: " + this.getNombreCine() + " Salas: " + this.getSalasCine().length + " Empleados: " + this.getEmpleados().length;
    }
}
