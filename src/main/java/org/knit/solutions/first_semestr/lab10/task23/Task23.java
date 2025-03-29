package org.knit.solutions.first_semestr.lab10.task23;

public class Task23 {

    public static void execute(){
        printType(123);
        printType("Hello");
        printType(3.14);
        printType(new int[]{1, 2, 3});
        printType(null);
    }

     public static <T> void printType(T obj) {
        if (obj != null) {
            System.out.println(obj.getClass().getName());
        } else {
            System.out.println("null");
        }
    }

}
