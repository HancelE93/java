package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;

public class Prestamo {
	public double Monto; // Monto total del préstamo
	public double Interes; // Interés mensual en porcentaje o decimal
	public int Plazo; // Plazo del préstamo en meses
	public ArrayList<Cuota> cuotas; // Lista que almacenará las cuotas mensuales

	// Constructor que inicializa los atributos y la lista de cuotas
	public Prestamo(double monto, double interes, int plazo) {
		this.Monto = monto;
		this.Interes = interes;
		this.Plazo = plazo; //plazos es cada mes 

		cuotas = new ArrayList<>(); // Inicializamos la lista de cuotas vacía

		// Creamos cada cuota para cada mes del préstamo
		for (int i = 1; i <= plazo; i++) {
			// Cada Cuota conoce su número de mes (i)
			cuotas.add(new Cuota(i));
			// Ejemplo:
			// i = 1 → primer mes
			// i = 2 → segundo mes
			// ...
			// i = Plazo → último mes
		}
	}
	

	// ==============================
	// MÉTODO NECESARIO PARA EL BANCO
	// ==============================

	// Este método reemplaza al setAmortizacion()
	// Aquí simplemente asignamos la tabla generada por el Banco
	public void asignarTabla(ArrayList<Cuota> tabla) {
		this.cuotas = tabla;       
		// Ahora 'cuotas' tiene la tabla completa de amortización
	}

	public void mostrarPrestamo () {
		System.out.println("[Monto="+Monto+","+" interes="+Interes+","+" plazo="+","+"plazo="+Plazo+"]");
	}
	

	public double getMonto() {
		return Monto;
	}

	public void setMonto(double monto) {
		Monto = monto;
	}

	public double getInteres() {
		return Interes;
	}

	public void setInteres(double interes) {
		Interes = interes;
	}

	public int getPlazo() {
		return Plazo;
	}

	public void setPlazo(int plazo) {
		Plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

}
