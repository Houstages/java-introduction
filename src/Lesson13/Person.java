package Lesson13;

public class Person {
    String name;
    String lastName;
    int age;
    int height;
    int weight;

    public Person(String name, String lastName, int age, int height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Name = '" + this.name + '\'' +
                "lastName = '" + this.lastName + '\'' +
                ", age = " + this.age  +
                ", height = " + this.height +
                ", weight = ' " + this.weight + '\'' +
                '}';
    }
}
