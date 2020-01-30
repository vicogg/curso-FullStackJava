package dia30enero;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma, numero, ciclo;

		Scanner Teclado = new Scanner(System.in);
		
		ciclo=12;
		suma= 0;
		for (int i = 0; i <ciclo; i++) {
			//numero aleatorio de 1 a 100
			//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
			numero= (int)(Math.random()*(100-(1)+1) + 1);
			suma = suma+numero;
			System.out.printf("\n Sumando numero %s con valor: %s, Acumulado -> %s ",i+1, numero,  suma);
		}

	}

}
