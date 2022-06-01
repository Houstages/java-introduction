package Lesson9;


import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int  n = 0, min = 0, max = 9;
        int[] draw = new int[7];
        int[] playerNums = new int[7];

        for (int i = 0; i < draw.length; i++) {
            draw[i] = min + (int) (Math.random() * max);
        }

        System.out.println("Введіть 7 чисел: ");
        for (int i = 0; i < playerNums.length; i++) {
            playerNums[i] = in.nextInt();
        }

        Sort(draw);
        Sort(playerNums);

        for(int i = 0; i < draw.length; i++) {
            if(draw[i] == playerNums[i]){
                n++;
            }
        }

        System.out.println("Кількість збігів: " + n);
    }

    public static void Sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
