import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados02 {

	public static void main(String[] args) {
		// Ler um texto até o separador espaço
		System.out.println("Digite o seu nome, idade e peso separado por espaço: ");
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		Locale.setDefault(Locale.US);
		double peso;
		
		// Para inserir mais de um elemento na entrada de dados separado por espaço
		// usamos .nextLine();
		nome = sc.next();
		idade = sc.nextInt();
		peso = sc.nextDouble();
		
		System.out.printf("Nome: %s%nIdade: %d anos%nPeso: %.1fKg", nome, idade, peso);
		sc.close();
	}
}
