package autrodomo;
public class Carro extends Veiculo {
    

    

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
        
        
        
    }
    private void confereCombustivel(){
        System.out.println("confere combustivel");
    }
    private void confereCambio(){
        System.out.println("confere cambio em P");
    }
    }

