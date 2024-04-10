import java.util.Scanner;

public class EntradaDeDados03 {

	public static void main(String[] args) {
		// Ler um texto até a quedra de linhas
		
		System.out.println("Aguardando entrada de dados:");
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		// .nextLine permite escrever uma linha inteira de dados até
		// a quebra de linha apertando enter.
		x = sc.nextInt();
		sc.nextLine(); // Essa nextLine() serve para consumir a quebra de linha pendente da nextInt
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}
}
