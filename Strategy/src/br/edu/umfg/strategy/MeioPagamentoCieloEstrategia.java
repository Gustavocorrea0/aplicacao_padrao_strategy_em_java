package br.edu.umfg.strategy;

public class MeioPagamentoCieloEstrategia implements MeioPagamentoEstrategia {

    private String numeroCartao;
    private String cpf;
    private String cvv;
    private String dataDeValidade;

    public MeioPagamentoCieloEstrategia(String numeroCartao, String cpf, String cvv, String dataDeValidade) {
        this.numeroCartao = numeroCartao;
        this.cpf = cpf;
        this.cvv = cvv;
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public void pagar(Double valor) {
        System.out.println("Pagamento via cielo");
        System.out.println("VALOR: " + valor);
        System.out.println("REALIZADO COM SUCESSO!");
    }
}
