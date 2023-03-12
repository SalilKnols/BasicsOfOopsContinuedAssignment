package Question2;

import java.util.Scanner;

public class OverloadingExample2
{
    static void print(int number)
    {
        System.out.println("Function to print a number "+number);
    }
    static void print(String text)
    {
        System.out.println("Function to print a String "+text);
    }
    public static void main(String args[])
    {
        int number;
        String text;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a number");
        number = takeInput.nextInt();
        System.out.println("Enter a string");
        text = takeInput.nextLine();
        text = takeInput.nextLine();
        OverloadingExample2.print(number);
        OverloadingExample2.print(text);
    }
}
