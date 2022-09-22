public class C_SalaCine {
    // ATRIBUTOS:
    private String nombreSala;
    private int capacidad;
    private String pelicula;
    private C_Espectador[][] espectadores;

    // CONSTRUCTORES:
    public C_SalaCine(String nombreSala, int capacidad, String pelicula) {
        this.setNombreSala(nombreSala);
        this.setCapacidad(capacidad);
        this.setPelicula(pelicula);
        espectadores = new C_Espectador[capacidad][capacidad];
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
    ////////////////////////////////////////
    public C_Espectador[][] getEspectadores() {
        return espectadores;
    }
    public void setEspectadores(C_Espectador[][] espectadores) {
        this.espectadores = espectadores;
    }
}
