package Lesson5;
import java.util.Objects;
import java.util.Scanner;

public class Klad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len, wid, hei;
        System.out.println("������ �������: ");
        len = in.nextInt();
        System.out.println("������ ������: ");
        wid = in.nextInt();
        System.out.println("������ ������: ");
        hei = in.nextInt();

        if (len <= 55 && wid <= 20 && hei <= 40 || len <= 40 && wid <= 22 && hei <= 53) {
            System.out.println("�������� ��������");
        }
        else {
            System.out.println("���������� ��������");
        }
    }
}


