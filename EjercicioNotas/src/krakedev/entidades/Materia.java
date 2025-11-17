package krakedev.entidades;

public class Materia {
	public String Codigo;
	public String Nombre;
	
	
	public Materia(String codigo, String nombre) {
		super();
		Codigo = codigo;
		Nombre = nombre;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
