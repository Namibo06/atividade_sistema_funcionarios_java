package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário CLT:");
        String nomeCLT = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário CLT:");
        String cpfCLT = scanner.nextLine();
        CLT clt = new CLT(nomeCLT, cpfCLT);
        System.out.println("Digite o salário mensal do funcionário CLT:");
        clt.setSalarioMensal(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite o nome do funcionário Horista:");
        String nomeHorista = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário Horista:");
        String cpfHorista = scanner.nextLine();
        Horista horista = new Horista(nomeHorista, cpfHorista);
        System.out.println("Digite o salário por hora do funcionário Horista:");
        horista.setSalarioPorHora(scanner.nextDouble());
        System.out.println("Digite as horas trabalhadas do funcionário Horista:");
        horista.setHorasTrabalhadas(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o nome do funcionário Comissionado:");
        String nomeComissionado = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário Comissionado:");
        String cpfComissionado = scanner.nextLine();
        Comissionado comissionado = new Comissionado(nomeComissionado, cpfComissionado);
        System.out.println("Digite o total de vendas do funcionário Comissionado:");
        comissionado.setTotalVendas(scanner.nextDouble());
        System.out.println("Digite o percentual de comissão do funcionário Comissionado:");
        comissionado.setPercentualComissao(scanner.nextDouble());

        System.out.println("\nResumo dos funcionários:");
        System.out.println("CLT - " + clt.getNome() + " | Salário: R$" + clt.vencimento());
        System.out.println("Horista - " + horista.getNome() + " | Salário: R$" + horista.vencimento());
        System.out.println("Comissionado - " + comissionado.getNome() + " | Salário: R$" + comissionado.vencimento());

        scanner.close();
    }
}