/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.6: Fuel consumption.
 *
 * A car uses 8 litres of fuel per 100 km on normal road and 15% more
 * on rough roads. How far can it travel on a full 40 litre tank on
 * both normal and rough roads?
 *
 *   distance = tankCapacity / fuelPer100km * 100
 */
public class Exercise1_6 {

    public static void main(String[] args) {
        double tankCapacity        = 40.0;   // litres
        double normalConsumption   = 8.0;    // litres per 100 km
        double roughIncrease       = 0.15;   // 15% more fuel

        double roughConsumption    = normalConsumption * (1 + roughIncrease);

        double normalDistance = tankCapacity / normalConsumption * 100.0;
        double roughDistance  = tankCapacity / roughConsumption  * 100.0;

        System.out.println("Fuel Consumption");
        System.out.println("--------------------------------------------------");
        System.out.printf("Tank capacity                   : %.1f litres%n", tankCapacity);
        System.out.println();
        System.out.printf("Normal road : %.1f litres / 100 km%n", normalConsumption);
        System.out.printf("  Distance on a full tank : %.2f km%n", normalDistance);
        System.out.println();
        System.out.printf("Rough road  : %.1f litres / 100 km (+15%%)%n",
                roughConsumption);
        System.out.printf("  Distance on a full tank : %.2f km%n", roughDistance);
        System.out.println("--------------------------------------------------");
        System.out.printf("The rough road costs the car %.2f km of range.%n",
                normalDistance - roughDistance);
    }
}
