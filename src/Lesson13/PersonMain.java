package Lesson13;


public class PersonMain {
    public static void main(String[] args) {
        int weight = 0, age;
        int height, minH = 50, maxH = 175;

        String[] names = {"Sasha", "Andriy", "Volodymyr", "Tanya", "Maryana", "Alina"};
        String[] lastNames = {"Vyshnevetsky", "Komar", "Ostroh", "Teterya", "Pac", "Gordienko"};

        Person[] arrPers = new Person [100];

        for(int i = 0; i < arrPers.length; i++){
            age = 1 + (int) (Math.random() * 99);
            height = minH + (int) (Math.random() * maxH);
            weight = Weight(weight, height);

            arrPers[i] = new Person(names[(int) (Math.random() * names.length)], lastNames[(int) (Math.random() * lastNames.length)], age, height, weight);
        }
        for(int i = 0; i < arrPers.length; i++) {
            System.out.println(arrPers[i]);
        }
    }

    public static int Weight(int weight, double hei){
        int j = 0;
        double BMI, height;
        int minW = 0, maxW = 215;

        height = hei / 100;
        while(j == 0){
            weight = minW + (int) (Math.random() * maxW);
            BMI = weight / Math.pow(height, 2);
            if(BMI > 10 && BMI < 50){
                j++;
            }
        }
        return weight;
    }
}
