import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// Entrada de dados para string
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite alguma coisa: ");
		x = sc.next();
		System.out.println("\nVocê digitou: "+x);
		
		// Entrada de dados para valor inteiro
		int a, b;
		Scanner i = new Scanner(System.in);
		Scanner j = new Scanner(System.in);
		System.out.println("\nDigite um valor inteiro para 'a': ");
		a = i.nextInt();
		System.out.println("\nDigite um valor inteiro para 'b': ");
		b = j.nextInt();
		a = a + b;
		System.out.printf("\nA soma de a+b é: %d", a );
		
		// Entrada de dados para números flutuantes
		Locale.setDefault(Locale.US);
		double pi1, pi2;
		pi2 = 3.14159265359;
		Scanner p = new Scanner(System.in);
		System.out.printf("\nDigite o valor de pi até a quinta casa decimal: ");
		pi1 = p.nextDouble();
		System.out.printf("\nVocê digitou: %.5f e o valor real até a quinta casa é %.5f", pi1, pi2 );
		
		
		sc.close();
		i.close();
		j.close();
		p.close();
		
	}

}
