package dia30enero;

import java.util.Scanner;
/*
 * 7.	Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana 
 * (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas, 
 * con esto saber si trabaja las horas por ley y además si recibe más o menos del sueldo mínimo. Realice el 
 * código respectivo en java. 
 */
public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * horas diaras , total semana, total mes, sueldo minimo definir, horas extras.
		 */
		int  semana;
		int  horasSemana,   horasLegalesSemana= 45,   totalHoras, valorHora, valorhoraextra, totalValorHorasExtras, horasExtras;
		int SueldoMinimo, SueldoRecibido;
		Scanner Teclado = new Scanner(System.in);
		
		
		
		semana= 0;
		totalHoras=0;
		valorHora = 7000;
		valorhoraextra = 14000;
		horasExtras= totalHoras-(horasLegalesSemana*4);
		SueldoMinimo = 350000;
				do {
					System.out.println("Ingrese las horas para la semana "+(semana+1));
					horasSemana = Teclado.nextInt();
					if (horasSemana > horasLegalesSemana) {
						totalHoras = totalHoras +horasSemana;	
						System.out.printf("\n Ha sobrepasado las horas legales semanales permitidas de 45, calculando las horas extras... \n");
						
					}else if(horasSemana <=horasLegalesSemana) {

						
						
						totalHoras = totalHoras +horasSemana;
					}
					semana++;
				} while (semana<4);
				
				System.out.printf("\n Total horas trabajadas: %s ",totalHoras);
				System.out.printf("\nHoras Extras: %s",totalHoras-(horasLegalesSemana*4));
				
				
				totalValorHorasExtras = horasExtras*valorhoraextra;
				SueldoRecibido = totalHoras*valorHora;
				
				if (SueldoRecibido > SueldoMinimo) {
					System.out.printf("\n Ha recibido mas del sueldo minimo: %s", SueldoRecibido);
				}else if(SueldoRecibido <= SueldoMinimo) {
					System.out.printf("\n Su sueldo a recibir es: %s ", SueldoRecibido);
				}
				else {
					System.out.println("Error");
				}
		
	}

}