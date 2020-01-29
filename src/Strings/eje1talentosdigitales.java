package Strings;

public class eje1talentosdigitales {
	
	public static void main(String[] args) {
		String  pal1,pal2,cap1, pal1lower, pal2lower, cap2, cadena= "Talento Digital";
		
		
		System.out.printf("\n Tamaño total del string: %s de la cadena %s",cadena.length(), cadena);
		
		System.out.printf("\n Caracter de la 7ma posición: %s",cadena.charAt(6));
		
		System.out.printf("\n Palabra desde el tercer caracter: %s",cadena.substring(2));
		
		System.out.printf("\n Cortando la palabra: %s",cadena.substring(8, 15));
		
		
		pal1=cadena.substring(0, 7);
		pal2=cadena.substring(8, 15);
		pal1lower = pal1.toLowerCase();
		cap1 = pal1.substring(0, 1).toUpperCase() + pal1.substring(1);
		System.out.printf("\n String Concatenado: %s",pal1.concat(pal2));
		
		System.out.printf("\n Indice de la primera aparición de la Letra a:  %s",cadena.indexOf("a"));
		
		System.out.printf("\n Indice de la letra a comenzando desde la primera a: %s",cadena.indexOf("a", 1+1));
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", cap1, pal1lower);
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", cap1, cap1);
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", pal1lower, pal1lower);
		
		System.out.println("********************************************");
		System.out.printf("\n Comprobando la igualdad: %s",cap1.equals(pal1lower));	
		
		System.out.printf("\n Comprobando la igualdad: %s",cap1.equals(cap1));
		
		System.out.printf("\n Comprobando la igualdad: %s",pal1lower.equals(pal1lower));
		
		System.out.printf("\n Si pal1 = pal1lower: %s",cap1.equalsIgnoreCase(pal1lower));
		
		System.out.printf("\n Cambiando a minusculas: %s",cadena.toLowerCase());
		System.out.println("");
		System.out.printf("\n Cambiando a mayusculas: %s",cadena.toUpperCase());
		System.out.println("");
		System.out.printf("\n String Original: %s",cadena);
		System.out.println("");
		System.out.printf("\n Cambiando g por j: %s",cadena.replace("g", "j"));
		System.out.println("");
	}

}
