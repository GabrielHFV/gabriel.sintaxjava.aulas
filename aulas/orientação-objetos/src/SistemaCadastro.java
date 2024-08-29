public class SistemaCadastro {
    public static void main(String[] args) {
        pessoa marcos = new pessoa("123", "marcos");
        marcos.setEndereco("rua das marias");

        System.out.println(marcos.getNome()+ "-"+ marcos.getCpf());
    }
    
    
}
