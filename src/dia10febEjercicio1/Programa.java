package dia10febEjercicio1;
import java.util.Scanner;
public class Programa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String libro_titulo,
		   		libro_autor;
	int libro_n_totales = 2,
		libro_n_prestados = 1,
		filas=2,
		columnas= 2;
	
		Scanner Teclado = new Scanner(System.in);
		
		
//		Libro 1
		
		Libro ejemplar1 = new Libro();
		System.out.println("Ingrese Titulo para el libro 1");
		libro_titulo = Teclado.next();		
		ejemplar1.setLibro_titulo(libro_titulo);
		System.out.println("Ingrese Autor del libro 1");
		libro_autor = Teclado.next();		
		ejemplar1.setLibro_autor(libro_autor);
		System.out.println("Ingrese el total de ejemplares para el libro 1");
		libro_n_totales = Teclado.nextInt();
		ejemplar1.setLibro_n_totales(libro_n_totales);
		System.out.println("Ingrese el total de ejemplares prestados para libro 1");
		libro_n_prestados = Teclado.nextInt();
		ejemplar1.setLibro_n_prestados(libro_n_prestados);
		
		
//		Libro 2
		Libro ejemplar2 = new Libro("Papelucho", "Marcela Paz", 5, 2);
		
		//prestar dos libro del ejemplar 1
		System.out.println("Prestando un libro...............");
		System.out.println("Verificando disponibilidad");
		ejemplar1.prestarLibro();
		ejemplar1.prestarLibro();
		
		// devolviendo libros
		
		ejemplar1.devolverLibro();
	}
	
}