package krakedev.entidades;

public class Nota {
    private Materia materia;      // El código/objeto de materia
    private double calificacion;  // La nota numérica

    // Constructor
    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Getter para la materia
    public Materia getMateria() {
        return materia;
    }

    // Getter para la calificación
    public double getCalificacion() {
        return calificacion;
    }
    
    

    public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	// Método para mostrar la información de la nota (según el enunciado)
    public void mostrar() {
        System.out.println("Materia: " + materia.getCodigo());
        System.out.println("Calificación: " + calificacion);
    }
}

