package Lesson13;

public class Human {
    String name;
    String lastName;
    Human mother;
    Human father;

    public Human(String name, String lastName, Human mother, Human father) {
        this.name = name;
        this.lastName = lastName;
        this.mother = mother;
        this.father = father;
    }

    public Human(){

    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
