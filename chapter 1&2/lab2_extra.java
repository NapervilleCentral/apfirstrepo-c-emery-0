
/**
 * Chapter 2 Lab Program - Name
 * Ask for the user's name, then display it
 *
 * Celeste Emery
 * 8-31-21
 */

import java.util.Scanner;

public class lab2_extra {
    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);
       
        //Ask user for their name
        System.out.println("Full name (first, middle, last): ");
        String name = Keyboard.nextLine();
        
        //Splice name into two (right between 1st + 2nd character of the middle name)
        int middleInit = name.indexOf(" ") + 1;
        String firstToMiddleInit = name.substring(0, middleInit+1);
        String middleToLast = name.substring(middleInit);
        //Find last name's first initial, helps to isolate the last name
        int lastInit = middleToLast.indexOf(" ") + firstToMiddleInit.length();

        System.out.println(firstToMiddleInit + ".\n" + name.substring(lastInit));
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