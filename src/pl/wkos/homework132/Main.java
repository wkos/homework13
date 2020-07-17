package pl.wkos.homework132;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words;
        String fileName = "words.txt";
        words = ReadData.readFromFile(fileName);
        if (words.size() != 0) {
            ReadData.printList(words);
            System.out.println("Najdłuższe słowo: " + TextUtils.maxLengthWord(words));
            System.out.println("Najkrótsze słowo: " + TextUtils.minLengthWord(words));
            System.out.println("Liczba wszystkich znaków: " + TextUtils.sumOfWordsLength(words));
        } else {
            System.out.println("Pusty plik");
        }
    }
}
