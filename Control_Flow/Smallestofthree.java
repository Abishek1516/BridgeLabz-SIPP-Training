package Control_Flow;
import java.util.*;
public class Smallestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input from user for all three numbers
		System.out.println("Enter number1 :");
		int number1 = sc.nextInt();
		System.out.println("Enter number2 :");
		int number2 = sc.nextInt();
		System.out.println("Enter number3 :");
		int number3 = sc.nextInt();
		// logic for code 
		  // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + (isFirstSmallest ? "Yes" : "No"));


	}

}
