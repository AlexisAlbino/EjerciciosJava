public class MainAplicacion {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRÁCTICA SW3.2 - INSTANCIAS DE APP     ");
        System.out.println("==========================================");

        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("ControlInventario", "2.1");

        System.out.println("App 1 ID: " + app1.getId() + " | Nombre: " + app1.getNombre());
        app1.iniciar();

        System.out.println("\nApp 2 ID: " + app2.getId() + " | Nombre: " + app2.getNombre());
        app2.iniciar();
        app2.cerrar();

        System.out.println("\nTotal de aplicaciones creadas: " + Aplicacion.getTotalAplicaciones());
    }
}