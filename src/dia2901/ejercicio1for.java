package dia2901;
import java.util.Scanner;
public class ejercicio1for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declaramos suma como doble
		Double suma= 0.0;
		Scanner Teclado = new Scanner(System.in);
		
//		for de 0 a 9
		for (Double i = 0.0; i < 10; i++) {
//			la suma de i
			suma = suma +i;
			
		}
//		suma dividivo 10 num
		System.out.printf("Promedio: %s",suma/10);
	}

}
