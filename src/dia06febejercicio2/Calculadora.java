package dia06febejercicio2;
import java.util.Scanner;
public class Calculadora {
	
	
    double division, num1, num2, suma, resta,  multiplicacion;
	public Calculadora() {
		
	}
	
	public Calculadora(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void inicializar() {
		
	}
	
	public void suma() {
		suma = num1+num2;
		System.out.printf("\n La suma es: %.0f",suma);
	}
	
	public void resta() {
		resta = num1-num2;
		System.out.printf("\n La resta es: %.0f",resta);
	}
	
	public void division() {
		if (num2 == 0) {
			System.out.println("\n No es posible realizar, ya que no se puede dividir por cero.");
		}else {
			division = num1/num2;
			System.out.printf("\n La division es: %.5f",division);
		}
	
	}
	
	public void multiplicacion() {
		
		
		multiplicacion = num1*num2;
		System.out.printf("\n La multiplicacion es: %.0f ",multiplicacion, suma, resta);
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double getResta() {
		return resta;
	}

	public void setResta(double resta) {
		this.resta = resta;
	}

	public double getMultiplicacion() {
		return multiplicacion;
	}

	public void setMultiplicacion(double multiplicacion) {
		this.multiplicacion = multiplicacion;
	}
	
	
	
}
