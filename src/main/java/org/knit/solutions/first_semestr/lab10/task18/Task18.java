package org.knit.solutions.first_semestr.lab10.task18;

public class Task18 {
    public void execute(){
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        pair.setKey("NewAge");
        pair.setValue(35);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
