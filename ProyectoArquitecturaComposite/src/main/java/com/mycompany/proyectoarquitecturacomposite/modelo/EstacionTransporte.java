package com.mycompany.proyectoarquitecturacomposite.modelo;

public interface EstacionTransporte {
    void listarEstaciones(); // Se eliminó el argumento incorrecto
    int contarEstaciones();
    boolean buscarEstacion(String nombre);
}
