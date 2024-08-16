public class BreakContinue {
    public static void main(String[] args) {
        // Primeiro loop: uso do break
        for(int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                System.out.println(" ");
                break; // Interrompe o loop quando numero é igual a 3
            }
            System.out.println(numero);
        }

        // Segundo loop: uso do continue
        for(int numero2 = 1; numero2 <= 5; numero2++) {
            if (numero2 == 3) {
                System.out.println("deu o numero 3");
                continue; // Pula a iteração quando numero2 é igual a 3
            }
            
            System.out.println(numero2);
        }
    }
}
