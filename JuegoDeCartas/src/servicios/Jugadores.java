package servicios;

import java.util.ArrayList;

public class Jugadores {
	 private ArrayList<String> jugadores; // cambiamos nombres a jugadores para que coincida con el test

	    public Jugadores() {
	        jugadores = new ArrayList<>();
	    }

	    // Getters y Setters
	    public ArrayList<String> getJugadores() {
	        return jugadores;
	    }

	    public void setJugadores(ArrayList<String> jugadores) {
	        this.jugadores = jugadores;
	    }

	    // Agregar un jugador
	    public void agregarJugador(String nombre) {
	        jugadores.add(nombre);
	    }

	    // Retorna el primer jugador
	    public String jugarPrimero() {
	        if (jugadores.size() > 0) {
	            return jugadores.get(0);
	        } else {
	            return null;
	        }
	    }
	
	
	   public void jugarConJuego(Juego juego) {
	        // 1️⃣ Agregar 3 jugadores
	        agregarJugador("Ana");
	        agregarJugador("Luis");
	        agregarJugador("Carlos");

	        // 2️⃣ Inicializar cartas del juego según cantidad de jugadores
	        juego.inicializarJugadores(jugadores.size());

	        // 3️⃣ Entregar 5 cartas por jugador
	        juego.entregarCartas(5);

	        // 4️⃣ Mostrar resultados y cartas de cada jugador
	        juego.mostrarResultados(this);

	        // 5️⃣ Determinar e imprimir el ganador
	        String ganador = juego.determinarGanador();
	        System.out.println("El ganador es: " + ganador);
	    }
	
    
    
}
