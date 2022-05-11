package Lesson6;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float num1, num2, sum;
        String symb;

        System.out.print("Введіть перше число: ");
        num1 = in.nextFloat();
        System.out.print("Введіть знак: ");
        symb = in.next();
        System.out.print("Введіть друге число: ");
        num2 = in.nextFloat();

        if ("+".equals(symb)) {
            sum = num1 + num2;
            System.out.println("Результат: " + sum);
        }
        else if ("-".equals(symb)) {
            sum = num1 - num2;
            System.out.println("Результат: " + sum);
        }
        else if ("*".equals(symb)) {
            sum = num1 * num2;
            System.out.println("Результат: " + sum);
        }
        else if ("/".equals(symb) || (":".equals(symb))) {
            sum = num1 / num2;
            System.out.println("Результат: " + sum);
        }
        else {
            System.out.println("Введіть правильно знак");
        }
    }
}
