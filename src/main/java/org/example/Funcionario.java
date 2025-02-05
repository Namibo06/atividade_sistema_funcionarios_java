package org.example;

abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(){}

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double vencimento();

    public String getNome() {
        return nome;
    }
}
