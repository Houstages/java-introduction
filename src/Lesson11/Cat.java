package Lesson11;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat dog = (Cat) obj;
            return this.weight == dog.weight && this.age == dog.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Name = '" + this.name + '\'' +
                ", age = " + this.age  +
                ", weight = " + this.weight +
                ", breed = ' " + this.breed + '\'' +
                '}';
    }
}
