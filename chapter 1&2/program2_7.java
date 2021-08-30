
/**
 * Write a description of class program2_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class program2_7
{
    public static void main (String[] args)
    {
        int time = 2382;

        System.out.println("Hours: "+ (int)(time / 3600));
        
        time = time % 3600;

        System.out.println("Minutes: " + (int)(time / 60));

        time = time % 60;

        System.out.println("Seconds: " + time);
    }
}
