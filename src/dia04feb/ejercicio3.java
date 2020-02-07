package dia04feb;
import java.util.Scanner;
public class ejercicio3 {
//3.Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int columnas=0, filas = 4, numero;
		int arreglo[][] = new int [filas][columnas];
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de columnas");
		columnas = Teclado.nextInt();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
				numero= (int)(Math.random()*(10-(0)+1) + 0);
				System.out.printf("%d ",numero);
			}
			System.out.println();
		}
		
	}
	
}
