package listas.operacoesBaicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
private List<Tarefa> tarefaList;

public ListaTarefa(){
  this.tarefaList= new ArrayList<>();

  }
  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));


  }
  public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList){
      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalT(){
    return tarefaList.size();
  }

  public void obterDescricoesT(){
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println("o numero de elementos na lista é "+ listaTarefa.obterNumeroTotalT());
    listaTarefa.adicionarTarefa("Tarefa 1");
    // listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    System.out.println("o numero de elementos na lista é "+ listaTarefa.obterNumeroTotalT());

    // listaTarefa.removerTarefa("Tarefa 2");
    // System.out.println("o numero de elementos na lista é "+ listaTarefa.obterNumeroTotalT());

    listaTarefa.obterDescricoesT();


  }


}
