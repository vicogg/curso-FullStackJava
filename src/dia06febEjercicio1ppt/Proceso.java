package dia06febEjercicio1ppt;
import java.util.Scanner;
public class Proceso {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		String nombre, rut, apellido, domicilio;
		System.out.printf("\n ingrese nombre:");
		nombre = Teclado.next();
		
		System.out.printf("\n ingrese apellido:");
		apellido = Teclado.next();
		
		System.out.printf("\n ingrese domicilio:");
		domicilio = Teclado.next();
		
		System.out.printf("\n ingrese rut:");
		rut = Teclado.next();
		
		Persona luchito = new Persona(rut, nombre, apellido, domicilio);
		System.out.printf("\n %s", luchito.toString() );
		
	}
	
}