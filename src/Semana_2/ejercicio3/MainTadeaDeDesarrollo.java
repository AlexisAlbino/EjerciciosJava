public class MainTarea {
    public static void main(String[] args) {
        // Crear 3 tareas
        Tarea tarea1 = new Tarea();
        tarea1.titulo = "Diseñar estructura de Base de Datos";
        tarea1.responsable = "Alexis";
        tarea1.horasEstimadas = 6.5;

        Tarea tarea2 = new Tarea();
        tarea2.titulo = "Crear interfaz gráfica en IntelliJ";
        tarea2.responsable = "Carlos";
        tarea2.horasEstimadas = 8.0;

        Tarea tarea3 = new Tarea();
        tarea3.titulo = "Realizar pruebas unitarias";
        tarea3.responsable = "Ana";
        tarea3.horasEstimadas = 4.0;

        // Completar SOLAMENTE una tarea (la primera)
        System.out.println("--- ACTUALIZANDO ESTADO ---");
        tarea1.completar();

        // Mostrar resultados y comprobar que solo la primera cambió
        System.out.println("\n=== TAREA 1 ===");
        tarea1.mostrarInformacion();
        tarea1.mostrarResponsable();
        tarea1.mostrarEstado();

        System.out.println("\n=== TAREA 2 ===");
        tarea2.mostrarInformacion();
        tarea2.mostrarResponsable();
        tarea2.mostrarEstado();

        System.out.println("\n=== TAREA 3 ===");
        tarea3.mostrarInformacion();
        tarea3.mostrarResponsable();
        tarea3.mostrarEstado();
    }
}