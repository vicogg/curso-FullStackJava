package dia2901;
/* desarrolle un 	programa que realice la carga de 10 numeros
 * e imprima la suma de los ultimos 5 valores ingresado
 * 
 */
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		int numero, acum;
		acum= 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("Ingrese el numero %s :", i+1);
			numero = Teclado.nextInt();
			if(i>4) {
				acum = acum+numero;
			}
		}
		
		System.out.printf("La suma de los ultimos numeros es: %s",acum);
		

	}

}
