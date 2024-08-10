// Aula De Variaveis
public class Aula2 { 
    public static void main(String[] args) {
        double salarioMinimo = 1412.50; // double permite numeros decimais
        String Nome = "Gabriel";
        String Sobrenome = "Henrique";
        String NomeCompleto = cNomeCompleto(Nome, Sobrenome);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        int Idade = 5;
        Idade = 19; // int apenas para numeros inteiros
        final double PI = 3.14;

        System.err.println(NomeCompleto);
        System.err.println(Idade);
        System.err.println(salarioMinimo);
        System.err.println(numeroCurto2);
        System.err.println(PI);  // Final não permite alteração na variável, assim ela se torna uma constante
    }

    // Método para concatenar Nome e Sobrenome
    public static String cNomeCompleto(String nome, String sobrenome) { // para texto precisa criar o metodo public static String
        return nome + " " + sobrenome;
    }
}
