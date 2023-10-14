package list.ordenacao;

import java.util.*;

public class OrdenaçãoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenaçãoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenaçãoPessoa ordenaçãoPessoa = new OrdenaçãoPessoa();
        ordenaçãoPessoa.adicionarPessoa("nome 1", 20,1.8);
        ordenaçãoPessoa.adicionarPessoa("nome 2", 32,1.60);
        ordenaçãoPessoa.adicionarPessoa("nome 3", 17,1.95);
        ordenaçãoPessoa.adicionarPessoa("nome 2", 45,1.55);

        System.out.println(ordenaçãoPessoa.pessoaList);

        //System.out.println(ordenaçãoPessoa.ordenarPorIdade());
        //System.out.println(ordenaçãoPessoa.ordenarPorAltura());

    }
}