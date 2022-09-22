public class C_Cine {
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

}
