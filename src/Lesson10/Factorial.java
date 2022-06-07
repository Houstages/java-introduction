package Lesson10;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int n = in.nextInt();

        int fctr = factorial(n);
        System.out.println("Факторіал числа = " + fctr);
    }

    public static int factorial(int n) {
        if (n == 1){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
