package com.krakedev.evaluacion;

public class Telefono {
	private String Numero;
	private String Tipo;
	private String Estado;
	
	
	
	public Telefono(String numero, String tipo) {

		this.Numero = numero;
		this.Tipo = tipo;
		
		
		// Estado por defecto asumimos que es erroneo al inicio
        this.Estado = "E";

        // 1️⃣ Validar que ninguno sea null o vacío
        if (Numero != null && Tipo != null && !Numero.equals("") && !Tipo.equals("")) {

            // 2️⃣ Validar que el tipo sea Movil o Convencional
            if (Tipo.equals("Movil") || Tipo.equals("Convencional")) {

                // 3️⃣ Validar longitud según el tipo
                if ((Tipo.equals("Movil") && Numero.length() == 10) ||
                    (Tipo.equals("Convencional") && Numero.length() == 7)) {

                    // Todo correcto
                    this.Estado = "C";
                }
            }
        }
        // Si alguna validación falla, Estado queda como "E"
    }

	public String getNumero() {
		return Numero;
	}
	
	public String getTipo() {
		return Tipo;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	
	
}
