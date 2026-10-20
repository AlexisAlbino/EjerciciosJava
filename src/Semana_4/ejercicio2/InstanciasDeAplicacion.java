public class Aplicacion {
    // Atributos privados y estáticos
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    // Constructor requerido
    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;                // 1. Incrementar totalAplicaciones
        this.id = totalAplicaciones;        // 2. Utilizar ese valor para generar id
        this.nombre = nombre;               // 3. Inicializar nombre
        this.version = version;             // 4. Inicializar version
        this.ejecutando = false;            // 5. Establecer ejecutando en false
    }

    // Métodos requeridos
    public void iniciar() {
        this.ejecutando = true;
        System.out.println("La aplicación '" + this.nombre + "' (v" + this.version + ") se ha INICIADO.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println("La aplicación '" + this.nombre + "' se ha CERRADO.");
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    // Getters opcionales para consulta
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isEjecutando() {
        return this.ejecutando;
    }
}