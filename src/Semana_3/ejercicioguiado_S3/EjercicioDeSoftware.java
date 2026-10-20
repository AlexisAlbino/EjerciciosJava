package s3_ejercicio3_software;

public class Dispositivo {
    // Atributos de instancia (pertenecen a cada objeto)
    private int id; // Desafío adicional: ID único
    private String nombre;
    private String tipo;
    private boolean activo;

    // Paso 5: Atributo compartido por toda la clase
    private static int contador = 0;

    // Pasos 2, 3 y 6: Constructor
    public Dispositivo(String nombre, String tipo) {
        contador++;         // Incrementa la variable compartida
        this.id = contador; // Desafío adicional: asigna el número actual como ID único
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false; // Por defecto nace apagado
    }

    // Paso 7: Metodo static para consultar el contador sin necesitar una instancia
    public static int getTotalCreados() {
        return contador;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarDetalle() {
        System.out.println("ID [" + id + "] -> Dispositivo: " + nombre + " | Tipo: " + tipo + " | Activo: " + activo);
    }
}