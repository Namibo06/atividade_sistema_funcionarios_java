package org.example;

public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(){}

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double vencimento(){
        return 0;
    }

    public String getNome() {
        return nome;
    }
}
