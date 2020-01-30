package dia2901;
//realice un programam que permita ingresar N cantidad de numeros e indique cuantos son >= a 1000
import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
		int cantidad, valor, contmasmil, contmenosmil;

		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.printf("\n Ingrese la cantidad de números a ingresar: ");
	
		cantidad = Teclado.nextInt();
		contmasmil =0;
		contmenosmil= 0;
		for (int i = 0; i < cantidad; i++) {
			System.out.printf("Ingrese numero %s : ", i+1);
			valor = Teclado.nextInt();
			if (valor >= 1000) {
				contmasmil++;
			}else if(valor <1000) {
				contmenosmil++;
			}else {
				System.out.printf("Error, siguiente...");
			}
		}
		
		System.out.printf("valores mayores o iguales a 1000: %s, y menores son: %s",contmasmil, contmenosmil);
			
	}

}
