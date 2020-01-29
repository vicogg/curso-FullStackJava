package realizandoejercicios;
import java.util.Scanner;
//2.	Pedir una hora de la forma, hora, minutos y segundos, y mostrar la hora en el segundo siguiente (si los segundos superan los 59
//los reiniciamos a 0, al igual que los minutos. Si la hora supera las 23 la reiniciamos a 0
public class eje2guia {
	public static void main(String[] args) {
		
		int minutos, segundos, hora, segundonuevo, minutosnuevo, horanueva, segundosceros, minutosceros, horaceros;
		Scanner Teclado = new Scanner(System.in);
		
		do {
		System.out.println("ingrese la hora en el formato 24 hrs:");
		hora = Teclado.nextInt();
		}while(hora>23);
		
		
		do {
		System.out.println("ingrese minutos formato 00 a 60:");
		minutos = Teclado.nextInt();
		}while(minutos>60 || minutos < 00);
		
		do {
		System.out.println("ingrese segundos:");
		segundos = Teclado.nextInt();
		}while(segundos >60 || segundos <00 );
		
		System.out.println("Hora Inicial: "+hora+":"+minutos+":"+segundos);
		
		segundonuevo = segundos+ 01;
		minutosnuevo = minutos + 01;
		horanueva= hora+ 01;
		if (segundonuevo > 59 && minutosnuevo>59 && hora == 23) {
			segundosceros = 00;
			minutosceros = 00;
			horaceros = 00;
			System.out.println("Hora con un segundo mas: "+horaceros+":"+minutosceros+":"+segundosceros);
			
		}else if (segundonuevo > 59 &&  minutosnuevo>59 && hora <23) {
			
			System.out.println("Hora con un segundo mas: "+horanueva+":"+minutos+":"+segundos);
			
		}else if (segundonuevo > 59 &&  minutosnuevo<=59 && hora <=23) { 
			System.out.println("Hora con un segundo mas: "+horanueva+":"+minutosnuevo+":"+segundonuevo);
			
		}
		else {
			System.out.println("Hora con un segundo mas: "+horanueva+":"+minutosnuevo+":"+segundonuevo);
		}
		}
	}
	

