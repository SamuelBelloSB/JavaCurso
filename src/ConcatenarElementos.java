import java.util.Locale;

public class ConcatenarElementos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String nome = "Maria";
		int idade = 30;
		double salario = 4000;
		
		System.out.printf("%s tem %d anos e recebe R$ %.2f.%n", nome, idade, salario);
	}
}
