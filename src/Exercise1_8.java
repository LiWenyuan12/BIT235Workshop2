import java.util.Scanner;

/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.8: Compare two strings.
 *
 * The user enters two Strings. The program:
 *   - compares the whole strings with equals(Object anObject) and
 *     displays "the two given strings are equal" True / False;
 *   - compares the first character of each string with charAt(int).
 */
public class Exercise1_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string  : ");
        String first = input.nextLine();

        System.out.print("Enter the second string : ");
        String second = input.nextLine();

        // equals() compares the contents; == would only compare references.
        boolean stringsEqual = first.equals(second);

        System.out.println();
        System.out.println("The two given strings are equal: " + stringsEqual);

        // charAt(0) needs a non-empty string, so guard against it first.
        if (first.isEmpty() || second.isEmpty()) {
            System.out.println("The first character cannot be compared "
                    + "because at least one string is empty.");
        } else {
            char firstChar  = first.charAt(0);
            char secondChar = second.charAt(0);

            System.out.println("First character of string 1: '" + firstChar + "'");
            System.out.println("First character of string 2: '" + secondChar + "'");

            boolean firstCharsEqual = firstChar == secondChar;
            System.out.println("The first characters are equal: " + firstCharsEqual);
        }

        input.close();
    }
}
