public interface EstacionTransporte {
    void listarEstaciones(); // Imprime todas las estaciones en la estructura
    int contarEstaciones(); // Cuenta el número total de estaciones en la estructura
    boolean buscarEstacion(String nombre); // Busca una estación específica
}
