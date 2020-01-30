package dia30enero;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad, contPar, contImpar;
		
		cantidad = 200;

		Scanner Teclado = new Scanner(System.in);
		contPar= 0;
		contImpar= 0;
		
//		forma simple... de 200 100 son par... i aumenta de 2 en 2
		for (int i = 0; i < cantidad; i=i+2) {
			contPar++;
		}
		
		System.out.printf("Pares: %s",contPar);
		
		
//		forma para cantidades cualquieras...		
		for (int i = 0; i < cantidad; i++) {
			if (i % 2 == 0) {
				System.out.printf("\nNumero: %s",i);
				contPar++;
			}
			else {
				contImpar++;
				System.out.printf("\nNumero: %s",i);
				
				System.out.printf("-> Es Impar, no cuenta");
			}
			System.out.printf("-> Es Par!! ... Van: %s pares",contPar);
		}
		
		System.out.printf("\n\nEl total de pares es: %s",contPar);
	}

}
