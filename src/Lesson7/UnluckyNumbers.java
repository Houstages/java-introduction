package Lesson7;

public class UnluckyNumbers {
    public static void main(String[] args) {

        System.out.print("Lucky numbers: ");
        for(int number = 0, unluck = 4; number <= 100; number++){
            if (number != unluck){
                System.out.print(number + ", ");
            }
            else{
                unluck = unluck + 5;
            }
        }
    }
}
