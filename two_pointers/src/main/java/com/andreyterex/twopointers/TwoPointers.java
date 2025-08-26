package com.andreyterex.twopointers;

import java.util.Arrays;

public class TwoPointers {

//    Дан отсортированный массив целых чисел с дубликатами. Необходимо удалить дубликаты и все оставшиеся значения сдвинуть влево.
//            Пример: [1,1,1,2,2,3,3,3,3];
//    Результат: [1,2,3]
//    Имя проекта: two_pointers

    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index - 1]) {
                array[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(array, index);
    }

    public static void demo() {
        int[] array = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        System.out.println("Массив = " + Arrays.toString(array));
        int[] result = removeDuplicates(array);
        System.out.println("После метода удаления дубликатов = " + Arrays.toString(result));
    }
}
