/**
 * BIT235 - Object Oriented Programming (OOP)
 * Workshop 2 - Fundamental Programming Structures in Java
 * Exercise 1.5: Volumes of the Earth and the Sun.
 *
 *   Diameter of the Sun   ~ 865,000 miles
 *   Diameter of the Earth ~   7,600 miles
 *
 *   Volume of a sphere = (4/3) * pi * r^3     with r = diameter / 2
 *   pi = 3.14
 *
 * Displays (a) the volume of the Earth, (b) the volume of the Sun and
 * (c) the ratio of the Sun's volume to the Earth's volume.
 */
public class Exercise1_5 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        double sunDiameter   = 865000.0;   // miles
        double earthDiameter = 7600.0;     // miles

        double sunRadius   = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // 4.0 / 3.0 (not 4 / 3) because integer division would give 1.
        double fourThirds = 4.0 / 3.0;

        double earthVolume = fourThirds * PI * Math.pow(earthRadius, 3);
        double sunVolume   = fourThirds * PI * Math.pow(sunRadius, 3);
        double ratio       = sunVolume / earthVolume;

        System.out.println("Volumes of the Earth and the Sun");
        System.out.println("--------------------------------------------------");
        System.out.printf("Earth diameter : %,.0f miles%n", earthDiameter);
        System.out.printf("Earth radius   : %,.0f miles%n", earthRadius);
        System.out.printf("Earth volume   : %.4e cubic miles%n", earthVolume);
        System.out.println();
        System.out.printf("Sun diameter   : %,.0f miles%n", sunDiameter);
        System.out.printf("Sun radius     : %,.0f miles%n", sunRadius);
        System.out.printf("Sun volume     : %.4e cubic miles%n", sunVolume);
        System.out.println("--------------------------------------------------");
        System.out.printf("Ratio (Sun / Earth) : %,.2f%n", ratio);
        System.out.printf("The Sun is about %,d times larger than the Earth.%n",
                Math.round(ratio));
    }
}
