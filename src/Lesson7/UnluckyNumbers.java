package Lesson7;

public class UnluckyNumbers {
    public static void main(String[] args) {

        System.out.print("Lucky numbers: ");
        for(int number = 0, unluck1 = 4, unluck2 = 40, i = 49; number <= 100; number++){
            if (number != unluck1 && number != unluck2){
                System.out.print(number + ", ");
            }
            else if (number == unluck2) {
                while (unluck2 < i) {
                    unluck2++;
                    number++;
                    }
                i = i + 51;
                unluck1 = unluck1 + 10;
                unluck2 = unluck2 + 41;
            }
            else {
                unluck1 = unluck1 + 5;
                }
            }
        }
    }

