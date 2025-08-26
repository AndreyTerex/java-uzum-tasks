package com.andreyterex.twosums;

import java.util.Arrays;

public class TwoSums {


//    Дан отсортированный массив целых чисел и целевая сумма. Необходимо написать алгоритм поиска двух чисел в массиве, которые в сумме равны целевой сумме. Результат вывести на экран.
//    Пример: [1,2,5,6,7,8] 	целевая сумма = 11;
//    Результат: 5+6 = 11
//    Имя проекта: two_sums

    public static String findPair(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return array[left] + "+" + array[right] + " = " + target;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "Нет пары которые равны целевой сумме";
    }
    public static void demo() {
        int[] array = {1, 2, 5, 6, 7, 8};
        int target = 11;
        System.out.println("Массив = " + Arrays.toString(array));
        System.out.println("Целевое значение = "+ target);
        String result = findPair(array, target);
        System.out.println(result);
    }
}