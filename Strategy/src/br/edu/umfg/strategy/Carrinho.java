package br.edu.umfg.strategy;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private ArrayList<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.lista.add(produto);
    }

    public void removerProduto(Produto produto){
        this.lista.remove(produto);
    }

    public void pagar(MeioPagamentoEstrategia meioPagamento){
        meioPagamento.pagar(obterTotal());
    }
    private Double obterTotal(){
        Double total = 0.0;

        //PERCORRE A LISTA PASSANDO O VALOR DO PRODUTO
        for (Produto produto : lista){
            total += produto.getValor(); //SOMA O TOTAL + O VALOR DO PRODUTO
        }

        return total;
    }
}
