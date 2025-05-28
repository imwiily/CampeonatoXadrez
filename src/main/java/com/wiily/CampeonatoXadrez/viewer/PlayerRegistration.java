package com.wiily.CampeonatoXadrez.viewer;

import com.wiily.CampeonatoXadrez.database.Data;
import com.wiily.CampeonatoXadrez.main.MainMethod;
import com.wiily.CampeonatoXadrez.util.Messages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerRegistration {

    Messages msg = new Messages();
    Scanner sc = new Scanner(System.in);
    Data db = new Data();
    String header = """
            [Campeonato de Xadrez - Gerenciamento]
            """;
    String selectOptions = """
                - Cadastro de jogadores:
                [1] Adicionar jogador;
                [2] Remover jogador;
                [0] Voltar ao menu principal;
                """;

    public void mainRegistration() {
        int option;
        msg.send(header);
        while(true) {
            try {
                System.out.println(selectOptions);
                option = sc.nextInt();
                System.out.println(option);
                switch (option) {
                    case 1 -> PlayerRegistrationAddPlayer();
                    case 2 -> PlayerRegistrationremovePlayer();
                    case 0 -> MainMethod.XadrezMain();
                    default -> System.out.println("Essa opção não existe. Por favor, selecione uma acima.");
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Essa opção não existe. Por favor, selecione uma acima.");
                sc.nextLine();
            }
        }
    }
    private void PlayerRegistrationAddPlayer() {
        sc.nextLine();
        while(true) {
            msg.send(header);

            String gameStyle;
            String level;

            System.out.println("Qual o nome do jogador?");
            String name = sc.nextLine();

            while(true) {
                System.out.println("Qual o nível do jogador?");
                System.out.println("[Iniciante] [Intermediário] [Avançado]");
                level = sc.nextLine();
                if (level.equalsIgnoreCase("iniciante")) break;
                else if (level.equalsIgnoreCase("intermediario")) break;
                else if (level.equalsIgnoreCase("avançado")) break;
                else System.out.println("Opção inválida!");
            }
            while(true) {
                System.out.println("Qual estido de jogo? ");
                System.out.println("[Agressivo] [Defensivo] [Equilibrado]");
                gameStyle = sc.nextLine();
                if (gameStyle.equalsIgnoreCase("agressivo")) break;
                else if (gameStyle.equalsIgnoreCase("defensivo")) break;
                else if (gameStyle.equalsIgnoreCase("equilibrado")) break;
                else System.out.println("Opção inválida!");
            }
            db.createPlayerData(name, level, gameStyle);
            boolean executandoInternal = true;
            System.out.println("Deseja criar mais um usuário? [S/N]");
            String option = sc.nextLine();
            while(executandoInternal) {
                switch (option.toLowerCase()) {
                    case "n" -> {
                        sc.nextLine();
                        MainMethod.XadrezMain();
                    }
                    case "s" -> {
                        sc.nextLine();
                        executandoInternal = false;
                    }
                    default -> System.out.println("Opção inválida");
                }
            }
        }
    }
    private void PlayerRegistrationremovePlayer() {
        // TODO: Sistema de removere jogadores do banco de dados.
    }
}
