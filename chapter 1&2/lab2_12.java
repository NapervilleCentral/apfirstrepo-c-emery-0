/**
 * Write an application that determines the value of the coins in a jar
 *
 * celeste emery
 * 8-31-21
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class lab2_12 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
       
        //Ask user for values
        System.out.println("How many quarters? ");
        int quarters = Keyboard.nextInt();
        System.out.println("How many dimes? ");
        int dimes = Keyboard.nextInt();
        System.out.println("How many nickels? ");
        int nickels = Keyboard.nextInt();
        System.out.println("How many pennies? ");
        int pennies = Keyboard.nextInt();
       
        //Other method of retrieving info
        /*
         * System.out.println("Quarters, dimes, nickels, pennis? ");
         * int quarters = Keyboard.nextInt();
         * int dimes = Keyboard.nextInt();
         * int nickels = Keyboard.nextInt();
         * int pennies = Keyboard.nextInt();
         */
       
        //Calculate total amount of money from user's values
        double total = quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + pennies * 0.01;
       
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Total amount of money: " + money.format(total));
    }
}   