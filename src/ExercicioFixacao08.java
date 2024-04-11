import java.util.Scanner;

public class ExercicioFixacao08 {
	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		int A;
		A = sc.nextInt();
		
		if (A >= 0) System.out.println("NÃO NEGATIVO");
		else System.out.println("NEGATIVO");
		
		sc.close();

	}
}
