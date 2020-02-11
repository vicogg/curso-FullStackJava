package dia11febEjercicio2;

/*
 * Creamos la clase cuenta
 */
public class Cuenta {

	/*
	 * Generamos los atributos.
	 */
	String titular;
	double cantidad;
	
	/**
	 * Creamos el constructor vacio
	 */
	public Cuenta() {
		
	}

    /*
     * Creamos el constructor con sus instancias		
     */
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	/*
	 * Setters and Getters
	 */
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public double ingresar(Double monto_a_ingresar, Double permitido) {
		
		if (monto_a_ingresar > permitido) {
			System.out.println("Esta cuenta no permite ese monto maximo");
		
		}else {
			cantidad = cantidad + monto_a_ingresar;
			System.out.println("La cantidad de dinero en cuenta es: "+cantidad);
			
		}
		return cantidad;
		
	}
	
	public double retirar(Double monto_a_retirar, Double permitido) {
		if (monto_a_retirar > cantidad ) {
			System.out.println("No es posible entregar el monto, ya que supera el monto actual de su cuenta");
			cantidad = 0;
			System.out.printf("Saldo actual de la cuenta es: %s",cantidad);
		}else if(monto_a_retirar > permitido){
			System.out.println("El monto a retirar supera el permitido para esta cuenta");
		}else {
			System.out.printf("\n Por favor retire su dinero\n");
			System.out.printf("\n El monto a retirar es: %s",monto_a_retirar);
			cantidad = cantidad - monto_a_retirar;
			System.out.printf("\n El saldo actual de su cuenta es %s \n", cantidad);
				}
		
		return cantidad;
		
	}
	
	
}
