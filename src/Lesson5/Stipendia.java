package Lesson5;
import java.util.Scanner;

public class Stipendia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat, ukr, his, inf, bio;
        float sBal;

        System.out.print("������ ������ �� ����������: ");
        mat = in.nextInt();
        System.out.print("������ ������ �� ���.����: ");
        ukr = in.nextInt();
        System.out.print("������ ������ �� ������: ");
        his = in.nextInt();
        System.out.print("������ ������ �� �����������: ");
        inf = in.nextInt();
        System.out.print("������ ������ �� ������: ");
        bio = in.nextInt();

        sBal = (mat + ukr + his + inf + bio) / 5.0f;

        if (sBal >= 10.0){
            System.out.println("������� ���: " + sBal + " - �������� ��������");
        }
        else if (sBal >= 8.0){
            System.out.println("������� ���: " + sBal + " - �������� ��������");
        }
        else{
            System.out.println("������� ���: " + sBal + " - ���� ������䳿");
        }
    }
}
