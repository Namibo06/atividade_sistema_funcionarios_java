package org.example;

public class Comissionado extends Funcionario{
    private double totalVendas;
    private double percentualComissao;
    CLT clt = new CLT();

    @Override
    public double vencimento(){
        return clt.getSalarioMensal();
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
