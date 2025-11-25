package com.kakedev.estaticos;

public class Calculos {
// con final se vuelve una contante fija y no se puede cambiar se vuelve una constante
// contante una vez q toma una variable inicial no se puede cambiar
// es decir la contasnte es fija
/// constantes va tood en mayuscula
	private final double IVA= 12;

	public double calcularIva(double monto) {
		return monto * IVA / 100;
	}
}
