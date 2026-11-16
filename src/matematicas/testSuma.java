package matematicas;

public class testSuma {

	public static void main(String[] args) {
		
		//==========================Multiplicar=================================
		
		Suma calculadora = new Suma();
		
		double r1;
		
		r1 = calculadora.multiplicar(10, 5);
		
		System.out.println("El resultado es: "+ r1);
		
		//==========================Dividir=================================
		
		
		double r2;
		
		r2 = calculadora.dividir(10, 2);
		System.out.println("El resultado es: "+ r2);
		
		//==========================Promedio=================================
		
		double r3;
		
		r3 = calculadora.promedio(10, 8, 9);
		System.out.println("El promedio es: "+ r3);
		
		//==========================Mensajeria=================================
		
		
		 calculadora.mensaje();
	}

}
