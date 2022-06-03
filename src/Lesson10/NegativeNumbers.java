package Lesson10;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть довжину: ");
        int n = in.nextInt();
        System.out.print("Введіть ширину: ");
        int m = in.nextInt();
        int[][] arr = new int[n+1][m+1];

        System.out.print("Введіть елементи матриці: ");
        for(int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] < 0){
                    System.out.print(i);
                    System.out.println(j);
                }
            }
        }


    }
}
