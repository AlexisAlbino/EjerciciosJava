package s3_ejercicio3_software;

public class Main {
    public static void main(String[] args) {
        // Paso 8: Consultar el total antes de crear objetos
        System.out.println("Dispositivos creados al inicio: " + Dispositivo.getTotalCreados());

        // Paso 4: Creación de objetos usando el constructor
        Dispositivo d1 = new Dispositivo("Router", "Red");
        System.out.println("Total tras crear 1: " + Dispositivo.getTotalCreados());

        Dispositivo d2 = new Dispositivo("Teclado Mecánico", "Periférico");
        Dispositivo d3 = new Dispositivo("Monitor 144Hz", "Pantalla");

        // Paso 8: Consultar nuevamente mediante el metodo static
        System.out.println("Total tras crear 3 objetos: " + Dispositivo.getTotalCreados());

        System.out.println("\n=== DETALLES DE CADA DISPOSITIVO (DATOS INDEPENDIENTES) ===");
        d1.mostrarDetalle();
        d2.mostrarDetalle();
        d3.mostrarDetalle();
    }
}