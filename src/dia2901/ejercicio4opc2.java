package dia2901;
//se cuenta con la siguiente información:
/* las edades de 10 estudiantes del turno mañana.
 * las edades de 7 estudiantes del turno tarde.
 * las edades de 5 estudiantes turno noche.
 * las edades de cada estudiante deben ingresarse por teclado.
 * 
 * a) obtener el promedio de las edades de cada turno ( tres promedios)
 * b) imprimir dichos promedios ( promedio de cada turno)
 * c) mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio
 * de edades mayor.
 * 
 */

import java.util.Scanner;
public class ejercicio4opc2 {
public static void main(String[] args) {
	
	String promMan, promTar, promNoch;
	int edad, sumedadm,sumedadt,sumedadn;
	Scanner Teclado = new Scanner(System.in);
	sumedadm = 0;
	sumedadt = 0;
	sumedadn = 0;
	for (int i = 0; i < 10; i++) {
		System.out.printf("\n ingrese la edad del estudiante Nº %s de mañana:", i);
		edad = Teclado.nextInt();
		sumedadm = sumedadm + edad;
	}
	System.out.println("**********************************");
	System.out.println("**********************************");
		promMan = Integer.toString(sumedadm/10);
	System.out.printf("El promedio de edad de estudiantes de mañana es: %s",promMan);
	System.out.println("**********************************");
	System.out.println("**********************************");
	for (int i = 0; i < 7; i++) {
		System.out.printf("\n ingrese la edad del estudiante Nº %s de tarde:", i);
		edad = Teclado.nextInt();
		sumedadt = sumedadt + edad;
	}
	System.out.println("**********************************");
	System.out.println("**********************************");
	promTar = Integer.toString(sumedadt/7);
	System.out.printf("El promedio de edad de estudiantes de tarde es: %s",promTar);
	System.out.println("**********************************");
	System.out.println("**********************************");
	for (int i = 0; i < 5; i++) {
		System.out.printf("\n ingrese la edad del estudiante Nº %s de noche:", i);
		edad = Teclado.nextInt();
		sumedadn = sumedadn + edad;
	}
	System.out.println("**********************************");
	System.out.println("**********************************");
	promNoch = Integer.toString(sumedadn/5);
	System.out.printf("El promedio de edad de estudiantes de noche es: %s",promNoch);
	System.out.println("**********************************");
	System.out.println("**********************************");

	int compara = promMan.compareTo(promTar);
	
	System.out.printf("valor comparacion: %s",compara);
}
}
