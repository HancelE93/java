package com.krakedev.excepciones;

public class ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a = "ddddd";
		try {// avita que mi programa no se caiga pero la excepcion si se produjo
			System.out.println("ABRE LA CONECCION BBD");
			a.substring(3);
			System.out.println("fin");
			
		} catch (Exception ex) {
			System.out.println("entrar al catch");
		}finally {
			System.out.println("ingresa al finally");
			//ocurra o no al excepcion se ejecuta el finnally
			System.out.println("CIERRA LA CONECCION BBD");
		}
		System.out.println("fuera del catch");
	}

}
