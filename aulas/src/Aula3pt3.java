public class Aula3pt3 {
    public static void main(String[] args) {
        boolean condicao1 =true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){ // && ambas precisão ser verdadeiras obs: funciona como "and" em python
            System.err.println("ambas são verdadeiras");
        }
        if(condicao1 || condicao2){ // || uma das duas precisa ser verdadeira obs: funciona como o "or" em python
            System.err.println("uma é verdadeira");
        }

        System.err.println("fim");
    }
}
