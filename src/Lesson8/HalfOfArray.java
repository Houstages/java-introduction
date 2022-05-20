package Lesson8;
import java.util.Scanner;

public class HalfOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];

        System.out.print("Введіть 20 цифр: ");
        for(int i = 0; i < 20; i++)  array[i] = in.nextInt();

        int[] half1 = new int[10];
        int[] half2 = new int[10];

        for(int j = 0, i = 0; i < 20; i++, j++){
            while(i < 10){
                half1[i] = array[i];
                i++;
            }
            half2[j] = array[i];
        }
        System.out.println("Перший масив: ");
        for(int i = 0; i < 10; i++){
            System.out.print(half1[i] + ", ");
        }
        System.out.println("\nДругий масив: ");
        for(int i = 0; i < 10; i++){
            System.out.print(half2[i] + ", ");
        }
    }
}
