package Lesson7;

public class UnluckyNumbers {
    public static void main(String[] args) {

        for(int number = 0, unluck = 4; number <= 100; number++){
            if (number != unluck){
                System.out.println(number);
            }
            else{
                unluck = unluck + 5;
            }
        }
    }
}
