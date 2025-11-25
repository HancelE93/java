package com.kakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		//metodos estaticos pertenencen a la clase no al objeto
		//desde la calse,no hace falta instanciar objetos
		double numero=Math.random();
		System.out.println(numero);
		
		int radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
	}

}
