package Lesson6;
import java.util.Scanner;

public class Conservation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int apples, bigJar, midJar, smlJar;

        System.out.print("Введіть кількість яблук: ");
        apples = in.nextInt();

        bigJar = apples / 5;
        apples = apples - (bigJar * 5);

        midJar = apples / 3;
        apples = apples - (midJar * 3);

        smlJar = apples;

        System.out.println("Великих банок: " + bigJar);
        System.out.println("Середніх банок: " + midJar);
        System.out.println("Маленьких банок: " + smlJar);
    }
}
