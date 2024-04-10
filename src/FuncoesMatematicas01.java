import java.util.Locale;

public class FuncoesMatematicas01 {
	
	public static void main(String[] args) {
		// sqrt - raiz quadrada
		// pow - potenciação
		// abs - valor absoluto
		
		Locale.setDefault(Locale.US);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.printf("Raiz quadrada de %.1f é: %.1f%n", x,a);
		System.out.printf("Raiz quadrada de %.1f é: %.1f%n", y,b);
		System.out.printf("Raiz quadrada de 25.0 é: %.1f%n", c);
		
				
	}
}
