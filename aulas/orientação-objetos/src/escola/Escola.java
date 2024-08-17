package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setIdade(8);
        felipe.setNome("Gabriel");
        
        System.out.println("o aluno "+ felipe.getNome() + " tem " + felipe.getIdade() + " anos");
        
    }
}
