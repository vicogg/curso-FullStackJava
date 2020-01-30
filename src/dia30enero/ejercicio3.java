package dia30enero;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		int op, participantes, edad, promedioEdad, sumaEdad;
		int acum;
		
		int num;
		participantes= 150;
		sumaEdad=0;
		op = 0;
		do {
			System.out.printf("\n\nCon que ciclo desea evaluar la edad de los participantes:\n");
			System.out.println("1.- FOR");
			System.out.println("2.- WHILE");
			System.out.println("3.- DO WHILE");
			op = Teclado.nextInt();
			
			
			switch (op) {
			case 1:
				
				//	CON FOR			
				for (int i = 0; i < participantes ; i++) {
					edad= (int)(Math.random()*(75-(18)+1) + 18);
					//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
					sumaEdad = sumaEdad+edad;
					System.out.printf("\n Edad del participante N %s -> %s ",i+1, edad);
					System.out.printf("\n La edad promedio acumulada es: %s \n ",(sumaEdad/(i+1)));
				}
				
//				se resetean las variables
				edad = 0;
				sumaEdad= 0;
				break;
			case 2:
//				CON FOR
				acum = 0;
				while (acum < participantes) {
					edad= (int)(Math.random()*(75-(18)+1) + 18);
					//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
					sumaEdad = sumaEdad+edad;
					System.out.printf("\n Edad del participante N %s -> %s ",acum+1, edad);
					System.out.printf("\n La edad promedio acumulada es: %s \n ",(sumaEdad/(acum+1)));
					
					acum++;
				}		
//				se resetean las variables
				edad = 0;
				sumaEdad= 0;
				break;
			case 3:
//				CON DO WHILE
				acum = 0;
				do {
					edad= (int)(Math.random()*(75-(18)+1) + 18);
					//(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
					sumaEdad = sumaEdad+edad;
					System.out.printf("\n Edad del participante N %s -> %s ",acum+1, edad);
					System.out.printf("\n La edad promedio acumulada es: %s \n ",(sumaEdad/(acum+1)));
					
					acum++;
				} while (acum < participantes);
				
//				se resetean las variables
				edad = 0;
				sumaEdad= 0;
				break;

			default:
				System.out.println("Opcion no valida, reintentar. \n\n");
				break;
			}
			
		} while (op !=1 || op !=2 || op !=3);
		

		

	}

}
