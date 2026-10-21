import java.util.Scanner;

/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.2: Convert degrees Celsius to degrees Fahrenheit.
 *
 * Formula: F = C * 9 / 5 + 32
 */
public class Exercise1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // 9.0 and 5.0 are written as doubles on purpose: 9 / 5 with
        // integers would be 1, which silently breaks the formula.
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println();
        System.out.printf("%.2f degrees Celsius = %.2f degrees Fahrenheit%n",
                celsius, fahrenheit);

        input.close();
    }
}
