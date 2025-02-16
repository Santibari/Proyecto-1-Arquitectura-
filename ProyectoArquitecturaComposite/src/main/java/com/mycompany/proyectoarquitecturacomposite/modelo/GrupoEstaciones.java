import java.util.ArrayList;
import java.util.List;

public class GrupoEstaciones implements EstacionTransporte {
    private String nombre;
    private List<EstacionTransporte> estaciones = new ArrayList<>();

    public GrupoEstaciones(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstacion(EstacionTransporte estacion) {
        estaciones.add(estacion);
    }

    public void eliminarEstacion(EstacionTransporte estacion) {
        estaciones.remove(estacion);
    }

    @Override
    public void listarEstaciones() {
        System.out.println("Grupo: " + nombre);
        for (EstacionTransporte estacion : estaciones) {
            estacion.listarEstaciones();
        }
    }

    @Override
    public int contarEstaciones() {
        int total = 0;
        for (EstacionTransporte estacion : estaciones) {
            total += estacion.contarEstaciones();
        }
        return total;
    }

    @Override
    public boolean buscarEstacion(String nombre) {
        for (EstacionTransporte estacion : estaciones) {
            if (estacion.buscarEstacion(nombre)) {
                return true;
            }
        }
        return false;
    }
}
