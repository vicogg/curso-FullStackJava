package dia06feb;
import java.util.Scanner;
public class Programa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad, id;
		String nombres, apellido;
		
		
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese id: ");
		id = Teclado.nextInt();
		
		System.out.println("Ingrese Nombre");
		nombres = Teclado.next();
		
		System.out.println("Ingrese Apellido");
		apellido = Teclado.next();
		
		System.out.println("Ingrese Edad: ");
		edad = Teclado.nextInt();
		Alumno altest = new Alumno(id, nombres, apellido, edad);
		
		altest.verificarEdad();
		
	}
	
}