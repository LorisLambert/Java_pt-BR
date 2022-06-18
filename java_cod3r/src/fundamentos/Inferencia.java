package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		// Não é possível mudar o tipo da variável c = 4.5;
		
		var d = 4.5;
		System.out.println(d);
		d = 4; // Um double aceita um int, mas um int não aceita double
		System.out.println(d);
	}
}