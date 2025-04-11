//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner; //Import this for user input
public class Main {

    public static void main(String[] args) {
        String ey = "Banana";
        System.out.println(ey.length());

        //Print a out each character from a string one character at a time on each line
        for(int i = 0; i < ey.length(); i++)
        {
            System.out.println(ey.charAt(i));
        }

        //Fill an array with numbers and prints them out

        int[] array = new int[5];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = i*3;
            System.out.println(array[i]);
        }

        //Nested Loop

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("*");
            }
            System.out.println(":)");
        }

        //while loop,user input, and converting a string into an int - Look above with comment for neccesary import
        Scanner input = new Scanner(System.in);
       /* int num = -1;
        while (num != 5) {
            System.out.println("Enter a number from 1-10, keep guessing until you get it right:");
            String answer = input.nextLine();
            num = Integer.parseInt(answer);
            //System.out.println(num);
        }
        System.out.println("It was 5 great job!");

        // Main for finding factorial
        System.out.println("Enter a number I'll find its factorial");
        String answer = input.nextLine();
        int fact = Integer.parseInt(answer);
        System.out.println(findFactorial(fact));
        */

        //Main for Fibonacci Sequence
        System.out.println("Enter which index from the fibonacci you'd like to be printed");
        String answer = input.nextLine();
        int fib = Integer.parseInt(answer);
        System.out.println(digitOfFib(fib));


    }
    // Method & recursive loop to find a factorial
    public static int findFactorial(int num)
    {
       if(num <= 0) {
           return 1;
       }
       return findFactorial(num-1) * num;
    }
    public static int digitOfFib(int digit)
    {
        int total = 0;
        return digitOfFibHelper(digit, total);
    }
    public static int digitOfFibHelper(int digit, int accumulator)
    {
        if (digit == 0)
            return 0;
        else if(digit == 1 || digit == 2)
            return 1;
        else if(digit == 3)
            return 2;
        return digitOfFibHelper(digit -1, accumulator);

    }
}

