package Strings;

public class eje1talentosdigitales {
	
	public static void main(String[] args) {
		String  palabra1,palabra2,cap1, palabra1lower, palabra2lower, cap2, texto= "Talento Digital";
		
		
		System.out.printf("\n Tamaño total de la palabra: %s de la texto %s",texto.length(), texto);
		
		System.out.printf("\n Caracter de la 7ma posición: %s",texto.charAt(6));
		
		System.out.printf("\n Palabra desde el tercer caracter: %s",texto.substring(2));
		
		System.out.printf("\n Cortando la palabra: %s",texto.substring(8, 15));
		
		
		palabra1=texto.substring(0, 7);
		palabra2=texto.substring(8, 15);
		palabra1lower = palabra1.toLowerCase();
		cap1 = palabra1.substring(0, 1).toUpperCase() + palabra1.substring(1);
		System.out.printf("\n String Concatenado: %s",palabra1.concat(palabra2));
		
		System.out.printf("\n Indice de la primera aparición de la Letra a:  %s",texto.indexOf("a"));
		
		System.out.printf("\n Indice de la letra a comenzando desde la primera a: %s",texto.indexOf("a", 1+1));
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", cap1, palabra1lower);
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", cap1, cap1);
		
		System.out.printf("\n Comprobando igualdad de: %s con %s", palabra1lower, palabra1lower);
		
		System.out.println("********************************************");
		System.out.printf("\n Comprobando la igualdad: %s",cap1.equals(palabra1lower));	
		
		System.out.printf("\n Comprobando la igualdad: %s",cap1.equals(cap1));
		
		System.out.printf("\n Comprobando la igualdad: %s",palabra1lower.equals(palabra1lower));
		
		System.out.printf("\n Si palabra1 = pal1lower: %s",cap1.equalsIgnoreCase(palabra1lower));
		
		System.out.printf("\n Cambiando a minusculas: %s",texto.toLowerCase());

		System.out.printf("\n Cambiando a mayusculas: %s",texto.toUpperCase());

		System.out.printf("\n String Original: %s",texto);

		System.out.printf("\n Cambiando g por j: %s",texto.replace("g", "j"));

	}

}
