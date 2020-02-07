package dia03feb;
/*
 * Mejore su el programa de calculadora, debe validar datos numéricos ,
 *  manejo de errores, además de  un debe tener un Usuario y password, 
 *  el cual luego de errar 3 veces, cerrara nuestro programa. 
 *  Nuestro programa no se debe cerrar,hasta que el usuario desee salir.
	Debe existir la opción de seguir realizando otras operaciones hasta que 
	el usuario desee salir. 

 */
import java.util.Scanner;
public class ejercicio1ppt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definiendo variables
		String datoUsuario[][] = new String[3][3];	
		String usuario, password,numeroUno, numeroDos;
		int acumError, suma,opcion, resta, division, multiplicacion;
		//Asignando un usuario manualmente
		datoUsuario[0][0] = "Carlos";
		datoUsuario[0][1] = "carlito";
		datoUsuario[0][2] = "123";
		
		//Creando Scanner Teclado
		Scanner Teclado = new Scanner(System.in);
		
		
		
		//Inicializando variables a 0;
		acumError=0;
		opcion= 0;
		//hacer mientras no sobrepasen los 3 errores
		do {
			//Ingresando usuario carlito
			System.out.println("Ingrese usuario: ");
			usuario = Teclado.nextLine();
			//Ingresar clave 123
			System.out.println("Ingrese password: ");
			password = Teclado.nextLine();
			// validando usuario y clave, si son las asignadas se inicia la consulta de numeros		
			if (usuario.equals(datoUsuario[0][1]) && password.equals(datoUsuario[0][2])){
				System.out.println("*********Bienvenido al sistema *******");
				System.out.println("**************************************");
					//Solicitando numero 1
				System.out.println("Ingrese Número 1");
				numeroUno = Teclado.nextLine();
					// solicitando numero 2
				System.out.println("Ingrese Número 2");
				numeroDos = Teclado.nextLine();
				 
				//Repetir el menu hasta que opcion sea 0
				do{
					
					//Mostrando menu de opciones
					System.out.println("1.- Sumar:");
					System.out.println("2.- Restar:");
					System.out.println("3.- Dividir:");
					System.out.println("4.- Multiplicar:");
					System.out.println("0.- Salir:");
					System.out.println("Seleccione la opción a evaluar:");
					opcion = Teclado.nextInt();
					
					//switch con opciones y operaciones ( sumar, restar, dividir, multiplicar)
					switch (opcion) {
					case 1:
						try {
							suma = Integer.parseInt(numeroUno)+Integer.parseInt(numeroDos) ;
							System.out.printf("\n La suma de %s + %s es: %s \n",numeroUno,numeroDos, suma);
						} catch (Exception e) {
							System.out.println("Erro fatal,  puede que haya ingresado caracteres no numericos");
						}
						break;
					case 2:
						try {
							resta = Integer.parseInt(numeroUno)-Integer.parseInt(numeroDos) ;
							System.out.printf("\n La resta de %s - %s es: %s \n",numeroUno,numeroDos, resta);
						} catch (Exception e) {
							System.out.println("Erro fatal,  puede que haya ingresado caracteres no numericos");
						}
						break;
					case 3:
						try {
							division = Integer.parseInt(numeroUno)/Integer.parseInt(numeroDos) ;
							System.out.printf("\n La division de %s / %s es: %s \n",numeroUno,numeroDos, division);
						} catch (Exception e) {
							System.out.println("Erro fatal,  puede que haya ingresado caracteres no numericos");
						}
						break;
					case 4:
						try {
							multiplicacion = Integer.parseInt(numeroUno)*Integer.parseInt(numeroDos) ;
							System.out.printf("\n La multiplicacion de %s * %s es: %s \n",numeroUno,numeroDos, multiplicacion);
						} catch (Exception e) {
							System.out.println("Erro fatal,  puede que haya ingresado caracteres no numericos");
						}
						break;
					default:
						if (opcion ==0) {
							// si se presiona la opcion 0 se muestra este mensaje
							System.out.printf("Saliendo del sistema\n");
						}else {
							System.out.printf("\n Opcion no valida. Reintentar \n");
						}
						
						
						break;
					}
				
				}while(opcion != 0);
			}else if(acumError<2) {
				System.out.println("Error en el ingreso, intentelo nuevamente");
			}
			
			acumError = acumError+1;
			
			
		} while (acumError<3);	
		//saliendo del sistema
		System.exit(0);
		
	
		
	}
	
}