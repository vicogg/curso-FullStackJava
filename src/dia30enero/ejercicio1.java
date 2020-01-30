package dia30enero;
/*
 * 1.	Realice el código en java, para obtener la suma de 15 cantidades mediante la utilización de un ciclo
“Mientras”. Desarrolle el correspondiente seudocódigo. (Tiempo aproximado 20 min).
 */
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, suma, i;

		Scanner Teclado = new Scanner(System.in);
		
		i=0;
		suma=0;
		while (i<15) {
			numero= (int)(Math.random()*(1-(100)+1) + 100);
			suma = suma+numero;
			System.out.printf("\n Sumando numero %s con valor: %s, Acumulado -> %s ",i+1, numero,  suma);
			i++;
		}

	}

}
