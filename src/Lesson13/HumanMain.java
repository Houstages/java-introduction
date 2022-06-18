package Lesson13;

public class HumanMain {
    public static void main(String[] args) {
        Human mother = new Human("Olena", "Komar");
        Human father = new Human("Andriy", "Komar");
        Human child = new Human("Tanya", "Komar", mother, father);

        System.out.println(child);
    }
}
