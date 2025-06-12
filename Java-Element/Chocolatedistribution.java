import java.util.Scanner;

public class Chocolatedistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolate = scanner.nextInt();

	System.out.print("Enter the number of children: ");
	int childrens=scanner.nextInt();

        int chocolatesPerChild = chocolate / childrens;
        int remainingChocolates = chocolate % childrens;

        System.out.println("The weight of the person in pounds is " + pounds + 
                           " and in kg is " + kilograms);

    }
}
