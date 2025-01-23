package com.gabriel.forca.forca;

import java.util.Locale;

public class Forca {
    private String word;
    private int remaining_lives;
    private StringBuilder words_discovered;

    public Forca(String word, int lives) {
        this.word = word.toLowerCase();
        this.remaining_lives = lives;
        this.words_discovered = new StringBuilder("_".repeat(this.word.length()));
    }

    public String getWord() {
        return word;
    }

    public int getLives() {
        return remaining_lives;
    }

    public void decreaseLive() {
        remaining_lives -= 1;
    }

    public StringBuilder getDiscoveredLetters() {
        return words_discovered;
    }

    public void revealLetter(char letter) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                words_discovered.setCharAt(i, letter);
            }
        }
    }
    
}
