package s3_ejercicio2_software;

public class Dispositivo {
    // Paso 1: Atributos convertidos a private
    private String nombre;
    private String tipo;
    private boolean activo;

    // Paso 3 y 7: Setter de nombre con uso de this y validación (no vacío)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del dispositivo no puede estar vacío.");
        }
    }

    // Paso 4: Getter de nombre
    public String getNombre() {
        return this.nombre;
    }

    // Paso 5: Getters y Setters para tipo y activo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    // Paso 9 (Desafío adicional): Métodos de acción
    public void activar() {
        this.activo = true;
        System.out.println("-> Dispositivo " + this.nombre + " encendido.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("-> Dispositivo " + this.nombre + " apagado.");
    }
}