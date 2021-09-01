
/**
 * Translate and print out hours, minutes, and seconds from some amount of seconds.
 *
 * Celeste Emery, Samantha Pan
 * 8-30-21
 */
import java.util.Scanner;

public class lab2_7 {
    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter seconds ");
        int time = Keyboard.nextInt   ();

        //This is the version we wrote before receiving feedback from Mr. Hayes
        //System.out.println("Hours: "+ (int)(time / 3600));
        //time = time % 3600;
        //System.out.println("Minutes: " + (int)(time / 60));
        //time = time % 60;
        //System.out.println("Seconds: " + time);

        //This is the version I wrote by myself after receiving feedback
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = (time % 3600) % 60;

        System.out.println("Hours: "+ hours);
        System.out.println("Minutes: "+ minutes);
        System.out.println("Seconds: "+ seconds);
    }
}