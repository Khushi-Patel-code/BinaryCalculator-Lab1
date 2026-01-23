package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        System.out.println("-------------------------------------");

        Binary b1 = new Binary("00010001000");
        Binary b2 = new Binary("111000");

        System.out.println("Binary 1: " + b1.getValue());
        System.out.println("Binary 2: " + b2.getValue());
        System.out.println("-------------------------------------");

        Binary sum = Binary.add(b1, b2);
        System.out.println("Sum: " + sum.getValue());

        Binary orResult = Binary.or(b1, b2);
        System.out.println("OR: " + orResult.getValue());

        Binary andResult = Binary.and(b1, b2);
        System.out.println("AND: " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(b1, b2);
        System.out.println("Multiply: " + multiplyResult.getValue());

        System.out.println("-------------------------------------");
    }
}
