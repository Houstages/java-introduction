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

        String printAirplaneInfo1 = printAirplaneInfo(model1, type1);
        String printAirplaneInfo2 = printAirplaneInfo(model2, type2, Eco1);
        String printAirplaneInfo3 = printAirplaneInfo(model3, type2, Eco2, Bus1);

        System.out.println(printAirplaneInfo1);
        System.out.println(printAirplaneInfo2);
        System.out.println(printAirplaneInfo3);
    }

    public static String printAirplaneInfo(String a, String b) {
        return "Модель: " + a + ", тип: " + b;
    }
    public static String printAirplaneInfo(String  a, String b, int c) {
        return "Модель: " + a + ", тип: " + b + ", кол. пасажиров эконом класса: " + c;
    }
    public static String printAirplaneInfo(String a, String b, int c, int d) {
        return "Модель: " + a + ", тип: " + b + ", кол. пасажиров эконом класса: " + c + ", пассажиров бизнеc скласса: " + d;
    }
}
