import java.util.Scanner;

public class ExercicioFixacao09 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro e 
		 * dizer se este número é par ou ímpar
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int A;
		A = sc.nextInt();
		if (A % 2 == 0) System.out.println("PAR");
		else System.out.println("IMPAR");
		
		sc.close();
		
	}
}
