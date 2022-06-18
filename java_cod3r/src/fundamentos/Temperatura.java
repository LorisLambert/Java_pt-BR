package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final double FATOR1 = 32;
		final double FATOR2 = 5.0/9.0;
		/* 
		 * Válidos: "5.0/9" e "5/9.0
		 * Inválido: "5/9"
		*/
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - FATOR1) * FATOR2;
		
		System.out.println(celsius + "°C");
	}
}
