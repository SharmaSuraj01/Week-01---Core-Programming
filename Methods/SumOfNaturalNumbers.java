package Methods;
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            if (recursiveSum == formulaSum) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("Results do not match.");
            }
        }

        scanner.close();
    }
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
