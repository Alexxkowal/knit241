package org.knit.solutions.first_semestr.lab6.task11;

import java.util.Objects;

public class Student implements Comparable<Student> {
    final String name;
    final String surname;
    public Student(String student)
    {
        String[] data = student.split(" ");
        this.name = data[0];
        this.surname = data[1];
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
    public boolean equals(Object student)
    {
        if (this == student) return true;
        if (student == null || this.getClass() != student.getClass()) return false;
        Student student1 = (Student) student;
        return Objects.equals(this.surname, student1.surname) && Objects.equals(this.name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public int compareTo(Student other) {
        int lastNameComparison = surname.compareTo(other.surname);
        return lastNameComparison != 0 ? lastNameComparison : name.compareTo(other.name);
    }
}
