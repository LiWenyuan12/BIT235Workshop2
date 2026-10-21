/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.3: Area of a circle.
 *
 * Area = pi * radius * radius  (pi * r^2), with pi = 3.14.
 * The hint asks for Math.pow(r, 2) instead of r * r.
 */
public class Exercise1_3 {

    /** Value of pi given by the exercise. */
    private static final double PI = 3.14;

    public static void main(String[] args) {
        // Try the calculation with several different radius values.
        double[] radii = {1.0, 2.5, 7.0, 10.5, 20.0};

        System.out.println("Area of a circle  (Area = pi * r^2, pi = 3.14)");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s %-18s%n", "Radius", "Area");

        for (double radius : radii) {
            double area = PI * Math.pow(radius, 2);
            System.out.printf("%-10.2f %-18.4f%n", radius, area);
        }

        // One worked example, spelled out step by step.
        double radius = 5.0;
        double area = PI * Math.pow(radius, 2);
        System.out.println();
        System.out.println("Worked example:");
        System.out.printf("  radius = %.2f%n", radius);
        System.out.printf("  area   = 3.14 * %.2f^2 = %.4f square units%n",
                radius, area);
    }
}
