package com.gabriel.forca.main;

import com.gabriel.forca.view.ForcaConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("*****************************************************");
        System.out.println("*                                                   *");
        System.out.println("*                    JOGO DA FORCA                  *");
        System.out.println("*                                                   *");
        System.out.println("*     [1] Iniciar jogo                              *");
        System.out.println("*     [2] Sair                                      *");
        System.out.println("*                                                   *");
        System.out.println("*****************************************************");

        System.out.print("Selecione um opcao >> ");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                ForcaConsole forcaConsole = new ForcaConsole();
                forcaConsole.startGame();
                break;
            case 2:
                System.out.println("Encerrando o jogo.");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}