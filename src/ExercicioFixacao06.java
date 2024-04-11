import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao06 {
	public static void main(String[] args) {
		/* Fazer um programa para ler o código de uma peça 1,
		 * o número de peças 1, o valor unitário de cada peça 1,
		 * o código de uma peça 2, o número de peças 2 
		 * e o valor unitário de cada peça 2. 
		 * 
		 * Calcule e mostre o valor a ser pago.
		 * */
		
		Locale.setDefault(Locale.US);
		int piece1, piece2, qt1, qt2;
		double value1, value2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da peça 1: ");
		piece1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		qt1 = sc.nextInt();
		System.out.println("Digete o valor unitário da peça: ");
		value1 = sc.nextDouble();
		value1 = value1 * qt1;
		

		System.out.println("Digite o código da peça 2: ");
		piece2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		qt2 = sc.nextInt();
		System.out.println("Digete o valor unitário da peça: ");
		value2 = sc.nextDouble();
		value2 = value2 * qt2;
		
		soma = value1 + value2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",  soma);
		sc.close();
	}
}
