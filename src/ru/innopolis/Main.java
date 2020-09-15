package ru.innopolis;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <Char> void main(String[] args) throws IOException {
        writeProperty();
        writeWords();

    }

    private static void writeWords() throws IOException {
        File file = new File("words");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        ArrayList<String> words = new ArrayList<>();
        String temp = reader.readLine();
        while (temp != null) {
            String[] strTemp = temp.split(" ");
            words.add(strTemp[0]);
            temp = reader.readLine();
        }

        for (String str : words) {
            System.out.println(str);
        }
    }

    private static void writeProperty() {
        try {
            File file = new File(".property");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String[] countWord = reader.readLine().split("-");
            String[] endOfSentenceCharacters = reader.readLine().split("");
            int countOffer = Integer.parseInt(reader.readLine());

            System.out.printf("count word: %s\nend of sentence Characters: %s\ncount offer: %s\n",
                    Arrays.toString(countWord), Arrays.toString(endOfSentenceCharacters), countOffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

