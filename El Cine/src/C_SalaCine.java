public class C_SalaCine {
    // ATRIBUTOS:
    private String nombreSala;
    private int capacidad;
    private String pelicula;
    // atributo asientos de 2 dimensiones, la primera dimension con la letra de la fila y la segunda con el numero de asiento:
    private String[][] asientos;


    // CONSTRUCTORES:
    public C_SalaCine(String nombreSala, int capacidad, String pelicula) {
        this.setNombreSala(nombreSala);
        this.setCapacidad(capacidad);
        this.setPelicula(pelicula);
    }

    // METODOS:
    public String getNombreSala() {
        return nombreSala;
    }
    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

}
