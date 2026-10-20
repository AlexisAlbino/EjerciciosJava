public class MainModulo {
    public static void main(String[] args) {
        // Crear los tres objetos requeridos: Login, Inventario y Reportes
        Modulo login = new Modulo();
        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = true;

        Modulo inventario = new Modulo();
        inventario.nombre = "Inventario";
        inventario.lenguaje = "Java";
        inventario.version = "2.1";
        inventario.terminado = false;

        Modulo reportes = new Modulo();
        reportes.nombre = "Reportes";
        reportes.lenguaje = "Python";
        reportes.version = "0.9";
        reportes.terminado = false;

        // Mostrar datos de los 3 módulos
        System.out.println("=== MÓDULO 1: LOGIN ===");
        login.mostrarInformacion();
        login.mostrarVersion();
        login.mostrarEstado();

        System.out.println("\n=== MÓDULO 2: INVENTARIO ===");
        inventario.mostrarInformacion();
        inventario.mostrarVersion();
        inventario.mostrarEstado();
        inventario.marcarTerminado(); // Cambiamos el estado
        inventario.mostrarEstado();

        System.out.println("\n=== MÓDULO 3: REPORTES ===");
        reportes.mostrarInformacion();
        reportes.mostrarVersion();
        reportes.mostrarEstado();
    }
}