package alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante = new Estudiante();
		
		Alumno alu1 = new Alumno (111,"Juanito"," Pérez");
		Alumno alu2 = new Alumno (222, "Carlos", "Carrasco");
		
//		alu1.verDatos();
//		alu2.verDatos();
		
		System.out.println(alu1.id + " "+ alu1.nombres+ "" + alu1.apellido);
		
		System.out.println(alu1.getId()+ " " +alu1.getApellido() + " "+ alu1.getNombres());
		
		alu1.setApellido("Carmona");
		
		System.out.println(alu1.getId()+ " " +alu1.getApellido() + " "+ alu1.getNombres());
		System.out.println(alu1.getId());
		estudiante.setEdad(23);
		estudiante.setNombre("Rene C");
		System.out.println(estudiante.getNombre());
		System.out.println(estudiante.getEdad());
		
		alu1.verDatos();
	}

}
