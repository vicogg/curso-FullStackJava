package realizandoejercicios;
import java.util.Scanner;
//1.	Realice un programa que pida números entre 0 y 9.999 y decir cuántas cifras tiene.
public class eje1guia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("ingrese un número:");
		num = Teclado.nextInt();
		
		if (num>0 && num <100) {
			System.out.println("Tiene dos digitos");
		}else if(num>100 && num<1000) {
			System.out.println("Tiene 3 digitos");
		}else if(num>1000 && num<10000)
		{
			System.out.println("Tiene 4 digitos");
			
		}else
		{
			System.out.println("Fuera de rango");
		}
	}
}
