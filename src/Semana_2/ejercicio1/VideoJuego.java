package Semana_2.ejercicio1

public class Videojuego {
    // Atributos públicos
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre);
        System.out.println("Género: " + genero);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El videojuego " + nombre + " se ha iniciado.");
    }

    // Métodos con acceso por defecto
    void cerrar() {
        activo = false;
        System.out.println("El videojuego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("Versión: " + version);
    }
}