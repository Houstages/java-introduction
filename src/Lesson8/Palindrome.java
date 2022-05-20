package Lesson8;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть строку: ");
        String sentence = in.next();
        char[] array = sentence.toCharArray();

        int k = array.length-1;

        for(int i = 0; i < array.length; i++, k--){
            char x1 = array[i];
            char x2 = array[k];
            if(x1 != x2){
                System.out.println("Не є паліндромом");
                break;
            }
            else if (k == 0) {
                System.out.println("Паліндром");
            }
        }
    }
}