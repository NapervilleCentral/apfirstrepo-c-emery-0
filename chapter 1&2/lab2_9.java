/**
 * Find area & circumference given the radius of a sphere.
 *
 * Celeste Emery
 * 8-31-21
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class lab2_9 {
    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);
       
        //ask for radius value
        System.out.print("Enter radius: ");
        double radius = Keyboard.nextInt();

        double pi = 3.1415;
        double volume = pi * Math.pow(radius, 3) * 4 / 3; //calculate volume of sphere
        double area = pi * Math.pow(radius, 2) * 4; //calculate area of sphere
       
        //formatting numbers (volume & S.A. - 4 decimals, radius - decimal if necessary)
        DecimalFormat fmt1 = new DecimalFormat("0.#");
        DecimalFormat fmt2 = new DecimalFormat("0.0000");
       
        System.out.println("Radius: " + fmt1.format(radius));
        System.out.println("Volume: " + fmt2.format(volume));
        System.out.println("Surface area: " + fmt2.format(area));
    }
}