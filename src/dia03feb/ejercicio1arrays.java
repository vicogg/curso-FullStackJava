package dia03feb;

import java.util.Scanner;

public class ejercicio1arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[][] = new int[4][4];
		int s=0;
		
		Scanner Teclado = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < x.length; j++) {			
			
			System.out.printf("Ingrese su numero en la posición: %s",s++);
			x[i][j] = Teclado.nextInt();
			}
		}
	}
	

	public static void imprimirArreglo(int[][] arreglo)
	{

		for (int fila = 0; fila < arreglo.length; fila++)
		{
		// itera a través de las columnas de la fila actual
		for (int columna = 0; columna < arreglo[fila].length; columna++)
			System.out.printf("%d", arreglo[fila][columna]);	
			System.out.println();
		}
	}


}