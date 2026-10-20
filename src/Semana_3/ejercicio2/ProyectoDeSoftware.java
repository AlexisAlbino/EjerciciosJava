public class Proyecto {
    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Getters y Setters con Validaciones
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return this.progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (this.progreso == 100) {
                this.terminado = true;
            } else {
                this.terminado = false;
            }
        } else {
            System.out.println("Error: El progreso solamente puede estar entre 0 y 100.");
        }
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    // Método para avanzar
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            if (this.progreso + porcentaje <= 100) {
                this.progreso += porcentaje;
                System.out.println("Avanzó " + porcentaje + "%. Progreso actual: " + this.progreso + "%");
                if (this.progreso == 100) {
                    this.terminado = true;
                    System.out.println("¡El proyecto ha llegado al 100% y está TERMINADO!");
                }
            } else {
                System.out.println("Error: No se puede avanzar. El progreso nunca debe superar 100.");
            }
        } else {
            System.out.println("Error: El porcentaje a avanzar debe ser mayor a 0.");
        }
    }
}