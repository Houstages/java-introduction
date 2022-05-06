package Lesson5;
import java.util.Scanner;

public class Stipendia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat, ukr, his, inf, bio;
        float sBal;

        System.out.print("Введіть оцінку за математику: ");
        mat = in.nextInt();
        System.out.print("Введіть оцінку за укр.мову: ");
        ukr = in.nextInt();
        System.out.print("Введіть оцінку за історію: ");
        his = in.nextInt();
        System.out.print("Введіть оцінку за інформатику: ");
        inf = in.nextInt();
        System.out.print("Введіть оцінку за біологію: ");
        bio = in.nextInt();

        sBal = (mat + ukr + his + inf + bio) / 5.0f;

        if (sBal >= 10.0){
            System.out.println("Середній бал: " + sBal + " - підвищена стипендія");
        }
        else if (sBal >= 8.0){
            System.out.println("Середній бал: " + sBal + " - звичайна стипендія");
        }
        else{
            System.out.println("Середній бал: " + sBal + " - немає стипендії");
        }
    }
}
