package Methods;

import java.util.Scanner;

public class TrigonometricCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine(%.2f°) = %.4f\n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, results[2]);
        scanner.close();
    }
}
