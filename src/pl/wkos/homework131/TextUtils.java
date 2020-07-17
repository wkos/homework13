package pl.wkos.homework131;

public class TextUtils {
    public static boolean containOneFullStop(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '.') counter++;
        return counter == 1;
    }

    public static boolean containOneComma(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ',') counter++;
        return counter == 1;
    }
}
