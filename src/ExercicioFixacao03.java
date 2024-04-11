import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao03 {
	public static void main(String[] args) {
		/* Faça um programa para ler o valor do raio de um círculo,
		 * e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 * 
		 * Fórmula da área: area = π . raio^2
		 * Considere o valor de π = 3.14159
		 * */
		
		Locale.setDefault(Locale.US);
		double area, raio;
		System.out.println("Digite o raio do circulo: ");
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		raio = Math.pow(raio, 2.0);
		area = 3.14159 * raio;
		System.out.printf("A = %.4f", area);
		sc.close();
	}
}
