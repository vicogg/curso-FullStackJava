package dia11febEjercicio2;
import java.util.Scanner;
public class Proceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String titular;
		double cantidad, 
			   monto_a_ingresar, 
			   monto_a_retirar,
			   permitido= 200000;
		Scanner Teclado = new Scanner(System.in);
		int opcion,
			opcionIng;
		Cuenta rene = new Cuenta();
		System.out.printf("Ingrese Nombre del titular de la cuenta \n ");
		titular = Teclado.nextLine();
		rene.setTitular(titular);
		
		System.out.printf("Ingrese La cantidad inicial de la cuenta: \n");
		cantidad = Teclado.nextDouble();
		rene.setCantidad(cantidad);

		System.out.println(rene.toString());
		opcion = 0;
		opcionIng = 0;
		do {
			
			System.out.println("***********************");
			System.out.println("Operaciones*****:");
			System.out.println("1.- Ingresar Dinero.- ");
			System.out.println("2.- Retirar Dinero.- ");
			System.out.println("0.- Salir del sistema.- ");
			System.out.println("***********************");
			System.out.println("Ingrese Opcion: ");
			opcion = Teclado.nextInt();
			switch (opcion) {
			case 1:
				do {
				System.out.println("Ingrese el monto a ingresar:");
				monto_a_ingresar = Teclado.nextDouble();
				rene.ingresar(monto_a_ingresar, permitido);
				System.out.println("Desea ingresar mas dinero?: ");
				System.out.println("1.- Si ");
				System.out.println("0.- no ");
				opcionIng = Teclado.nextInt();
				
				}while(opcionIng != 0);
				break;
			case 2:
				do {
				System.out.println("Ingrese el monto a retirar:");
				monto_a_retirar = Teclado.nextDouble();
				rene.retirar(monto_a_retirar, permitido);
				System.out.println("Desea retirar mas dinero?: ");
				System.out.println("1.- Si ");
				System.out.println("0.- no ");
				opcionIng = Teclado.nextInt();
				
				}while(opcionIng != 0);
				break;
			default:
				System.out.println("Gracias, hasta pronto.");
				break;
			}

		}while(opcion != 0);
	}

}
