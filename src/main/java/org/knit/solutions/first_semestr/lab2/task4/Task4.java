package org.knit.first_semestr.lab2.task4;

import java.text.DecimalFormat;

public class Task4 {
    public  void execute(){
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(0,5);
        Cylinder cylinder = new Cylinder(5, 3);
        double sphereVolume = sphere.getVolume();
        double cubeVolume = cube.getVolume();
        double cylinderVolume = cylinder.getVolume();
        String formatesphere = new DecimalFormat("#0.00").format(sphereVolume);
        String formatecube = new DecimalFormat("#0.00").format(cubeVolume);
        String formatecylinder = new DecimalFormat("#0.00").format(cylinderVolume);
        System.out.println(formatesphere);
        System.out.println(formatecube);
        System.out.println(formatecylinder);
        Container container = new Container(500);
        container.add(cube);
        container.add(sphere);
        container.add(cylinder);
        container.add(cube);
        container.add(cube);
    }

}
