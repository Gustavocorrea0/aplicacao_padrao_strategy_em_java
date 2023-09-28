import br.edu.umfg.strategy.Carrinho;
import br.edu.umfg.strategy.MeioPagamentoCieloEstrategia;
import br.edu.umfg.strategy.MeioPagamentoDinheiroEstrategia;
import br.edu.umfg.strategy.Produto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Produto produto1 =  new Produto("00001", "Picanha", 3.59);
        Produto produto2 =  new Produto("00002", "Bucho", 3.59);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1); //ADICIONA UM ITEM
        carrinho.adicionarProduto(produto2); //ADICIONA UM ITEM

        carrinho.pagar(new MeioPagamentoCieloEstrategia("0000", "12345678900", "123", "10/2030"));
        System.out.println();
        carrinho.pagar(new MeioPagamentoDinheiroEstrategia());
    }
}