package listas.operacoesBaicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> autoresList = new ArrayList<>();
        for (Livro a : livroList) {
            if (a.getAutor().equalsIgnoreCase(autor)) {
                autoresList.add(a);
            }
        }
        return autoresList; // Retorna a lista de livros do autor
    }
    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }
    public List<Livro> persquisarAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
    

}
        
    

