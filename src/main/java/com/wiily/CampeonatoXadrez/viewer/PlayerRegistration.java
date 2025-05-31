package com.wiily.CampeonatoXadrez.viewer;

import com.wiily.CampeonatoXadrez.database.Data;
import com.wiily.CampeonatoXadrez.main.MainMethod;
import com.wiily.CampeonatoXadrez.util.Messages;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.wiily.CampeonatoXadrez.util.UtilFiles.header;
import static com.wiily.CampeonatoXadrez.util.UtilFiles.selectOptions;

public class PlayerRegistration {

    MainMethod main = new MainMethod();
    Messages msg = new Messages();
    Scanner sc = new Scanner(System.in);
    Data db = new Data();

    public void mainRegistration() throws IOException {
        int option;
        msg.send(header);
        while(true) {
            try {
                System.out.println(selectOptions);
                option = sc.nextInt();
                System.out.println(option);
                switch (option) {
                    case 1 -> PlayerRegistrationAddPlayer();
                    case 2 -> PlayerRegistrationRemovePlayer();
                    case 0 -> main.XadrezMain();
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
    private void PlayerRegistrationAddPlayer() throws IOException {
        sc.nextLine();
        while(true) {
            msg.send(header);

            String gameStyle;
            String level;

            System.out.println("Qual o nome do jogador?");
            String name = sc.nextLine();

            level = getPergunta("Qual o nível do jogador? ", List.of("Iniciante", "Intermediario", "Avançado"), sc);
            gameStyle = getPergunta("Qual estido de jogo?", List.of("Agressivo", "Defensivo", "Equilibrado"), sc);
            db.createPlayerData(name, level, gameStyle);
            boolean executandoInternal = true;
            System.out.println("Deseja criar mais um usuário? [S/N]");
            String option = sc.nextLine();
            while(executandoInternal) {
                switch (option.toLowerCase()) {
                    case "n" -> {
                        main.XadrezMain();
                    }
                    case "s" -> {
                        executandoInternal = false;
                    }
                    default -> System.out.println("Opção inválida");
                }
            }
        }
    }

    private void PlayerRegistrationRemovePlayer() {
        // TODO: Sistema de remover jogadores do banco de dados.
    }

    private String getPergunta (String pergunta, List<String> opcoes, Scanner sc) {
        while(true) {
            System.out.println(pergunta);
            System.out.println(opcoes);
            String resposta = sc.nextLine();
            for (String opcao : opcoes) {
                if (resposta.equalsIgnoreCase(opcao)) {
                    return opcao;
                }
            }
            System.out.println("Opçao inválida!");
        }


    }
}
