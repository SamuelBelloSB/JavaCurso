import java.util.Scanner;

public class ExercicioFixacao04 {
	public static void main(String[] args) {
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 * A seguir, calcule e mostre a diferença do produto de A e B
		 * pelo produto de C e D segundo a fórmula: 
		 * 
		 * DIFERENCA = (A * B - C * D).
		 * */
		
		int A, B, C, D, DIFERENCA;
		System.out.println("Digite 4 números inteiros");
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENÇA = "+ DIFERENCA);
		sc.close();
	}
}
