package com.cmc.directorio.entidades;

public class Telefono {
	private String operador;
	private String numero;
	 int codigo;
	boolean tieneWhatsapp = false;

	public Telefono(String operador, String numero, int codigo) {
		
		this.operador = operador;
		this.numero = numero;
		this.codigo = codigo;

	}
	
	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public void imprimir() {
		System.out.println("Operador: " + operador + " numero: " + numero + " codigo: " +codigo+" Tiene Whatsapp: "+tieneWhatsapp);
	}

}
