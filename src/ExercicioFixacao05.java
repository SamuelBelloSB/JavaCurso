import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao05 {
	public static void main(String[] args) {
		/* Fazer um programa que leia o número de um funcionário,
		 * seu número de horas trabalhadas, o valor que recebe por hora
		 * e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 * */
		
		Locale.setDefault(Locale.US);
		int num;
		double horas, salario_por_hora, salario;
		System.out.println("Digite numero do funcionário");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Digite horas trabalhadas ");
		horas = sc.nextDouble();
		System.out.println("Digite o valor da hora trabalhada: ");
		salario_por_hora = sc.nextDouble();
		salario = horas * salario_por_hora;
		System.out.println("Number = " + num);
		System.out.printf("Salary = U$ %.2f", salario);
		
		sc.close();
	}
}
