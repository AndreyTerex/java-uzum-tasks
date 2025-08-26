package com.andreyterex.wordcounter;

import java.util.*;

public class WordCounter {

//    Программа на вход принимает строку(str) и количество совпадений(n), подсчитать какие слова встречаются (n). Результат вывести на экран.
//    Пример: hello world qwerty world; n = 2;
//    Результат: world
//    Имя проекта: word_counter

    public static List<String> wordsWithCount(String str, int n) {
        List<String> result = new ArrayList<>();

        if (str == null || str.isBlank() || n <= 0) return Collections.emptyList();

        String[] words = str.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }

            wordCountMap.entrySet().stream()
                    .filter(e -> e.getValue() == n)
                    .forEach(e -> result.add(e.getKey()));
        }
        return result;
    }

    public static void demo() {
        String input = "hello world qwerty world";
        System.out.println("words = " + input);
        int n = 2;
        System.out.println("n= " + n);
        System.out.println("результат = " + wordsWithCount(input, n));
    }
}