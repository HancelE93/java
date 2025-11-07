package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		System.out.println("marca:"+a1.marca);
		System.out.println("año:"+a1.año);
		System.out.println("precio:"+a1.precio);
		
		a1.marca="Hyundai";
		a1.año=2025;
		a1.precio=15000;
		
		System.out.println("*****************");
		System.out.println("marca:"+a1.marca);
		System.out.println("año:"+a1.año);
		System.out.println("precio:"+a1.precio);
		System.out.println("*****************");
		
		a2.marca="KIA";
		a2.año=2026;
		a2.precio=25000;
		
		System.out.println("*****************");
		System.out.println("marca:"+a2.marca);
		System.out.println("año:"+a2.año);
		System.out.println("precio:"+a2.precio);
		System.out.println("*****************");
	}

}
