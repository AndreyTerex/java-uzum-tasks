package com.andreyterex.runner;

import com.andreyterex.wordcounter.WordCounter;
import com.andreyterex.twosums.TwoSums;
import com.andreyterex.library.Library;
import com.andreyterex.twopointers.TwoPointers;

public class Main {
    private static final String USAGE = """
Запуск (из корня проекта):
  PowerShell:
    .\\mvnw -q -f runner/pom.xml exec:java "-Dexec.args=word_counter"
    .\\mvnw -q -f runner/pom.xml exec:java "-Dexec.args=two_sums"
    .\\mvnw -q -f runner/pom.xml exec:java "-Dexec.args=library"
    .\\mvnw -q -f runner/pom.xml exec:java "-Dexec.args=two_pointers"
            """;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(USAGE);
            return;
        }
        switch (args[0]) {
            case "word_counter" -> {
                System.out.println("Задача 1: word_counter");
                WordCounter.demo();
            }
            case "two_sums" -> {
                System.out.println("Задача 2: two_sums");
                TwoSums.demo();
            }
            case "library" -> {
                System.out.println("Задача 3: library");
                Library.demo();
            }
            case "two_pointers" -> {
                System.out.println("Задача 4: two_pointers");
                TwoPointers.demo();
            }
            default -> {
                System.out.println("Неизвестная задача " + args[0]);
                System.out.print(USAGE);
            }
        }
    }
}
