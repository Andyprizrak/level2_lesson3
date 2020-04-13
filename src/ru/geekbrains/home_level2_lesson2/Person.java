package ru.geekbrains.home_level2_lesson2;
import java.util.Vector;
public class Person {
     String perName;

    public  Person (String name) {
        this.perName = name;
    }
    public Person () {

    }
    public String getPerName() {
        return perName;
    }
    @Override
    public String toString() {
        return this.getPerName();
    }

}
