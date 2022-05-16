package Lesson6;
import java.util.Scanner;

public class Minimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Введіть перше число: ");
        num1 = in.nextInt();
        System.out.print("Введіть друге число: ");
        num2 = in.nextInt();
        System.out.print("Введіть третє число: ");
        num3 = in.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.println("Перше число мінімальне: " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Друге число мінімальне: " + num2);
        }
        else if (num3 < num1 && num3 < num2){
            System.out.println("Третє число мінімальне: " + num3);
        }
        else {
            System.out.println("Однакові числа");
        }
    }
}
