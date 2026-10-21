/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.7: String question.
 *
 * Question: How long is the string returned by the following
 *           expression? What is the string?
 *
 *               "I love java programming".substring(7, 11);
 *
 * WRITTEN ANSWER
 * --------------
 * substring(int beginIndex, int endIndex) returns the characters from
 * beginIndex (inclusive) up to endIndex (exclusive), so the length is
 * endIndex - beginIndex = 11 - 7 = 4.
 *
 * Index : 0 1 2 3 4 5 6 7  8  9 10 11 12 ...
 * Char  : I   space l o v e space j  a  v  a ...
 *                              ^-- beginIndex 7
 *                                      ^-- endIndex 11 (excluded)
 *
 * Therefore the string is "java" and its length is 4.
 *
 * This program prints that answer and proves it with the real method.
 */
public class Exercise1_7 {

    public static void main(String[] args) {
        String text = "I love java programming";

        String result = text.substring(7, 11);

        System.out.println("Original string : \"" + text + "\"");
        System.out.println("Expression      : text.substring(7, 11)");
        System.out.println();
        System.out.println("Result          : \"" + result + "\"");
        System.out.println("Length          : " + result.length());
        System.out.println();
        System.out.println("Why: beginIndex 7 is inclusive, endIndex 11 is");
        System.out.println("exclusive, so 11 - 7 = 4 characters are returned,");
        System.out.println("starting at the first 'j' of \"java\".");
    }
}
