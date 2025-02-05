package org.example;

public class Comissionado extends Funcionario{
    private double totalVendas;
    private double percentualComissao;

    public Comissionado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double vencimento() {
        return totalVendas * (percentualComissao / 100);
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
