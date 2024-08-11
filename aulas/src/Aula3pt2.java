
// operadores relacionais
public class Aula3pt2 {
    public static void main(String[] args) {
        String nome1 = "gabriel";
        String nome2 =new String("gabriel"); // transformando o nome em um objeto vai dar false
        System.err.println(nome1.equals(nome2)); // .equals compara os conteudos dos objetos

        int numero1, numero2;

        numero1 = 1;
        numero2 = 2;
        boolean simNao = numero1 ==numero2 ;
        if(numero1<numero2){ // if operador de decisão
            System.err.println("a nossa condição é verdadeira");
        }
        System.err.println("numero1 é igual a numero 2? " + simNao);

        simNao = numero1 !=numero2 ;
        System.err.println("numero1 é diferente a numero 2? " + simNao);

        simNao = numero1 > numero2 ;
        System.err.println("numero1 é maior a numero 2? " + simNao);


        
        
    }
}
