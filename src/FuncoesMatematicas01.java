import java.util.Locale;

public class FuncoesMatematicas01 {
	
	public static void main(String[] args) {
		// sqrt - raiz quadrada	| A = Math.sqrt(x);
		// pow - potenciação	| A = Math.pow(x);
		// abs - valor absoluto | A = Math.abs(x);
		
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
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.printf("%n%.1f elevado a %.1f é: %.1f%n", x, y, a);
		System.out.printf("%.1f elevado ao quadrado é: %.1f%n", x, b);
		System.out.printf("5.0 elevado ao quadrado é: %.1f%n", c);
		
		a = Math.abs(x);
		b = Math.abs(z);
		
		System.out.printf("%nO valor absoluto de %.1f é: %.1f%n", x, a);
		System.out.printf("O valor absoluto de %.1f é: %.1f", z, b);
		
	}
}
