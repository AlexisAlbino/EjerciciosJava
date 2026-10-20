package s3_ejercicio2_software;

public class Main {
    public static void main(String[] args) {
        // Paso 2: Explicación de acceso directo
        // Si intento hacer:
        // Dispositivo d = new Dispositivo();
        // d.nombre = "Laptop";
        // Error de compilación: 'nombre has private access in Dispositivo'.
        // No compila

        // Paso 8: Crear dos objetos y usar setters
        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.setNombre("Laptop Gamer");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);

        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.setNombre("Servidor Backend");
        dispositivo2.setTipo("Servidor");
        dispositivo2.setActivo(false);

        // Paso 9: Consultar con getters
        System.out.println("CONSULTA CON GETTERS");
        System.out.println("Dispositivo 1: " + dispositivo1.getNombre() + " | Tipo: " + dispositivo1.getTipo() + " | Activo: " + dispositivo1.isActivo());
        System.out.println("Dispositivo 2: " + dispositivo2.getNombre() + " | Tipo: " + dispositivo2.getTipo() + " | Activo: " + dispositivo2.isActivo());

        // Paso 10: Probar dato incorrecto (validación)
        System.out.println("\nPRUEBA DE VALIDACIÓN");
        dispositivo1.setNombre(""); //mensaje de error y mantiene el nombre anterior
        System.out.println("Nombre tras la prueba: " + dispositivo1.getNombre());

        // Probar métodos de acción
        dispositivo2.activar();
        System.out.println("Estado actual dispositivo 2: " + dispositivo2.isActivo());
    }
}