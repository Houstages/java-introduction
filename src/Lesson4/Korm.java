package Lesson4;

public class Korm {
    public static void main(String[] args) {
        int cats = 8, dogs = 24, portion = 50, price = 2;

        int kormCats = kormMonth(cats, portion);
        int kormDogs = kormMonth(dogs, portion);
        int money = moneyMonth(kormCats, kormDogs, price);

        System.out.println("����� ����� ��� ����� � �����: " + kormCats);
        System.out.println("����� ����� ��� ����� � �����: " + kormDogs);
        System.out.println("����� ����� � ����� �� ���������� ������: " + money);
    }

    public static int kormMonth(int a, int b) {
        return ((a * b) * 3) * 30;
    }
    public static int moneyMonth(int a, int b, int c) {
        return (a + b) * c;
    }
}
