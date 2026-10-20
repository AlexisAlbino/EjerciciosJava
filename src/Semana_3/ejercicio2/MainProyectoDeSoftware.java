public class MainProyecto {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      PRÁCTICA SW2.2 - PROYECTO           ");
        System.out.println("==========================================");

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Sistema Web Universitario");
        proyecto.setResponsable("Alexis Albino");
        proyecto.setProgreso(80);

        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Responsable: " + proyecto.getResponsable());
        System.out.println("Progreso Inicial: " + proyecto.getProgreso() + "%");
        System.out.println("¿Terminado?: " + proyecto.isTerminado());

        // Avanzar progreso dentro del límite permitido
        System.out.println("\n--- AVANZANDO PROYECTO ---");
        proyecto.avanzar(10); // Llega a 90%

        // Intentar avanzar superando el 100%
        System.out.println("\n--- PRUEBA DE LÍMITE MAYOR A 100 ---");
        proyecto.avanzar(15); // Debe dar error

        // Avanzar exacto hasta el 100%
        System.out.println("\n--- FINALIZANDO PROYECTO ---");
        proyecto.avanzar(10); // Llega al 100% y se marca terminado
        System.out.println("¿Terminado?: " + proyecto.isTerminado());
    }
}