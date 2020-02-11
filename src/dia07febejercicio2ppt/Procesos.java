package dia07febejercicio2ppt;
import java.util.Scanner;
public class Procesos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Teclado = new Scanner(System.in);
		double precio;
		String nombre, codigo;		
		Producto papa_lays = new Producto ();
		
		System.out.printf("\n Ingrese nombre del producto:");
		nombre = Teclado.nextLine();		
		papa_lays.setNombre(nombre);
		
		System.out.printf("\n Ingrese código del producto: ");
		codigo = Teclado.nextLine();
		papa_lays.setCodigo(codigo);
		
		System.out.printf("\n Ingrese el precio ");
		precio = Teclado.nextDouble();
		papa_lays.setPrecio(precio);
		
		System.out.printf("El producto %s con código %s tiene un precio de: %.0f ", papa_lays.getNombre(), papa_lays.getCodigo(), papa_lays.getPrecio());
	}
	

}
