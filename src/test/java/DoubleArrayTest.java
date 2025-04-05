import org.junit.Test;
import org.knit.solutions.second_semestr.lab2_6.TaskDoubleZero.ArrayTest;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DoubleArrayTest {


    @Test
    public void testOneZero(){
        int[] oneZero = {1, 2, 0, 3 ,4};
        int[] expected = {1, 2, 0, 0, 3};
        ArrayTest.doubleZero(oneZero);
        assertArrayEquals(expected, oneZero);
    }
    @Test
    public void testAllZeros(){
        int[] two = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        ArrayTest.doubleZero(two);
        assertArrayEquals(expected, two);
    }
    @Test
    public void testAlmostLast(){
        int[] lastAlmostLast = {1, 2, 3, 4, 0, 0};
        int[] expected = {1, 2, 3, 4, 0, 0};
        ArrayTest.doubleZero(lastAlmostLast);
        assertArrayEquals(expected, lastAlmostLast);
    }
    @Test
    public void noZero(){
        int[] notZero = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        ArrayTest.doubleZero(notZero);
        assertArrayEquals(expected, notZero);
    }
    @Test
    public void voidArr(){
        int[] notZero = {};
        int[] expected = {};
        ArrayTest.doubleZero(notZero);
        assertArrayEquals(expected, notZero);
    }
    @Test
    public void testDoubleZeroPerformance() {
        int size = 10_000_00; // 10 миллионов элементов
        int[] bigArray = new int[size];

        Random random = new Random();

        // Заполняем случайными числами, включая 0
        for (int i = 0; i < size; i++) {
            bigArray[i] = random.nextInt(5); // числа от 0 до 4
        }

        long startTime = System.nanoTime(); // старт
        ArrayTest.doubleZero(bigArray);     // вызов метода
        long endTime = System.nanoTime();   // финиш

        long durationMs = (endTime - startTime) / 1_000_000;
        System.out.println("Время выполнения: " + durationMs + " мс");
    }

}
