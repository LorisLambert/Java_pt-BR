package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 5.5;
		final double PI = 3.1415; // Constantes em letras maiúsculas
		System.out.println(PI * raio * raio);
		raio = 11;
		double area = PI * raio * raio;
		System.out.println(area);
	}
}
