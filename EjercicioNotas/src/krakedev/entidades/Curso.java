package krakedev.entidades;

import java.util.ArrayList;


public class Curso {
	 ArrayList<Estudiante>estudiantes;
	 
	 public Curso() {
		    // Aquí se crea el ArrayList que va a guardar todos los estudiantes del curso
		    estudiantes = new ArrayList<Estudiante>();
		}

		public String buscarEstudiantePorCedula(Estudiante estudiante) {
		    // Este método recibe un estudiante y busca si ya está en el curso

		    for(int i = 0; i < estudiantes.size(); i++) {  // Recorre todos los estudiantes del ArrayList
		        Estudiante buscarCedula = estudiantes.get(i);  // Toma el estudiante en la posición i
		        
		        if (buscarCedula.cedula == estudiante.cedula) { // Compara la cédula del estudiante actual con la cédula del estudiante que buscamos
		            return "El estudiante está en el curso";  // Si encuentra coincidencia, retorna este mensaje
		        }
		    }
		    
		    return null; // Si recorre todo el ArrayList y no encuentra ninguna cédula igual, retorna null
		}
		// Método para matricular un estudiante
		public void matricularEstudiante(Estudiante estudiante) {
		    // Verificamos si el estudiante ya está en el curso usando nuestro método
		    if (buscarEstudiantePorCedula(estudiante) == null) { 
		        // Si no está (retorna null), lo agregamos al ArrayList
		        estudiantes.add(estudiante);
		        // Mensaje de confirmación mostrando nombre, apellido y cédula
		        System.out.println("Estudiante matriculado correctamente: [nombre=\"" + estudiante.nombre + 
		                           "\", apellido=\"" + estudiante.apellido + 
		                           "\", cedula=\"" + estudiante.cedula + "\"]");
		    } else {
		        // Si ya está, mostramos un mensaje mostrando nombre, apellido y cédula
		        System.out.println("El estudiante ya está matriculado: [nombre=\"" + estudiante.nombre + 
		                           "\", apellido=\"" + estudiante.apellido + 
		                           "\", cedula=\"" + estudiante.cedula + "\"]");
		    }
		}
	    
	    public double calcularPromedioCurso() {
	        // 1️⃣ Verificar que haya estudiantes, si no, devolver 0
	        if (estudiantes.size() == 0) {
	            return 0.0;
	        }

	        double sumaPromedios = 0.0; // Acumula los promedios individuales

	        // 2️⃣ Recorrer todos los estudiantes
	        for (int i = 0; i < estudiantes.size(); i++) {
	            Estudiante est = estudiantes.get(i);
	            sumaPromedios += est.calcularPromedioNotasEstudiante(); // Sumar el promedio de cada estudiante
	        }

	        // 3️⃣ Dividir la suma entre la cantidad de estudiantes
	        double promedioCurso = sumaPromedios / estudiantes.size();

	        // 4️⃣ Retornar el promedio del curso
	        return promedioCurso;
	    }
	    
	    public void mostrar() {
	        for (int i = 0; i < estudiantes.size(); i++) {
	            Estudiante est = estudiantes.get(i);
	            System.out.println("Estudiante [nombre=\"" + est.nombre + 
	                               "\", apellido=\"" + est.apellido + 
	                               "\", cedula=\"" + est.cedula + "\"]");
	        }
        }

		public ArrayList<Estudiante> getEstudiantes() {
			return estudiantes;
		}

		public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
			this.estudiantes = estudiantes;
		}
	    
	    
}