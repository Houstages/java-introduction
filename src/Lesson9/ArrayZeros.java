package Lesson9;

import java.util.Scanner;

public class ArrayZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.println("Введіть 7 чисел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for(int j : arr) {
            System.out.print(j + " ");
        }
    }
}
