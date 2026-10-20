public class MainUsuario {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRÁCTICA SW3.1 - USUARIOS REGISTRADOS");
        System.out.println("==========================================");

        // Crear cuatro usuarios
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("m_gomez", "marian@correo.com");
        Usuario u3 = new Usuario("alexis_dev", "alexis@correo.com");
        Usuario u4 = new Usuario("carlos99", "carlos@correo.com");

        // Mostrar resultados comprobando el contador estático
        System.out.println("Usuario 1 ID: " + u1.getId() + " - " + u1.getUsername());
        System.out.println("Usuario 2 ID: " + u2.getId() + " - " + u2.getUsername());
        System.out.println("Usuario 3 ID: " + u3.getId() + " - " + u3.getUsername());
        System.out.println("Usuario 4 ID: " + u4.getId() + " - " + u4.getUsername());

        System.out.println("\nTotal de usuarios registrados: " + Usuario.getContadorUsuarios());
    }
}