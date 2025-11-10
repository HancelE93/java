package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		System.out.println("marca:"+a1.getMarca());
		System.out.println("año:"+a1.getAño());
		System.out.println("precio:"+a1.getPrecio());
		
		a1.setMarca("Hyundai");
		a1.setAño(2025);
		a1.setPrecio(15000);
		
		System.out.println("*****************");
		System.out.println("marca:"+a1.getMarca());
		System.out.println("año:"+a1.getAño());
		System.out.println("precio:"+a1.getPrecio());
		System.out.println("*****************");
		
		a2.setMarca("KIA");
		a2.setAño(2026);
		a2.setPrecio(25000);
		
		System.out.println("*****************");
		System.out.println("marca:"+a2.getMarca());
		System.out.println("año:"+a2.getAño());
		System.out.println("precio:"+a2.getPrecio());
		System.out.println("*****************");
	}

}
