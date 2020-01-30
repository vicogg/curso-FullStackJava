package dia2901;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, contn, contp, mult15, par, aleatorio;
		Scanner Teclado = new Scanner(System.in);
		
		contn= 0;
		contp= 0;
		mult15= 0;
		par= 0;
//		aleatorio= ;
		 for(int i = 0; i<10; i++) {
			 
			 /*
			  *  Para obtener un número entero entre dos valores DESDE , HASTA, ambos incluidos, debemos usar la fórmula:

 					(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 

			Por ejemplo, para generar 5 números enteros al azar entre 8 y 15:

			for(int i = 1; i<=5; i++)
     System.out.println((int)(Math.random()*(15-8+1)+8));
     
     
			  */
	     	numero= (int)(Math.random()*(100-(-100)+1) + -100);
	     	
//	     	System.out.printf("\n numero %s : %s ",i+1,numero);
	    if (numero < 0) {
	    	
			contn++;
			System.out.printf("\n %s es negativo: ",numero);
		}else if(numero >=0){
			contp++;
			System.out.printf("\n %s es positivo: ",numero);
		}
	    
	    if(numero % 15 == 0) {
	    	mult15++;
	    	System.out.printf("\n %s es multiplo de 15: ",numero);
	    }
	    
	    if(numero % 2== 0) {
	    	par++;
	    	System.out.printf("\n %s es par: ",numero);
	    }
		 }
		 
	 System.out.printf("\n \n Los numeros negativos son: %s , positivos %s, multiplos de 15: %s, pares: %s",contn, contp,mult15,par);
		}
		
		
	}


