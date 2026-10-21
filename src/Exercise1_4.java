/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.4: Compound interest.
 *
 * A = P * (1 + r)^n
 *   P = 5000.00  (investment)
 *   r = 4%       (interest rate per year  ->  0.04)
 *   n = 10       (number of years)
 *
 * The hint asks for Math.pow(1 + r, n) instead of writing the power out.
 */
public class Exercise1_4 {

    public static void main(String[] args) {
        double principal  = 5000.00;   // P
        double rate       = 0.04;      // r, 4% written as a decimal
        int    years      = 10;        // n

        double amount = principal * Math.pow(1 + rate, years);   // A

        System.out.println("Compound Interest");
        System.out.println("----------------------------------------");
        System.out.printf("Principal (P)          : $%,.2f%n", principal);
        System.out.printf("Interest rate (r)      : %.0f%% per year%n", rate * 100);
        System.out.printf("Number of years (n)    : %d%n", years);
        System.out.println("----------------------------------------");
        System.out.printf("Amount (A)             : $%,.2f%n", amount);
        System.out.printf("Interest earned        : $%,.2f%n", amount - principal);
    }
}
