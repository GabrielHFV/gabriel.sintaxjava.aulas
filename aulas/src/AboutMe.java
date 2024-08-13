import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        // Consumir a nova linha deixada pelo nextDouble()
        scanner.nextLine();

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // Dividir o nome completo em nome e sobrenome
        String[] partesNome = nomeCompleto.split(" ", 2);
        String nome = partesNome[0];
        String sobrenome = partesNome.length > 1 ? partesNome[1] : "";

        // Imprimir os dados do usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
    }
}
