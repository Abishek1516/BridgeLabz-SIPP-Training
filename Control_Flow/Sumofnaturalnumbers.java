package Control_Flow;
import java.util.*;
public class Sumofnaturalnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input from user for number
		System.out.println("Enter your number :");
		int number = sc.nextInt();
		// logic 
		if (number >= 1) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

	}

}
