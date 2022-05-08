package Lesson5;
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mat, ukr, his, inf, bio;
        float GPA;

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

        GPA = (mat + ukr + his + inf + bio) / 5.0f;

        if (GPA >= 10.0){
            System.out.println("Середній бал: " + GPA + " - підвищена стипендія");
        }
        else if (GPA >= 8.0){
            System.out.println("Середній бал: " + GPA + " - звичайна стипендія");
        }
        else{
            System.out.println("Середній бал: " + GPA + " - немає стипендії");
        }
    }
}
