package uno;

public class Estudiante extends Persona{
	
		static int curso;
		static int division;

		public Estudiante(String nombre, String apellido, int edad, int curso, int division) {
		super(nombre, apellido, edad);
		this.curso = curso;
		this.division = division;
		
		// TODO Auto-generated constructor stub
	}

		public static int getCurso() {
			return curso;
		}

		public static void setCurso(int curso) {
			Estudiante.curso = curso;
		}

		public static int getDivision() {
			return division;
		}

		public static void setDivision(int division) {
			Estudiante.division = division;
		}
		
		@Override
		public void saludo() {
			System.out.println("Hola soy " + this.getNombre() + " " + this.getApellido() + " y tengo " + this.getEdad() + " años. Soy del curso " + this.curso + " de la división " + this.division);
		}
		
		
		
	

}
