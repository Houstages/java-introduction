package Lesson4;

public class Korm {
    public static void main(String[] args) {
        int cats = 8, dogs = 24, porcia = 50, price = 2;

        int kormCats = kormMonth(cats, porcia);
        int kormDogs = kormMonth(dogs, porcia);
        int money = moneyMonth(kormCats, kormDogs, price);

        System.out.println("����� ����� ��� ����� � �����: " + kormCats);
        System.out.println("����� ����� ��� ����� � �����: " + kormDogs);
        System.out.println("����� ����� � ����� �� ���������� ������: " + money);
    }

    public static int kormMonth(int a, int b) {
        return a * b;
    }
    public static int moneyMonth(int a, int b, int c) {
        return (a + b) * c;
    }
}
