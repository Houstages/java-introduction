package Lesson5;
import java.util.Scanner;

public class Klad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len, wid, hei;
        System.out.println("Введіть довжину: ");
        len = in.nextInt();
        System.out.println("Введіть ширину: ");
        wid = in.nextInt();
        System.out.println("Введіть висоту: ");
        hei = in.nextInt();

        if (len <= 55 && wid <= 20 && hei <= 40 || len <= 40 && wid <= 22 && hei <= 53) {
            System.out.println("Допустимі габарити");
        }
        else {
            System.out.println("Недопустимі габарити");
        }
    }
}


