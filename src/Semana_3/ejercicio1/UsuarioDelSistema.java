public class Usuario {
    // Atributos privados
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    // Getters y Setters con Validaciones
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Error: El username no puede estar vacío.");
        }
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        } else {
            System.out.println("Error: El correo no puede estar vacío.");
        }
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            System.out.println("Error: El nivel debe ser mayor o igual a 0.");
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    // Métodos solicitar activación/desactivación
    public void activar() {
        this.activo = true;
        System.out.println("El usuario " + this.username + " ha sido ACTIVADO.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("El usuario " + this.username + " ha sido DESACTIVADO.");
    }
}