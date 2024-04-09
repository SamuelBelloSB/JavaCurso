
public class Casting {

	public static void main(String[] args) {
		// Exemplo 01
		int x, y;
		
		x = 5;
		y = 2*x;
		System.out.println("Exemplo 01:\n"+x);
		System.out.println(y);
		
		
		// Exemplo 02
		int i;
		double j;
		
		i = 5;
		j = 2 * i;
		
		System.out.println("\nExemplo 02:\n"+i);
		System.out.println(j);
		
		
		// Exemplo 03
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		
		System.out.println("\nExemplo 03:\n"+area);
		
		
		// Exemplo 04
		int n, m;
		double resultado;
		
		n = 5;
		m = 2;
		resultado = (double) n / m; //casting
		
		System.out.println("\nExemplo 04:\n"+resultado);
		
		
		// Exemplo 05
		double e;
		int f;
		
		e = 5.0;
		f = (int) e; //casting
		
		System.out.println("\nExemplo 05:\n"+f);
		
		
	}
}
