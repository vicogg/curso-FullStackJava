package dia2901;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		Double nota;
		int contmayor, contmenor;
		Scanner  Teclado = new Scanner(System.in);
		
		contmayor = 0;
		contmenor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("\n Ingrese nota %s: ",i+1);
			nota = Teclado.nextDouble();
			if (nota>= 4 && nota <= 7) {
				contmayor++;
			}else if(nota< 4 && nota >=1) {
				contmenor++;
			}else {
				System.out.println("nota mal ingresada.");
			}
		}
		
		System.out.printf("\n El numero de aprobados es: %s  y reprobados es:  %s",contmayor, contmenor);
		
		
	}

}
