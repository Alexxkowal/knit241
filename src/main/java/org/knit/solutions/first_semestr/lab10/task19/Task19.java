package org.knit.solutions.first_semestr.lab10.task19;

public class Task19 {
    public void execute(){
        Integer[] intArray = {1, 7, 3, 9, 5};
        System.out.println("Максимум (Integer): " + findMax(intArray));

        String[] stringArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Максимум (String): " + findMax(stringArray));
    }
    public <T extends Comparable<T>> T findMax (T[] array){
        if (array == null){
            System.out.println("Массив не должен быть пустым");
            return null;
        }
        T max = array[0];
        for (T elem : array){
            if (elem.compareTo(max) > 0){
                max = elem;
            }
        }
        return max;
    }
}
