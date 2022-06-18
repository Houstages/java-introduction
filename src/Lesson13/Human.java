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

    @Override
    public String toString() {
        return "Person: \n" +
                "Name = '" + this.name + '\'' +
                ", lastname = '" + this.lastName + '\'' +
                ", mother name = " + mother.name  + '\'' +
                ", mother lastname = " + mother.lastName + '\'' +
                ", father name = ' " + father.name + '\'' +
                ", father lastname = '" + father.lastName + '\'';
    }
}
