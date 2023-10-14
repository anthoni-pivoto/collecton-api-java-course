package map.pesquisa;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo , new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalCaldulado = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalCaldulado += p.getQuantidade() * p.getPreco();
            }
        }return valorTotalCaldulado;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double mairPreco = Double.MIN_VALUE;
        for (Produto p: estoqueProdutosMap.values()){
            if (p.getPreco() > mairPreco){
                produtoMaisCaro = p;
            }
        }return produtoMaisCaro;
    }
}
