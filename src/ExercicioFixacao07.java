import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao07 {
	public static void main(String[] args) {
		/* Fazer um programa que leia três valores com ponto flutuante
		 * de dupla precisão: A, B e C.
		 * Em seguida, calcule e mostre:
		 * 
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 * */
		
		Locale.setDefault(Locale.US);
		double A, B, C, Atriangulo, Acirculo, raio, Atrapezio, Aquadrado, Aretangulo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		Atriangulo = (A * C)/ 2.0;
		raio = C;
		raio = Math.pow(raio, 2.0);
		Acirculo = 3.14159 * raio;
		Atrapezio = ((A + B) * C) / 2.0;
		Aquadrado = Math.pow(B, 2.0);
		Aretangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", Atriangulo);
		System.out.printf("CIRCULO: %.3f%n", Acirculo);
		System.out.printf("TRAPEZIO: %.3f%n", Atrapezio);
		System.out.printf("QUADRADO: %.3f%n", Aquadrado);
		System.out.printf("RETANGULO: %.3f%n", Aretangulo);
		
		sc.close();
	}
}
