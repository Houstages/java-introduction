package Lesson8;
import java.util.Random;
import java.util.stream.IntStream;

public class Football {
    public static void main(String[] args) {
        int min = 18, max = 45;
        int[] team1 = new int[11];
        int[] team2 = new int[11];

        for(int i = 0; i < 11; i++) team1[i] = min + (int)(Math.random() * ((max - min) + 1));
        for(int i = 0; i < 11; i++) team2[i] = min + (int)(Math.random() * ((max - min) + 1));

        System.out.println("Перша команда: ");
        printTeam(team1);
        System.out.println("Друга команда: ");
        printTeam(team2);

        double avg1 = AVG(team1);
        double avg2 = AVG(team2);

        if(avg1 > avg2){
            System.out.println("Середній вік 1 команди більший: " + avg1);
        }
        else if (avg2 > avg1) {
            System.out.println("Середній вік 2 команди більший: " + avg2);
        }
        else{
            System.out.println("Середній вік рівний");
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
