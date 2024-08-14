// controle de fluxo simples
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valaroSolicitado = 17.0;
        if(valaroSolicitado < saldo){ // IMPORTANTE: em java se uma estrutura condicional tiver mais de uma linha tem que por o {}
            saldo = saldo - valaroSolicitado;
            System.out.println("Novo saldo:"+ saldo );
        }
            
        // else{
        //     System.out.println("Saldo insuficiente");
        //     System.out.println("Seu saldo atul é:"+saldo);
        // }
        
        

    }
}
