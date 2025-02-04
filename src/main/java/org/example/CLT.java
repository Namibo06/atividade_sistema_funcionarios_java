package org.example;

public class CLT extends Funcionario{
    private double salarioMensal;

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double vencimento(){
        return 0;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
}
