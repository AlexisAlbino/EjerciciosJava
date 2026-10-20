public class Tarea {
    // Atributos públicos
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Tarea: " + titulo);
        System.out.println("Horas estimadas: " + horasEstimadas);
    }

    public void completar() {
        completada = true;
        System.out.println("-> La tarea '" + titulo + "' se ha completado con éxito.");
    }

    // Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("Responsable: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("¿Está completada?: " + completada);
    }
}