package org.knit.solutions.second_semestr.lab2_6.TaskMerge;

public class MergeFunc {
    public static int[] MergeSort(int[] num1, int[] num2) {
        int m = num1.length - num2.length;
        int n = num2.length;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        // если остались элементы во втором массиве
        while (j >= 0) {
            num1[k--] = num2[j--];
        }
        return num1;
    }
}
