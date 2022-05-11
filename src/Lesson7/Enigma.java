package Lesson7;
import java.util.Scanner;
import java.util.Random;

public class Enigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int num, rndm = rand.nextInt(11);

        System.out.print("Введіть число: ");
        num = in.nextInt();

        while (num != rndm){
            System.out.print("Введіть число: ");
            num = in.nextInt();
        }
        System.out.print("Відгадав! Число: " + num);
    }


}
