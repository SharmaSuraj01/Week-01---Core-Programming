package Methods;

import java.util.Scanner;

public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();
        if (children <= 0) {
            System.out.println("Number of children must be greater than 0.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        scanner.close();
    }
}
