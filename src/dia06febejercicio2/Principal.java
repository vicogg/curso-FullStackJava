package dia06febejercicio2;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, numm1, numm2;
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("ingrese numero 1:");
		num1 = Teclado.nextDouble();
		
		System.out.println("ingrese numero 2:");
		num2 = Teclado.nextDouble();

		Calculadora operaciones = new Calculadora (num1,num2);
		
		Testeando verificando = new Testeando(numm1, numm2);
		operaciones.suma();
		operaciones.resta();
		operaciones.division();
		operaciones.multiplicacion();
		
	}
	
}