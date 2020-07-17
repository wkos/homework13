package pl.wkos.homework132;

import java.util.List;

public class TextUtils {
    public static int maxLengthWord(List<String> words) {
        int max = 0;
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() > words.get(max).length()) max = i;
        }
        return words.get(max).length();
    }

    public static int minLengthWord(List<String> words) {
        int min = 0;
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() < words.get(min).length()) min = i;
        }
        return words.get(min).length();
    }

    public static long sumOfWordsLength(List<String> words) {
        long sum = 0;
        for (String word : words) sum += word.length();
        return sum;
    }
}
