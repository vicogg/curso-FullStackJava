package dia03feb;
import java.util.Scanner;
public class ejercicio2ppt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][]= new int [4][4];
		int numero;
		
		Scanner Teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
				numero= (int)(Math.random()*(9-(1)+1) + 1);
		
				array[i][j]= numero;	
			}
		}
		
		imprimirArreglo(array);
		
	}
	
	public static void imprimirArreglo(int[][] arreglo)
	{

		System.out.println("Imprimiendo arreglo: \n");
		for (int fila = 0; fila < arreglo.length; fila++)
		{
		// itera a través de las columnas de la fila actual
		for (int columna = 0; columna < arreglo[fila].length; columna++)
			
			System.out.printf("%d", arreglo[fila][columna]);	
			System.out.println();
		}
	}
	
}