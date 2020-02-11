package dia10febEjercicio1;
import java.util.ArrayList;
import java.util.Arrays;
public class Libro {
	
	String libro_titulo,
		   libro_autor
			;
	int libro_n_totales,
		libro_n_prestados;
	
	
	
	public Libro() {
		
	}



	public Libro(String libro_titulo, String libro_autor, int libro_n_totales, int libro_n_prestados) {
		super();
		this.libro_titulo = libro_titulo;
		this.libro_autor = libro_autor;
		this.libro_n_totales = libro_n_totales;
		this.libro_n_prestados = libro_n_prestados;
	}


	public String getLibro_titulo() {
		return libro_titulo;
	}

	public void setLibro_titulo(String libro_titulo) {
		this.libro_titulo = libro_titulo;
	}

	public String getLibro_autor() {
		return libro_autor;
	}

	public void setLibro_autor(String libro_autor) {
		this.libro_autor = libro_autor;
	}

	public int getLibro_n_totales() {
		return libro_n_totales;
	}

	public void setLibro_n_totales(int libro_n_totales) {
		this.libro_n_totales = libro_n_totales;
	}

	public int getLibro_n_prestados() {
		return libro_n_prestados;
	}

	public void setLibro_n_prestados(int libro_n_prestados) {
		this.libro_n_prestados = libro_n_prestados;
	}
	
	public int prestarLibro() {
		if(libro_n_totales > 0) {
			System.out.printf("\n hay disponibles para entrega\n");
			System.out.println("Disponibles: "+libro_n_totales+ " libros");
			libro_n_prestados ++;
			libro_n_totales--;
			System.out.println("Ahora quedan "+libro_n_totales+ " disponibles.");
			return 1;
		}else {
			System.out.printf("\n Lo siento no quedan disponibles");
			return 0;
		}
		
	}
	
	public void devolverLibro() {
		if (libro_n_prestados == 0) {
			System.out.println("Lo siento no tenemos libros para recibir, tenemos todo el stock");
		}else {
			System.out.println("Libro recibido");
			libro_n_prestados--;
			libro_n_totales++;
			System.out.println("Libros totales:"+libro_n_totales);
		}
	}
	

	


	
	
	

}
