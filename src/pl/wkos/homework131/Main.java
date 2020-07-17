package pl.wkos.homework131;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.readNumbersFromConsole();
        System.out.println(numbers.toString());
        try {
            System.out.println("Liczby w odwrotnej kolejności");
            numbers.printReverse();
            System.out.println("Suma liczb");
            numbers.printSum();
            System.out.print("Najmniejsza: ");
            System.out.println(numbers.getMin());
            System.out.print("Największa: ");
            System.out.println(numbers.getMax());
        } catch (NoElementInCollection e) {
            System.out.println(e.getMessage());
        }
    }
}
