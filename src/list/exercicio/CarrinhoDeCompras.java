package list.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionatItem(String nome,double preco, int qtd){
         Item novoItem= new Item(nome, preco, qtd);
         carrinho.add(novoItem);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i: carrinho){
            if (i.getNome().equalsIgnoreCase(nome))
                itensParaRemover.add(i);
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double vlTotal = 0;
        for (Item i: carrinho){
            double valorItem = i.getPreco() * i.getQtd();
            vlTotal = vlTotal + valorItem;
        }
        return vlTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionatItem("batata",1,2);
        carrinhoDeCompras.adicionatItem("banana",2.5,3);
        carrinhoDeCompras.adicionatItem("pao",3,6);
        carrinhoDeCompras.adicionatItem("presunto",1.5,6);
        carrinhoDeCompras.adicionatItem("queijo",1,6);
        carrinhoDeCompras.adicionatItem("queijo",1,6);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("queijo");
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
