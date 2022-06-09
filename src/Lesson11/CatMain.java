package Lesson11;

public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Pushok", 2, 5, "chow chow");
        System.out.println(cat);

        Cat cat2 = new Cat("Kotik", 3, 6, "chow chow");
        System.out.println(cat2);

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));

    }
}
