package Lesson4;

public class Airplanes {
    public static void main(String[] args) {

        String model1 = "F-22";
        String model2 = "Airbus 737";
        String model3 = "Boeing 777";
        String type1 = "Jet";
        String type2 = "Airliner";

        int Eco1 = 120;
        int Eco2 = 180;
        int Bus1 = 28;

        printAirplaneInfo(model1, type1);
        printAirplaneInfo(model2, type2, Eco1);
        printAirplaneInfo(model3, type2, Eco2, Bus1);

    }

    public static void printAirplaneInfo(String model1, String type1) {
        System.out.println("Модель: " + model1 + ", тип: " + type1);
    }
    public static void printAirplaneInfo(String  model2, String type2, int Eco1) {
        System.out.println("Модель: " + model2 + ", тип: " + type2 + ", кол. пасажиров эконом класса: " + Eco1);
    }
    public static void printAirplaneInfo(String model3, String type3, int Eco2, int Bus1) {
        System.out.println("Модель: " + model3 + ", тип: " + type3 + ", кол. пасажиров эконом класса: " + Eco2 + ", пассажиров бизнеc скласса: " + Bus1);
    }
}
