package Lesson8;
import java.util.Random;
import java.util.stream.IntStream;

public class Football {
    public static void main(String[] args) {
        int min = 18, max = 45;
        int[] a = new int[11];
        int[] b = new int[11];

        for(int i = 0; i < 11; i++) a[i] = min + (int)(Math.random() * ((max - min) + 1));
        for(int i = 0; i < 11; i++) b[i] = min + (int)(Math.random() * ((max - min) + 1));

        System.out.println("Перша команда: ");
        printTeam(a);
        System.out.println("Друга команда: ");
        printTeam(b);

        double avg1 = AVG(a);
        double avg2 = AVG(b);

        if(avg1 > avg2){
            System.out.println("Середній вік 1 ком. більший: " + avg1);
        }
        else if (avg2 > avg1) {
            System.out.println("Середній вік 2 ком. більший: " + avg2);
        }
        else{
            System.out.println("Середнє значення рівне");
        }
    }

    public static void printTeam(int[] team) {
        for(int i = 0; i < 11; i++) System.out.print(team[i] + ", ");
        System.out.println(" ");
    }

    public static double AVG(int[] team) {
        double avg, sum = 0;
        for(int i : team) sum += i;

        avg = sum / team.length;
        return avg;
    }
}
