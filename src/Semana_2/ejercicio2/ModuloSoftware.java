public class Modulo {
    // Atributos públicos
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Nombre del Módulo: " + nombre);
        System.out.println("Lenguaje de programación: " + lenguaje);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido marcado como TERMINADO.");
    }

    // Métodos con acceso por defecto
    void mostrarEstado() {
        System.out.println("¿Está terminado?: " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Versión: " + version);
    }
}