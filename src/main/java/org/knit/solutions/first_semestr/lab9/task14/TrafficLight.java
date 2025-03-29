package org.knit.solutions.first_semestr.lab9.task14;

enum TrafficLight {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");
    private final String light;
    TrafficLight (String light){
        this.light = light;
    }
    public TrafficLight getLight(){
        return TrafficLight.valueOf(light);
    }
    private String getLightName(){return light;}
}
