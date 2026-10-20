package Semana_2.ejercicio1

public class MainVideojuego {
    public static void main(String[] args) {
        // Crear 3 objetos independientes
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura / Sandbox";
        juego1.version = "1.20";

        Videojuego juego2 = new Videojuego();
        juego2.nombre = "EA Sports FC 24";
        juego2.genero = "Deportes";
        juego2.version = "1.0";

        Videojuego juego3 = new Videojuego();
        juego3.nombre = "Grand Theft Auto V";
        juego3.genero = "Acción / Mundo Abierto";
        juego3.version = "1.5";

        // Probar el primer videojuego
        System.out.println("=== VIDEOJUEGO 1 ===");
        juego1.mostrarInformacion();
        juego1.mostrarVersion();
        juego1.iniciar();

        // Probar el segundo videojuego
        System.out.println("\n=== VIDEOJUEGO 2 ===");
        juego2.mostrarInformacion();
        juego2.mostrarVersion();
        juego2.iniciar();

        // Probar el tercer videojuego
        System.out.println("\n=== VIDEOJUEGO 3 ===");
        juego3.mostrarInformacion();
        juego3.mostrarVersion();
        juego3.cerrar();
    }
}