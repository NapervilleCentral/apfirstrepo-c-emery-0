/**
 * Ask for the user's name, then display it
 *
 * Celeste Emery
 * 8-31-21
 */

import java.util.Scanner;

public class lab2_extra {
    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);
       
        //Ask user for their name, store in seperate variables
        System.out.println("Full name (first, middle, last): ");
        String first = Keyboard.next();
        String middle = Keyboard.next();
        String last = Keyboard.next();
       
        //Display the user's name
        System.out.println("Your name is:\n" + first + " " + middle.charAt(0)
        + ".\n" + last);
    }
}

/*
 * Output 1:
 *  Full name (first, middle, last):
 *  firstname middlename lastname
 *  Your name is:
 *  firstname m.
 *  lastname
 * Output 2:
 *  Full name (first, middle, last):
 *  Celeste Melinda Emery
 *  Your name is:
 *  Celeste M.
 *  Emery
 */