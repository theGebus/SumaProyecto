package matematicas;

public class Suma {

	//======================Suma==========================
	
	public double multiplicar(double a, double b) {
		
		double resultado;
		
		resultado = a*b;
		return resultado;
		
	
	}
	
	//======================Resta==========================	
	public double dividir(double a,double b) {
		double resultado;
		
		resultado = a/b;
		return resultado;
		}
	
	//======================Promedio==========================
	public double promedio(double a,double b,double c) {
		double resultado;
		
		resultado = a+b+c;
		resultado = resultado/3;
		return resultado;
	}
	
	//======================Mensajeria==========================
	
	public void mensaje() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}

