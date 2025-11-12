package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telf) {
		if (telf.getOperador() == "movi") {
			telf.tieneWhatsapp = true;
		} else if (telf.getOperador() != "movi") {
			telf.tieneWhatsapp = false;
		}
	}

	// Método para contar cuántos teléfonos son del operador "movi"
	// Ojo: aquí usamos int y NO Telefono como tipo de retorno
	// porque queremos devolver un número (cantidad), no un objeto Teléfono

	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contador = 0; // variable para almacenar la cantidad de teléfonos "movi"

		// Comprobamos cada teléfono y si es "movi" sumamos 1 al contador
		if (telf1.getOperador() == "movi") {
			contador += 1;
		}
		if (telf2.getOperador() == "movi") {
			contador += 1;
		}
		if (telf3.getOperador() == "movi") {
			contador += 1;
		}

		return contador;
	}

	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3,Telefono telf4) {
		int contador = 0; // variable para almacenar la cantidad de teléfonos "movi"

		// Comprobamos cada teléfono y si es "movi" sumamos 1 al contador
		if (telf1.getOperador() == "claro") {
			contador += 1;
		}
		if (telf2.getOperador() == "claro") {
			contador += 1;
		}
		if (telf3.getOperador() == "claro") {
			contador += 1;
		}
		if (telf4.getOperador() == "claro") {
			contador += 1;
		}

		return contador;
	}

}
