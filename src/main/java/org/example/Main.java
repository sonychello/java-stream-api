package org.example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static double averageValue(List<Integer> array) {
        return (double)array.stream().mapToInt(Integer::intValue).sum() / array.size();
    }

    public static List<String> formattingStrings(List<String> array) {
        return array.stream()
                .map(String::toUpperCase)
                .map(x -> "_new_" + x)
                .collect(Collectors.toList());
    }

    public static List<Integer> listOfSquare(List<Integer> array) {
        return array.stream()
                .filter(x -> Collections.frequency(array, x) == 1)
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

    public static List<String> sortString(List<String> array, char letter) {
        return array.stream()
                .filter(x -> x.charAt(0) == letter)
                .sorted()
                .collect(Collectors.toList());
    }

    public static <T> Object latsElementOfCollection(Collection<T> array) {
            return array.stream().reduce((first, second) -> second);
    }

    public static int sumOfEven(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .sum();
    }

    public static Map<Character, String> mapOfString(List<String> array) {
        return array.stream()
                .collect(Collectors.toMap(x -> x.charAt(0),
                        x -> x.substring(1), (x, y) -> x));
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        List<Integer> numbers2 = List.of(1, 1, 2, 3, 3, 4, 5, 6, 4);
        List<String> strings = Arrays.asList("Lewis", "Charles", "George", "Carlos");

        System.out.println("Тест 1 - averageValue: " + averageValue(numbers2));
        System.out.println("Тест 2 - formattingStrings: " + formattingStrings(strings));
        System.out.println("Тест 3 - listOfSquare: " + listOfSquare(numbers2));
        System.out.println("Тест 4 - sortString: " + sortString(strings, 'a'));
        System.out.println("Тест 5 - latsElementOfCollection: " + latsElementOfCollection(strings));
        System.out.println("Тест 6 - sumOfEven: " + sumOfEven(numbers1));
        System.out.println("Тест 7 - mapOfString: " + mapOfString(strings));

    }
}