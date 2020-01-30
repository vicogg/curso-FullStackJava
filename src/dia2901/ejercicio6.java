package dia2901;
import java.util.Scanner;
public class ejercicio6 {
		public static void main(String[] args) {
			
			int multiplo = 5, valor;
			Scanner Teclado = new Scanner(System.in);

			
			for (int i = 0; i <= 50; i++) {
				if (i>4) {
					System.out.printf("\n %s x %s = %s",multiplo, i, multiplo*i);
				}
			}
			
		}
}
