package dia06feb;

public class Alumno {
	
	int id, edad;
	String nombres, apellido;
	
	Alumno(){
		
	}
	
	Alumno(int id, String nombres, String apellido, int edad){
		
		this.id = id;
		this.nombres = nombres;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void verificarEdad(){
		if(edad >= 18) {
			System.out.printf(" El Alumno %s %s es mayor de edad: %s Años", nombres, apellido, edad);
		}else {
			System.out.printf(" El Alumno %s %s es menor de edad: %s Años", nombres, apellido, edad);

		}
	}

}
