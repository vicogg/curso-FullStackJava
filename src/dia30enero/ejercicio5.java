package dia30enero;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad, num, contmayorCero, contMenoroIgualACero;
		

		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("ingrese cantidad de numeros	:");
		cantidad = Teclado.nextInt();
		
		contmayorCero = 0;
		contMenoroIgualACero = 0;
		System.out.printf("\n\n Para un cantidad de %s números: ",cantidad);
		for (int i = 0; i < cantidad; i++) {
			num= (int)(Math.random()*(20-(-20)+1) + -20);
			//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
			
			if (num >0) {
				contmayorCero ++;
			}else if(num <= 0) {
				contMenoroIgualACero ++;
			}else {
				System.out.println("erro");
				}
			System.out.printf("\n Mostrando numero %s: %s , van %s mayores a cero  y %s menores o iguales a cero",i+1,num, contmayorCero, contMenoroIgualACero);
		}
		
		System.out.printf("\n Los numeros mayores a cero son: %s  y los menores o iguales a cero  son %s",contmayorCero, contMenoroIgualACero);

	}

}