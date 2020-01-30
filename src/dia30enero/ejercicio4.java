package dia30enero;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int estatura, promedioEstatura, sumaEstatura, cantidadAtletas, cont, contAtletasCorrectos, contAtletasError;

		Scanner Teclado = new Scanner(System.in);
		estatura= 0;
		sumaEstatura = 0;
		contAtletasCorrectos = 0;
		contAtletasError = 0;
		System.out.println("Ingrese la cantidad de atletas: ");
		cantidadAtletas = Teclado.nextInt();
		
		cont=0;
		do {
			System.out.printf("\n ingrese estatura en cm (  margen desde 45 cm a 250 cm):");
			estatura = Teclado.nextInt();
			if(estatura>=50 && estatura<=250) {
					sumaEstatura = sumaEstatura + estatura;		
					contAtletasCorrectos++;
			}
			else {
				System.out.printf("\n Estatura fuera de rango \n\n\n");
				contAtletasError++;
			}
			
			cont++;
			
		} while (cont< cantidadAtletas);
		promedioEstatura = sumaEstatura/contAtletasCorrectos;
		System.out.printf("\nEl promedio de estatura: %s",promedioEstatura);
		System.out.printf("\nEstaturas fuera de rango: %s",contAtletasError);

	}

}