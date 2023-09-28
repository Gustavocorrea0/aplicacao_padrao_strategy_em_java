package br.edu.umfg.strategy;

public class MeioPagamentoDinheiroEstrategia implements MeioPagamentoEstrategia{

    @Override
    public void pagar(Double valor) {
        System.out.println("Pagamento via dinheiro");
        System.out.println("VALOR: " + valor);
        System.out.println("REALIZADO COM SUCESSO!");
    }
}
