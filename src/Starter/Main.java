package Starter;

import Starter.Extra;
import Starter.Extra2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int store = helperMain(2,5);
        System.out.println(store);


        Extra ex = new Extra();
        ex.print();

        Extra2 ex2 = new Extra2();
        int multipleResult = ex2.multiply(5, 5);
        System.out.print(multipleResult);

        //--------------------------------
        System.out.println();
        System.out.println();

        System.out.println("The number is odd: " + checkOdd(13));

        System.out.println(numberOfSteps(4));


    }

    public static int helperMain(int add1, int add2)
    {
        return add1 + add2;
    }

    public static boolean checkOdd(int check)
    {
        Boolean result = true;

        if ((check % 2) != 0)
        {
            //Number is odd
            return result;

        }
        return !result;

    }

    public static int numberOfSteps(int num)
    {
        //Reduce num to 0

        int counter = 0;
        while (num != 0)
        {
            if ((num % 2) == 0)
            {
                num /= 2;
            }
            num -= 1;
            counter = counter + 1;

        }

        return counter;
    }
}