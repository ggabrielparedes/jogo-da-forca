package com.gabriel.forca.view;

import com.gabriel.forca.forca.Forca;
import com.gabriel.forca.services.ForcaServices;
import com.gabriel.forca.util.WordUtil;

import java.util.Scanner;

public class ForcaConsole {
    private final ForcaServices forcaServices = new ForcaServices();
    private Scanner scanner = new Scanner(System.in);
    public static void drawBody(int lives) {
        switch (lives) {
            case 1:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "  /|\\    |\n" +
                        "  / \\    |\n" +
                        "         |\n");
                break;
            case 2:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "  /|\\    |\n" +
                        "  /      |\n" +
                        "         |\n");
                break;
            case 3:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "  /|\\    |\n" +
                        "         |\n" +
                        "         |\n");
                break;
            case 4:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "  /|     |\n" +
                        "         |\n" +
                        "         |\n");
                break;
            case 5:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "   |     |\n" +
                        "         |\n" +
                        "         |\n");
                break;
            case 6:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "   O     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n");
                break;
            case 7:
                System.out.println(
                        "   -------\n" +
                        "   |     |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n" +
                        "         |\n");
                break;
        }
    }

    public void startGame() {
        Forca forca = new Forca(WordUtil.randomWord(), 7);
        while((forcaServices.Win(forca) == false) && forcaServices.Lose(forca) == false) {
            drawBody(forca.getLives());
            showStatus(forca);
            System.out.print("Digite uma letra >> ");
            char letra = scanner.nextLine().charAt(0);
            if(forcaServices.verifyLetter(forca, letra) == false) {
                System.out.println("Letra incorreta");
            }
        }
        showResult(forca);
    }

    public void showStatus(Forca forca) {
        System.out.println("Palavra: " + forca.getDiscoveredLetters());
        System.out.println("Remaining Lifes: " + forca.getLives());
    }

    public void showResult(Forca forca) {
        if(forcaServices.Win(forca)) {
            System.out.println("Parabens voce venceu, a palavra era: " + forca.getWord());
        } else {
            System.out.println("Voce perdeu, a palavra era: " + forca.getWord());
        }
    }
}
