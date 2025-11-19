package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipes;

public class Juego {
	Naipes naipes; // Objeto naipes, contiene todas las cartas
    private ArrayList<Carta> naipeBarajado; // Naipe barajado
    ArrayList<ArrayList<Carta>> cartasJugador; // Lista de cartas por jugador
    private ArrayList<Integer> listaIDs; // Lista de IDs de jugadores

    // Constructor vacío
    public Juego() {
        naipes = new Naipes();
        listaIDs = new ArrayList<>();
        cartasJugador = new ArrayList<>();
        naipeBarajado = naipes.barajar(); // Barajamos el naipe al inicio
    }
    
 

    // Nuevo constructor para el test que recibe la lista de jugadores
    public Juego(ArrayList<String> listaJugadores) {
        naipes = new Naipes();
        listaIDs = new ArrayList<>();
        cartasJugador = new ArrayList<>();
        naipeBarajado = naipes.barajar();

        // Inicializamos los jugadores
        inicializarJugadores(listaJugadores.size());
    }

    // Inicializa jugadores y sus listas de cartas vacías
    public void inicializarJugadores(int cantidadJugadores) {
        for (int i = 1; i <= cantidadJugadores; i++) {
            listaIDs.add(i); // Guardamos el ID
            cartasJugador.add(new ArrayList<>()); // Lista vacía para cada jugador
        }
    }

    // Reparte cartas de forma secuencial
    public void entregarCartas(int cartasPorJugador) {
        int indiceActual = 0; // Comenzamos desde la primera carta del mazo
        for (int ronda = 0; ronda < cartasPorJugador; ronda++) { // Rondas de entrega
            for (int jugador = 0; jugador < cartasJugador.size(); jugador++) { // Cada jugador
                Carta carta = naipeBarajado.get(indiceActual); // Tomamos la carta
                cartasJugador.get(jugador).add(carta); // La damos al jugador
                indiceActual++; // Pasamos a la siguiente carta del mazo
            }
        }
    }

    // Devuelve las cartas de todos los jugadores
    public ArrayList<ArrayList<Carta>> getCartasJugador() {
        return cartasJugador;
    }

    // Mostrar resultados de cada jugador
    public void mostrarResultados(Jugadores jugadores) {
        for (int i = 0; i < cartasJugador.size(); i++) {
            System.out.println("Jugador " + jugadores.getJugadores().get(i) + " tiene " 
                + cartasJugador.get(i).size() + " cartas:");
            for (Carta carta : cartasJugador.get(i)) {
                carta.mostrarCarta(); // Muestra carta por carta
            }
            System.out.println();
        }
        // Muestra el ganador según puntaje total
        String ganador = determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }

    // Devuelve el total de puntos de un jugador (índice inicia en 0)
    public int devolverTotal(int indiceJugador) {
        ArrayList<Carta> cartasDelJugador = cartasJugador.get(indiceJugador);
        int total = 0;
        for (Carta carta : cartasDelJugador) {
            total += carta.getNumero().getValor(); // Sumamos los valores de las cartas
        }
        return total;
    }

    // Determina ganador por puntaje y retorna su ID
    public int determinarGanadorPorPuntaje() {
        int IDGanador = 1; // Suponemos que empieza siendo el primer jugador
        int SUMARGanador = devolverTotal(0); // Total del primer jugador

        // Recorremos los demás jugadores
        for (int id = 1; id < cartasJugador.size(); id++) {
            int totalJugador = devolverTotal(id); // Total del jugador actual
            if (totalJugador >= SUMARGanador) { // Si tiene más o igual puntaje
                SUMARGanador = totalJugador; // Actualizamos el total ganador
                IDGanador = id + 1; // Actualizamos el ID ganador (+1 porque IDs empiezan en 1)
            }
        }
        return IDGanador; // Retorna el ID del ganador
    }

    // Método que devuelve el ganador como String (para el test)
    public String determinarGanador() {
        int idGanador = determinarGanadorPorPuntaje();
        return "Jugador " + idGanador; // Retorna "Jugador X"
    }
}