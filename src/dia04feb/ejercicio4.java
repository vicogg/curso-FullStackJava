package dia04feb;
import java.util.Scanner;
public class ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numIngresado, numMasAlto, guardaNumeroAlto, numMasBajo, acumNumeros,sumNegativos,sumPositivos;
		
		
		Scanner Teclado = new Scanner(System.in);
		numIngresado = 0;
		numMasAlto = 0;
		numMasBajo = 0;
		guardaNumeroAlto = 0;
		acumNumeros =0;
		sumNegativos=0;
		sumPositivos=0;
		do {
			System.out.println("ingrese un numero:");
			numIngresado = Teclado.nextInt();
			
			if (numIngresado > numMasAlto && numIngresado != -1) {
				numMasAlto = numIngresado;
				acumNumeros = acumNumeros + numIngresado;
				
			}else if(numIngresado < numMasAlto && numIngresado != -1) {
				numMasBajo = numIngresado;
				acumNumeros = acumNumeros + numIngresado;
			}
			
			if (numIngresado >=0) {
				sumPositivos = sumPositivos + numIngresado;
			}else if (numIngresado<0) {
				sumNegativos = sumNegativos + numIngresado;
			}
			
			
		} while (numIngresado !=-1);
		
		System.out.printf("El numero mas alto fue: %s",numMasAlto);
		System.out.printf("\nEl numero mas bajo fue: %s",numMasBajo);
		System.out.printf("\nEl acumulado es: %s",acumNumeros);
		System.out.printf("La suma de positivos es: %s",sumPositivos);
	}
	
}