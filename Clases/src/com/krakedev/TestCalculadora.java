package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMult;
		double resultadoDiv;
		double resultadoPromediar;
		
		calcu= new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		
		calcu= new Calculadora();
		resultadoResta=calcu.restar(5, 2);
		
		calcu= new Calculadora();
		resultadoMult=calcu.multiplicar(10, 5);
		
		calcu= new Calculadora();
		resultadoDiv=calcu.dividir(10, 2);
		
		calcu= new Calculadora();
		resultadoPromediar=calcu.promediar(10,8,9);
		
		
		
		
		System.out.println("El resultado es:"+resultadoSuma);
		System.out.println("El resultado es:"+resultadoResta);
		System.out.println("El resultado es:"+resultadoMult);
		System.out.println("El resultado es:"+resultadoDiv);
		System.out.println("El resultado es:"+resultadoPromediar);
		
		Calculadora c;
		c=new Calculadora();
		c.mostrarResultado();
	}
	
	

}
