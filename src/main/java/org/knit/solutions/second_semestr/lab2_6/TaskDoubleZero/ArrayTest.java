package org.knit.solutions.second_semestr.lab2_6.TaskDoubleZero;

public class ArrayTest {
    public static void doubleZero(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] == 0) {
            for (int j = numbers.length - 1; j > i + 1; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[i + 1] = 0;
            i++;
        }
    }
}
}
