
/**
 * Chapter 2 Lab Program 2.14 - Random Phone Number
 * Write an application that creates and prints a random phone number of the
 * form XXX-XXX-XXXX
 *
 * celeste emery
 * 8-31-21
 */

import java.util.Random;
import java.text.DecimalFormat;

public class lab2_14 {
    public static void main (String[] args){
        Random generator = new Random();
       
        //Find random values for each segment of the phone number
        int areacode = (generator.nextInt(7) + 1) * 100
                     + (generator.nextInt(8)*10) //Area code can neither have an-
                     + (generator.nextInt(8));   //-8 or 9, nor start with 0
        int exchangecode = generator.nextInt(743); //Exchange code must be <743
        int linenumber = generator.nextInt(10000); //Line number may be anything
        
        //Formatting for the phone number (necessary in case #s begin with 0, 
        //so it would actually print the 0 instead of automatically omitting it)
        DecimalFormat fmt = new DecimalFormat("000");
        DecimalFormat fmt2 = new DecimalFormat("0000");
        System.out.println("Your random phone number is: "+ fmt.format(areacode)
        + "-" + fmt.format(exchangecode) + "-" + fmt2.format(linenumber));
       
    }
}

/*
 *  Output 1: 
 *     Your random phone number is: 744-299-8300
 *  Output 2: 
 *     Your random phone number is: 404-483-8169
 */
