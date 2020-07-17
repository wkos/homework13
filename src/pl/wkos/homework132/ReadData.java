package pl.wkos.homework132;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static List<String> readFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null)
                words.add(line);
        } catch (IOException e) {
            System.out.println("Brak pliku");
        }
        return words;
    }

    public static void printList(List<String> words) {
        for (String word : words) System.out.println(word);
        System.out.println("Liczba słów: " + words.size());
    }
}
