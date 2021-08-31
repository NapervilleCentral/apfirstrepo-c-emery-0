
/**
 * Translate and print out hours, minutes, and seconds from some amount of seconds.
 *
 * Celeste Emery, Samantha Pan
 * 8-30-21
 */
import java.util.Scanner;

public class lab2_7
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter seconds ");
        int time = Keyboard.nextInt   ();

        System.out.println("Hours: "+ (int)(time / 3600));
        
        time = time % 3600;

        System.out.println("Minutes: " + (int)(time / 60));

        time = time % 60;

        System.out.println("Seconds: " + time);
    }
}
