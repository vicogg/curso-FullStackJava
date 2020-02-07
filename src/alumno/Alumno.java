package alumno;

	
public class Alumno {

		
		int id;
		String nombres, apellido;
		Alumno(){
			//constructor vacio
		}
		
		Alumno( int id, String nombres, String apellido){
			this.id = id;
			this.nombres = nombres;
			this.apellido = apellido;
		}
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public void verDatos() {
			System.out.printf("\nSu Id: %s",id);
			System.out.printf("\nSus Nombres: %s",nombres);
			System.out.printf("\nSu Apellido: %s\n\n",apellido);
		}
}


