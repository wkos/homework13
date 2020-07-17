package pl.wkos.homework131;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    private List<Object> numbers = new ArrayList<>();

    public void readNumbersFromConsole() throws NoElementInCollection {
        System.out.println("Podaj dodatnie liczby w koljenych weirszach.\n" +
                "Wprowadzenie liczy ujemnej zkończy wczytywanie");
        System.out.print("Liczba nr 1: ");
        int i = 2;
        while (readPositiveNumberFromConsole()) {
            System.out.print("Liczba nr " + i + ": ");
            i++;
        }
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
    }

    public boolean readPositiveNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.charAt(0) == '-') return false;
        try {
            if (TextUtils.containOneFullStop(line)) {
                numbers.add(Double.parseDouble(line));
                return true;
            } else if (TextUtils.containOneComma(line)) {
                line = line.replace(',', '.');
                numbers.add(Double.parseDouble(line));
                return true;
            } else {
                numbers.add(Integer.parseInt(line));
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba. Spróbuj jeszcze raz");
        }
        return false;
    }

    public double addNumbers() throws NoElementInCollection {
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
        double sum = 0;
        for (Object number : numbers) {
            sum += ((Number) number).doubleValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }

    public void printReverse() throws NoElementInCollection {
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
        for (int i = numbers.size() - 1; i > -1; i--)
            System.out.println(numbers.get(i));
    }

    public void printSum() throws NoElementInCollection {
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i).toString() + " + ");
        }
        try {
            System.out.println(numbers.get(numbers.size() - 1) + " = " + addNumbers());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie ma ani jednego elementu na liście");
        }
    }

    public Number getMin() throws NoElementInCollection {
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
        int min = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (((Number) numbers.get(i)).doubleValue() < ((Number) numbers.get(min)).doubleValue())
                min = i;
        }
        return (Number) numbers.get(min);
    }

    public Number getMax() throws NoElementInCollection {
        if (numbers.size() == 0)
            throw new NoElementInCollection("Brak elementów na liście");
        int max = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (((Number) numbers.get(i)).doubleValue() > ((Number) numbers.get(max)).doubleValue())
                max = i;
        }
        return (Number) numbers.get(max);
    }

    public List<Object> getNumbers() {
        return numbers;
    }
}
