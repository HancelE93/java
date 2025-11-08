package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p=new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR;
		
		r1.base=10;
		r1.altura=5;
		
		
		r2.base=8;
		r2.altura=3;
		
		
		p.base=4;
		p.altura=2;
		
		areaR1 =r1.calcularArea();
		areaR2 =r2.calcularArea();
		
		perimetroR =p.calcularPerimetro();
		
		System.out.println("El area del Rectangul es: "+areaR1);
		System.out.println("El area del Rectangul es: "+areaR2);
		System.out.println("El perimetro del Rectangul es: "+perimetroR);;
	}

}
