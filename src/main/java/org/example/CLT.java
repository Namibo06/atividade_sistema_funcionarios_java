package org.example;

public class CLT extends Funcionario{
    private double salarioMensal;

    public CLT(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double vencimento() {
        return salarioMensal;
    }
}
