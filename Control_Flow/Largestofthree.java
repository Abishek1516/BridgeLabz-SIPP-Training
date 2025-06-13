package Control_Flow;
import java.util.*;
public class Largestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input from user of three numbers 
		System.out.println("Enter number1 :");
		int number1 = sc.nextInt();
		System.out.println("Enter number2 :");
		int number2 = sc.nextInt();
		System.out.println("Enter number3 :");
		int number3 = sc.nextInt();
		// Checking which number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Displaying the result
        System.out.println("\nIs the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);


	}

}
