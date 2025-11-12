package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado (Contacto c1, Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else if(c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	// Este método compara si dos teléfonos tienen el mismo operador
	// Nota: No usamos .equals() porque dijiste que no quieres usarlo
	// Pero se usa 'boolean' como tipo de retorno porque true/false no son Telefono
	public boolean compararOperadores(Telefono telf1, Telefono telf2) {

	    // telf1.getOperador() obtiene el operador del primer teléfono
	    // telf2.getOperador() obtiene el operador del segundo teléfono
	    // Usamos '==' para comparar referencias de los Strings (solo funciona seguro con literales)
	    if (telf1.getOperador() == telf2.getOperador()) {
	        // Si las referencias apuntan al mismo literal "movi", devolvemos true
	        return true;
	    } else {
	        // Si son diferentes, devolvemos false
	        return false;
	    }

	    // Nota: No podemos poner 'return telf1;' porque el método está declarado
	    // como boolean, no Telefono. Por eso usamos true/false.
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.telefono.tieneWhatsapp) {
			c1.activo=true;
		}else {
			c1.activo=false;
		}
	}
	

}
