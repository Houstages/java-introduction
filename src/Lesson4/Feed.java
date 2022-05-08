package Lesson4;

public class Feed {
    public static void main(String[] args) {
        int cats = 8, dogs = 24, portion = 50, pricePerServing = 2;

        int feedCats = kormMonth(cats, portion);
        int feedDogs = kormMonth(dogs, portion);
        int money = moneyMonth(feedCats, feedDogs, pricePerServing);

        System.out.println("Нужно корма для котов в месяц: " + feedCats);
        System.out.println("Нужно корма для собак в месяц: " + feedDogs);
        System.out.println("Нужно денег в месяц на содержание приюта: " + money);
    }

    public static int kormMonth(int pet, int portion) {
        return ((pet * portion) * 3) * 30;
    }
    public static int moneyMonth(int feedCats, int feedDogs, int pricePerServing) {
        return (feedCats + feedDogs) * pricePerServing;
    }
}
