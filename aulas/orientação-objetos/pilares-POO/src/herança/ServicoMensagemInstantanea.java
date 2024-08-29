package herança;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviar mensagem");
        salvarHistorico();

    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarInternet(){
        System.out.println("Validando internet");   
    }
    private void salvarHistorico(){
        System.out.println("Salvando historico");
    }

}
