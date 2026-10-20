public class MainServidor {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("       PRÁCTICA SW3.3 - SERVIDORES        ");
        System.out.println("==========================================");

        Servidor serv1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor serv2 = new Servidor("ServidorBD", "192.168.1.50");

        System.out.println("Total servidores creados: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos iniciales: " + Servidor.getServidoresActivos());

        System.out.println("\n--- ACTIVANDO SERVIDORES ---");
        serv1.activar();
        serv2.activar();

        System.out.println("Servidores activos actuales: " + Servidor.getServidoresActivos());

        System.out.println("\n--- DESACTIVANDO UN SERVIDOR ---");
        serv1.desactivar();

        System.out.println("Servidores activos finales: " + Servidor.getServidoresActivos());
    }
}