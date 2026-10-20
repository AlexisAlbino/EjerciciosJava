public class MainUsuario {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      PRÁCTICA SW2.1 - USUARIO            ");
        System.out.println("==========================================");

        Usuario user = new Usuario();

        // Asignación de datos válidos
        user.setUsername("alexis_dev");
        user.setCorreo("alexis@ejemplo.com");
        user.setNivel(2);

        System.out.println("--- DATOS DEL USUARIO ---");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Correo: " + user.getCorreo());
        System.out.println("Nivel: " + user.getNivel());
        System.out.println("¿Activo?: " + user.isActivo());

        // Probar métodos activar y desactivar
        System.out.println("\n--- CAMBIO DE ESTADO ---");
        user.activar();
        user.desactivar();

        // Probar validaciones con datos incorrectos
        System.out.println("\n--- PRUEBA DE VALIDACIONES ---");
        user.setUsername("");
        user.setCorreo("   ");
        user.setNivel(-5);
    }
}