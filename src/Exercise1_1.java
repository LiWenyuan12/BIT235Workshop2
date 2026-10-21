import java.util.Scanner;

/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.1: Difference of two numbers.
 *
 * The user enters two integers, the program calculates their difference
 * and displays the result.
 */
public class Exercise1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer  : ");
        int first = input.nextInt();

        System.out.print("Enter the second integer : ");
        int second = input.nextInt();

        int difference = first - second;

        System.out.println();
        System.out.println("The difference of the two numbers is:");
        System.out.println(first + " - " + second + " = " + difference);

        input.close();
    }
}
