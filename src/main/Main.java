package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- GESTOR FINANCEIRO ---");
            System.out.println("1. Registar Utilizador");
            System.out.println("2. Criar Categoria");
            System.out.println("3. Registar Despesa");
            System.out.println("4. Ver Extrato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
        } while (opcao != 0);

        sc.close();
    }
}