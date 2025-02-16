public class EstacionIndividual implements EstacionTransporte {
    private String nombre;

    public EstacionIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void listarEstaciones() {
        System.out.println("- " + nombre);
    }

    @Override
    public int contarEstaciones() {
        return 1;
    }

    @Override
    public boolean buscarEstacion(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }
}
