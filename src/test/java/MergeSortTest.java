import org.junit.Test;
import org.knit.solutions.second_semestr.lab2_6.TaskDoubleZero.ArrayTest;
import org.knit.solutions.second_semestr.lab2_6.TaskMerge.MergeFunc;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testMerge1(){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1,2,2,3,5,6};
        MergeFunc.MergeSort(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void testMerge2(){
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] expected = {1};
        MergeFunc.MergeSort(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void testMerge3(){
        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] expected = {1};
        MergeFunc.MergeSort(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(nums1, expected);
    }

    @Test
    public void testMergePerformance() {
        int m = 500_000;
        int n = 500_000;

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = i;
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = m + i;
        }

        long startTime = System.nanoTime();

        MergeFunc.MergeSort(nums1, nums2);

        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000;

        System.out.println("Сортировка выполнена за " + durationMs + " ms");

        assertTrue(isSorted(nums1));
//        System.out.println(Arrays.toString(nums1));

    }
    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }
}
