package entidades;

public class Numero {
	private String numeroCartas;
	private int valor;
	
	public Numero(String numeroCartas, int valor) {
		this.numeroCartas = numeroCartas;
		this.valor = valor;
	}

	public String getNumeroCartas() {
		return numeroCartas;
	}

	public void setNumeroCartas(String numeroCartas) {
		this.numeroCartas = numeroCartas;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void mostrarNumero() {
		System.out.println(numeroCartas+"-"+valor);
	}
	
	
	
}
