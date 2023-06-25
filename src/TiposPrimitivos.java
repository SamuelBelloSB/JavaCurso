import java.util.Locale;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        //tipo nome

        // Variáveis do tipo inteiro
        System.out.println("Variáveis do tipo inteiro:");
        byte numeroByte = 127;
        short numeroShort = 32767;
        int numeroInt = 2147483647;
        long numeroLong = 922337203685477000l; //Número do tipo Long precisam da letra 'l' no final.
        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);

        // Variáveis do tipo flutuante
        System.out.println("\nVariáveis do tipo flutuante:");
        float peso = 3.2f; //Número do tipo Float precisa da letra 'f' no final.
        double pi = 3.141592653589793;
        System.out.println(peso);
        System.out.printf("%.6f%n", pi);

        // Variáveis do tipo caractere
        System.out.println("\n\nVariáveis do tipo caractere:");
        char letra = 'J';
        System.out.println(letra);

        // Variáveis booleana (true or false)
        System.out.println("\nVariáveis do tipo Boolean:");
        boolean estouEstudando = true;
        System.out.println(estouEstudando);

        // Variáveis do tipo String
        System.out.println("\nVariáveis do tipo String:");
        String nome = "Samuel";
        System.out.println(nome);
        
        // Concatenação
        System.out.println("\nConcatenação:");
        System.out.printf("%s recebe R$ %.4f a cada %d horas.", nome, pi, numeroByte );
    }
}