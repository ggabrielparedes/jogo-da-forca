package com.gabriel.forca.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordUtil {
    public static String randomWord() {
        Random random = new Random();
        int random_number;
        String line;
        List<String> wordlist = new ArrayList<>();
        String random_word;

        try (BufferedReader reader = new BufferedReader(new FileReader("D:/IdeaProjects/Jogo da Forca/Resources/words.txt"))) {
            while((line = reader.readLine()) != null) wordlist.add(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        random_number = random.nextInt(wordlist.size());
        random_word = wordlist.get(random_number);
        return random_word;
    }
}
