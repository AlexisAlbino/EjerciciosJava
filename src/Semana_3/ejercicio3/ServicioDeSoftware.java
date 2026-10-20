public class Servicio {
    // Atributos privados
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    // Getters y Setters con Validaciones
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del servicio no puede estar vacío.");
        }
    }

    public int getPuerto() {
        return this.puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: El puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public int getCantidadPeticiones() {
        return this.cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: La cantidad de peticiones no puede ser negativa.");
        }
    }

    // Métodos requeridos
    public void iniciar() {
        this.activo = true;
        System.out.println("El servicio '" + this.nombre + "' ha sido INICIADO en el puerto " + this.puerto + ".");
    }

    public void detener() {
        this.activo = false;
        System.out.println("El servicio '" + this.nombre + "' ha sido DETENIDO.");
    }

    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("Petición registrada en '" + this.nombre + "'. Total peticiones: " + this.cantidadPeticiones);
        } else {
            System.out.println("Error: No se pueden registrar peticiones porque el servicio está DETENIDO.");
        }
    }
}