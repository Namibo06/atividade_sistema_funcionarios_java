package org.example;

public class Horista extends Funcionario{
    private double salarioPorHora;
    private int horasTrabalhadas;

    public Horista(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double vencimento() {
        return salarioPorHora * horasTrabalhadas;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
