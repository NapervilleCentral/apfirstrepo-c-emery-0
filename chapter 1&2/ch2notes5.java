    /********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//celeste emery
//8-25-21
//Program
//Description
//Who helped me: Mr. Hayes

import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class



import java.util.*;  // let me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;



public class ch2notes5

{   enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}

    
    public static void main (String[] args)
    {
            //Scanner scan = new Scanner (System.in);
            Scanner Keyboard = new Scanner(System.in);
        
            //Flavor cone = Flavor.razberry;
        
            //these are basic data types
                int length;
                int x = 9,y,z;
                int id = 789; 
                double num = 5, num1 = 23.89765, num2 = 3.4;
                char letter = 'd'; //char and int are the same thing
                boolean choice = false;
        
                //These are Objects
                Integer number = new Integer(47); //wrapper class, WCs for all basic data class
                
             /*
              * [class] [id] = new [class]([data]);
              * [class]([data]) is called a constructor. some objects 
              * dont need data (like string). String is an exception, only 
              * one that can be initialized by 'String last = "hayes";' instead
              */
                String myname = new String("Kevin Hayes");
                Integer n2 = 7;//Auto Boxing
        /**/
                String word = new String("Homer Simpson");
                String word2 = new String("Homer Simpson");
                String word3 = new String("Bart Simpson");
                String name = new String();
                
              //left to right association
              //System.out.println(word + name + 7 + 5);
              //System.out.println(word + name + (7 + 5));
              //System.out.println(7 + 5 + word)
                
                String last = "Hayes";
        
        /*
                System.out.printf("Name:  %s \t ID: %5d \n", name,id);
                System.out.println( 'a' + 100 ); //this adds the ascii value (97) + 100
                System.out.println('a'   ); // find ascii values via TextPad
                System.out.println("A"+100  );
        
        //      System.out.printf(  );
        
        //      System.out.printf( );
        
                System.out.println(  );
        
            System.out.println( );
            System.out.println(  );
        
        /*
        
                num1 = 23.89765; num2 = 3.4;
        //Your create a NumberFormat and Decimalformat object
        //'new' is bundeled into .getCurrencyInstance()
                NumberFormat money = NumberFormat.getCurrencyInstance();
                NumberFormat percent = NumberFormat.getPercentInstance();
                DecimalFormat fmt = new DecimalFormat("0.###");
                DecimalFormat fmt2= new DecimalFormat("0.00");// ## vs 00
        //padding with 0s forces those two decimal points, rounds if too many digits
        //padding with #s doesnt force the decimal points, rounds if too many digits
                
        //java doesnt have functions like python - methods
        //                                          obj.method();
                System.out.println( "Sub Total: " + money.format(num1) );
                System.out.println( "Sub Total: " + percent.format(num1) );
                System.out.println( "Sub Total: " + fmt.format(num1) );
                System.out.println( "Sub Total: " + fmt2.format(num2) );
        
        // page 90 Why do we get this Error???
        /.nextDouble(), nextInt(), nextLong()
        /*
                System.out.print("Enter a number ");
                x = Keyboard.nextInt   ();
                System.out.println(x  );
                System.out.print("Enter a word ");

                Keyboard.nextLine();//clear the input buffer + ? data

                word = Keyboard.next   ();//gets up till whitespace
                //word = Keyboard.nextLine   (); //get input to \n

                System.out.print("Enter three numbers ");
                x = Keyboard.nextInt   ();
                y = Keyboard.nextInt   ();
                z = Keyboard.nextInt   ();
                System.out.print(x + " " + y + " " + z);
        
        /*
                System.out.print("Enter a decimal");
                num = Keyboard.nextDouble ();
                System.out.println(num  );
        
        
                // what happens when you have both of these together
        /*
                System.out.print("Enter a word");
                Keyboard.nextLine();
                word = Keyboard.nextLine();
                System.out.println(word  );
        
        /*      System.out.println( "enter a word" );
                word = Keyboard.nextLine();
                System.out.println(word  );
        /*
                System.out.print("Enter a word "  );
                word = Keyboard.next   ();
                lname = Keyboard.next();
                System.out.println(word + "\n" + lname  );
        
        
        
        /*
        //  Can we make a Math Object? What type of class is Math???
        //    Math silly = new Math(); //Math is a static class, dont need an object
        //    cant use an object too . just use it
        //    math.whatever() returns a number

                System.out.println(Math.abs(-4)); // absolute value
                System.out.println(Math.sqrt (12)); //sqrt
                System.out.println(Math.pow(2,3)*7); //2^3
        //      System.out.println(silly.pow(2,4));
        
        
        /*
        //!!!!!!!!!!!! Make a Random Object called generator
        //
                Random generator = new Random();
        
                x = generator.nextInt(100); //random # from 0-99
                System.out.println("the Random number is " + x);
                
                //17 digits decimal * howmany + range        
                //generates # from 0-1 of 17 digits
                num =generator.nextDouble()*50;
                System.out.println(num);
                
                //random # from 100-200 + 100
                //              *howmany+range
                num =Math.random()*100+100;
                System.out.println(num);
        /*
        
        /*
        //----------------------------Know it live it love it p 78
                 //word is an oject can do things (NOT len(word))
                System.out.println(  word.length() );
                System.out.println(word == word2 );//returns false
                 //cant compare objects - compares memory addresses
                System.out.println(word.equals(word2));
                 //right way to compare String object
                System.out.println( x == 9 );//returns true
                 //primitive data values
                System.out.println(  word.compareTo(word3 )); //compares first characters
                    //positive = greater position
                 //negative = lesser position
                System.out.println(  word.indexOf("p"));
                 //returns index position of the search term
                 //returns -1 if not in search term
                System.out.println(  word.charAt(6));
                  //returns the letter at index position

                int find = word.indexOf("S");
                System.out.println(  word.substring(find));
                   //slice up the string from index to the end
                System.out.println(  word.substring(find,find+2));
                    //slice up the string from index to endIndex
        
        
        
        
        
        //System.out.println((int)(letter + letter ) );
        
            //System.out.println( (char)101 );
        /*
                double conversionFactor = (double)x/5; 
                    //returns 1.8 - (double) is a cast; promotes 5 to 5.0
              //double conversionFactor = 9/5 
                    //2 integer expression returns an integer (9/5 = 1)
              //double conversionFactor = 9.0/5 
                    //returns 1.8 - this is called promotion (automatically promotes 5 to 5.0)
              //double conversionFactor = (int)(9.0/5)
                    //demotes 1.8 to 1
                System.out.println(conversionFactor);
                final int BASE = 32;            // cast is (data type)
                int celsiusTemp = 30;
        
                double fahrenTemp = celsiusTemp * conversionFactor + BASE;
        
                System.out.println("Celsius Temp: " + celsiusTemp );
                System.out.println("Fahrenheit Equivalent" + fahrenTemp  ); 
        
        /*
            //num = num + num;
            //num = num - num;
            //num = num * num;
            //num = num / num;
            num = num % 3; //modulus - remainder
            System.out.println(num);
        
        
        
        /**/
        
        //this will help section out code
    
    }//end of main

}//end of class


/*

copy paste outputs here

*/














