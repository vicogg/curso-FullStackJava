package realizandoejercicios;
import java.util.Scanner;

public class eje3guia {
	public static void main(String[] args) {
		Double sueldobase, dias, gratificacion, horasextras, comision, bono, colacion, movilizacion, haberes, deberes;
		Double afp, isapre, segurocesantia, valorhora=3.500, haberHoras, sueldoliquido;
		int opc;
		
		
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("ingrese sueldo base: ");
		sueldobase = Teclado.nextDouble();
		
		System.out.println("ingrese dias trabajados:");
		dias = Teclado.nextDouble();
		
		System.out.println("ingrese % Gratificacion del mes ( 0 a 100 ):");
		gratificacion = Teclado.nextDouble();
		
		System.out.println("Ingrese horas extras: ");
		horasextras = Teclado.nextDouble();
		haberHoras = valorhora*horasextras;
		System.out.println("Ingrese dinero comisión del mes: ");
		comision = Teclado.nextDouble();
		
		bono = 25.000;
		colacion = 8.000;
		movilizacion = 15.000;
		
		haberes = bono + colacion + movilizacion + ((sueldobase*gratificacion)/100) + haberHoras +comision;
		
		afp = 0.115;
		segurocesantia = 0.0411;
		
		deberes = sueldobase*afp + sueldobase*segurocesantia;
		
		do {
		System.out.println("1.-ISAPRE o 2.-FONASAS: ");
		opc = Teclado.nextInt();
		}while(opc <1 ||  opc >2 );
		switch (opc) {
		case 1:
			System.out.println("Ingrese & de Plan de isapre: ");
			isapre = Teclado.nextDouble();
			
			break;
		case 2:
			System.out.println("Fonasa 7%: ");
			isapre = 0.07;
			break;

		default:
			
			break;
		}
		sueldoliquido= sueldobase+haberes+deberes;
		System.out.printf("\n Sueldo base: %s ",sueldobase);
		System.out.printf("\n Sueldo liquido: &s",sueldoliquido);
		
		
	}

}
