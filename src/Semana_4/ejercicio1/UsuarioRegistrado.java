public class Usuario {
    // Atributos privados y estáticos
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;

    // Constructor requerido
    public Usuario(String username, String correo) {
        contadorUsuarios++;                 // 1. Incrementar contador
        this.id = contadorUsuarios;         // 2. Asignar ese valor al id
        this.username = username;           // 3. Inicializar username
        this.correo = correo;               // 4. Inicializar correo
        this.activo = true;                 // 5. Establecer automáticamente en true
    }

    // Getters y método estático para obtener el total
    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getCorreo() {
        return this.correo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }
}