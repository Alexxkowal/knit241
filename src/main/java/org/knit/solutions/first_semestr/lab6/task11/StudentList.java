package org.knit.first_semestr.lab6.task11;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentList {
    private final TreeSet<Student> studentList;
    public StudentList()
    {
        this.studentList = new TreeSet<Student>();
    }
    public void addStudent(Student student)
    {
        studentList.add(student);
        System.out.println("Студент добавлен!");
    }
    public void removeStudent(String name, String surname) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.name.equals(name) && student.surname.equals(surname)) {
                iterator.remove();
                System.out.println("Студент удален");
                break;
            }
            System.out.println("Нет такого студента!");
        }
    }
    public void showStudents()
    {
        if (studentList.isEmpty())
        {
            System.out.println("Список пуст");
            return;
        }
        for (Student student: studentList)
        {
            System.out.println(student);
        }
    }
    public void findStudent(String name, String surname)
    {
     Student student = new Student(name + " " + surname);
     if (studentList.contains(student))
     {
         System.out.println("Студент "+ name + " " + surname + " найден!");
     }
     else {
         System.out.println("Студент не найден!");
     }
    }
}
