package ch1;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choose = 0;
        double firstNumber ;
        double secondNumber ;
        while (choose != 4) {
            System.out.println("\t\t Welcome To Calculator");
            System.out.println("\t\t1.Add : ");
            System.out.println("\t\t2.Subtract : ");
            System.out.println("\t\t3.multiply : ");
            System.out.println("\t\t4.exit : ");
            System.out.print("\t\t#choose : ");
            choose = sc.nextInt();
            if (choose == 1 )
            {
                System.out.println("\n\n\n\n\n\n");
                printInput();
                firstNumber = sc.nextDouble();
                printInput();
                secondNumber = sc.nextDouble();
                printOutput( add( firstNumber , secondNumber) );

            }

            else if (choose == 2 )
            {
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                printInput();
                firstNumber = sc.nextDouble();
                printInput();
                secondNumber = sc.nextDouble();
                printOutput( subtract( firstNumber , secondNumber ) );
            }

            else if (choose == 3 )
            {
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                printInput();
                firstNumber = sc.nextDouble();
                printInput();
                secondNumber = sc.nextDouble();
                printOutput( multiply( firstNumber , secondNumber ) );
            }
            else
                System.out.println("\t\t!!!Please Choose Correct Number!!!");

        }
        System.out.println("\t\tDesign By Haj Ali");
        System.out.println("\t\tPirghazani.ali@gmail.com");
    }
    public static void printInput ()
    {
        System.out.print("\n\t\tEnter Your Number : ");
    }
    public static void printOutput (double a)
    {
        System.out.println("\n\t\tThe Result Is : "+a+"\n\n");
    }
    public static double add (double a , double b)
    {

        return a+b;
    }
    public static double subtract (double a , double b)
    {
            return a-b;
    }
    public static double multiply (double a , double b)
    {
        return a*b;
    }
}
