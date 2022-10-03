package util;

public class Calcular {
	
	public static final double PI = 3.14159; //final não altera o valor da variavel
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio/3.0;
	}
	

}