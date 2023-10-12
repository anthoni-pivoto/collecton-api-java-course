package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterTotalTarefas());
        listaTarefas.adicionarTarefa("Dar comida aos gatos");
        listaTarefas.adicionarTarefa("Dar comida aos gatos");
        listaTarefas.adicionarTarefa("Dar comida ao cachorro");
        System.out.println(listaTarefas.obterTotalTarefas());
        //listaTarefas.removerTarefa("Dar comida aos gatos");
        listaTarefas.obterDescricoesTarefas();

    }
}
