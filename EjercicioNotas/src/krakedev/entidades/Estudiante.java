package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	String cedula;
	String nombre;
	String apellido;

	ArrayList<Nota> notas; // ✔ Correcto: ArrayList de Nota

	// Constructor para inicializar el ArrayList y los atributos del estudiante
	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula; // Se asigna la cédula pasada como parámetro
		this.nombre = nombre; // Se asigna el nombre pasado como parámetro
		this.apellido = apellido; // Se asigna el apellido pasado como parámetro
		this.notas = new ArrayList<>(); // 🔹 importante
	}

	public Estudiante() {
		notas = new ArrayList<Nota>();

	}

	// Método para agregar una nueva nota
	public void agregarNota(Nota nuevaNota) {

		// 1️⃣ Validar que la calificación esté entre 0 y 10
		if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
			System.out.println("Error: La nota debe estar entre 0 y 10."); // Si la nota no está en el rango, muestra
																			// error
			return; // Sale del método sin agregar la nota
		}

		// 2️⃣ Revisar si ya existe otra nota con el mismo código de materia
		for (int i = 0; i < notas.size(); i++) {
			Nota notaExistente = notas.get(i); // Tomamos cada nota ya agregada

			// Comparamos el código de materia de la nota existente con el de la nueva
			if (notaExistente.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				System.out.println("Error: Ya existe una nota con ese código de materia para Estudiante [nombre=\"" + nombre + 
		                   "\", apellido=\"" + apellido + "\", cedula=\"" + cedula + "\"]");
				return; // Sale del método sin agregar la nota
			}
		}

		// 3️⃣ Si pasó todas las validaciones, se agrega la nota a la lista
		notas.add(nuevaNota);

		// ✅ Mensaje indicando que la nota se agregó, incluyendo información del
		// estudiante
		System.out.println("Nota agregada correctamente a Estudiante [nombre=\"" + nombre + "\", apellido=\"" + apellido
				+ "\", cedula=\"" + cedula + "\"]");
	}

	// Método para modificar la calificación de una materia por su código
	public void modificarNota(String Codigo, double nuevaNota) {

		// 1️⃣ Validar que la nueva calificación esté entre 0 y 10
		if (nuevaNota < 0 || nuevaNota > 10) {

			System.out.println("Error: La nota debe estar entre 0 y 10 para Estudiante [nombre=\"" + nombre
					+ "\", apellido=\"" + apellido + "\", cedula=\"" + cedula + "\"]"); // Mensaje de error si no cumple
																						// el rango
			return; // Sale del método
		}

		boolean encontrada = false; // Variable para saber si encontramos la materia

		// 2️⃣ Recorrer todas las notas
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i); // Tomamos cada nota

			// Comparamos el código de materia de la nota con el código pasado como
			// parámetro
			if (nota.getMateria().getCodigo().equals(Codigo)) {
				// 3️⃣ Modificar la calificación si se encontró
				nota.setCalificacion(nuevaNota);
				System.out.println("Nota modificada correctamente para Estudiante [nombre=\"" + nombre + 
		                   "\", apellido=\"" + apellido + "\", cedula=\"" + cedula + "\"]"); // Mensaje de confirmación
				encontrada = true; // Marcamos que se encontró
				break; // Salimos del bucle porque ya se modificó
			}
		}

		// 4️⃣ Si no se encontró ninguna nota con el código, se muestra un mensaje
		if (!encontrada) {
			System.out.println("No se encontró ninguna nota con ese código para Estudiante [nombre=\"" + nombre + 
	                   "\", apellido=\"" + apellido + "\", cedula=\"" + cedula + "\"]");
		}
	}

	// Método para calcular el promedio de las notas del estudiante
	public double calcularPromedioNotasEstudiante() {
		// 1️⃣ Verificar que haya notas, si no, devolver 0
		if (notas.size() == 0) {
			return 0.0;
		}

		double suma = 0.0; // Variable para acumular la suma de las calificaciones

		// 2️⃣ Recorrer todas las notas del ArrayList
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i); // Obtenemos la nota en la posición i
			suma += nota.getCalificacion(); // Sumamos la calificación
		}

		// 3️⃣ Calcular el promedio dividiendo la suma entre la cantidad de notas
		double promedio = suma / notas.size();

		// 4️⃣ Retornar el promedio calculado
		return promedio;
	}

	public void mostrar() {
		System.out.println(
				"Estudiante [nombre=\"" + nombre + "\", apellido=\"" + apellido + "\", cedula=\"" + cedula + "\"]");
		System.out.println("Notas:");
		for (Nota nota : notas) {
			System.out.println("Notas [materia=\"" + nota.getMateria().getCodigo() + "\", calificacion=\""
					+ nota.getCalificacion() + "\"]");
		}
	}

}