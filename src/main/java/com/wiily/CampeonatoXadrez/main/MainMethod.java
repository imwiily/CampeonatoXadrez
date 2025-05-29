package com.wiily.CampeonatoXadrez.main;

import com.wiily.CampeonatoXadrez.util.Messages;
import com.wiily.CampeonatoXadrez.viewer.PlayerRegistration;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.wiily.CampeonatoXadrez.util.UtilFiles.*;

public class MainMethod {
    Scanner sc = new Scanner(System.in);

    Messages msg = new Messages();

    public void XadrezMain() {
        msg.send(mainMenu);
        int o;
        boolean running = true;
        while(running) {
            try {
                o = sc.nextInt();
                switch (o) {
                    case 1 -> running = false;
                    case 2 -> running = false;
                    case 0 -> admMenu();
                    default -> System.out.println(redColor + "Essa opção não existe. Por favor, selecione uma acima.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println(redColor + "Essa opção não existe. Por favor, selecione uma acima.");
                sc.nextLine();
            }
        }
    }
    public void admMenu() {
        var playerRegistration = new PlayerRegistration();
        msg.send(admMenu);
        int o;
        boolean running = true;
        while(running) {
            try {
                o = sc.nextInt();
                switch (o) {
                    case 1 -> playerRegistration.mainRegistration(); // Teste
                    case 2 -> running = false;   // TODO: Iniciar campeonato.
                    default -> System.out.println(redColor + "Essa opção não existe. Por favor, selecione uma acima.");
                }
            } catch (InputMismatchException e) {
                System.out.println(redColor + "Essa opção não existe. Por favor, selecione uma acima.");
                sc.nextLine();
            }
        }
    }


}
