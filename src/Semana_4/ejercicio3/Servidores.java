public class Servidor {
    // Atributos privados y estáticos
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    // Constructor requerido
    public Servidor(String nombre, String direccionIP) {
        totalServidores++;                  // 1. Incrementar totalServidores
        this.id = totalServidores;          // 2. Asignar el contador a id
        this.nombre = nombre;               // 3. Inicializar nombre
        this.direccionIP = direccionIP;     // 4. Inicializar direccionIP
        this.activo = false;                // 5. Establecer activo en false (comienza apagado)
    }

    // Métodos con el desafío de control de servidores activos
    public void activar() {
        if (!this.activo) {                 // Si estaba apagado
            this.activo = true;
            servidoresActivos++;            // Incrementa servidores activos
            System.out.println("Servidor '" + this.nombre + "' activado correctamente.");
        } else {
            System.out.println("El servidor '" + this.nombre + "' ya se encontraba activo.");
        }
    }

    public void desactivar() {
        if (this.activo) {                  // Si estaba activo
            this.activo = false;
            servidoresActivos--;            // Disminuye servidores activos
            System.out.println("Servidor '" + this.nombre + "' desactivado.");
        } else {
            System.out.println("El servidor '" + this.nombre + "' ya estaba inactivo.");
        }
    }

    // Métodos estáticos y getters
    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isActivo() {
        return this.activo;
    }
}