package entidades;

import java.util.ArrayList;

public class Naipes {
	ArrayList<Numero>numerosPosibles;
	ArrayList<Carta>cartas;
	ArrayList<Carta>auxiliar;
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
    // 🔹 Constructor vacío
    public Naipes() {
    	numerosPosibles = new ArrayList<>(); // inicializamos la lista
        cartas = new ArrayList<>();   
        auxiliar=new ArrayList<>();
        // inicializamos la lista de cartas
     // Agregar los 13 números del naipe con su valor correcto
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));  // usualmente vale 10
        numerosPosibles.add(new Numero("Q", 10));  // usualmente vale 10
        numerosPosibles.add(new Numero("K", 10));  // usualmente vale 10
    
     // Crear los palos usando la clase Palos
        Palos palos = new Palos();

        // Generar las 52 cartas usando for con índices
        for (int i = 0; i < numerosPosibles.size(); i++) {
            Numero num = numerosPosibles.get(i);

            cartas.add(new Carta(num, palos.getCorazonRojo()));
            cartas.add(new Carta(num, palos.getCorazonNegro()));
            cartas.add(new Carta(num, palos.getDiamante()));
            cartas.add(new Carta(num, palos.getTrebol()));
        }
    }
    
    public ArrayList<Carta> barajar () {
    	// Arreglo que va a contener las cartas mezcladas
    	//en este caso seria el nuevo mazo de cartas
        ArrayList<Carta> auxiliar = new ArrayList<>();

        // Primer paso: 100 intentos usando posiciones aleatorias
        for (int i = 0; i < 100; i++) {

            // Generamos una posición aleatoria entre 0 y 51
            int pos = Random.ObtenerPosicion();

            // Obtenemos la carta que está en esa posición
            Carta carta = cartas.get(pos);

            // Si su estado es "n", significa que no ha sido agregada
            if (carta.getEstado().equals("N")) {

                // La agregamos al auxiliar
                auxiliar.add(carta);

                // Cambiamos su estado a "c" para marcarla como usada
                carta.setEstado("C");
            }

            // Si el estado es "c", ya fue agregada y no hacemos nada
        }

        // Segundo paso:
        // Recorrer todas las cartas con un for normal
        // para agregar las que quedaron en estado "n"
        for (int i = 0; i < cartas.size(); i++) {

            // Obtenemos la carta en la posición i
            Carta carta = cartas.get(i);

            // Si todavía está sin usar...
            if (carta.getEstado().equals("N")) {

                // La agregamos al auxiliar
                auxiliar.add(carta);

                // Marcamos que ya fue agregada
                carta.setEstado("C");
            }
        }

        // El auxiliar ya tiene las 52 cartas mezcladas
        return auxiliar;
    }

}
	

