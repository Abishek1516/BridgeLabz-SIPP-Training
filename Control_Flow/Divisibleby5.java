package Control_Flow;

import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input by user for number to be checked
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		//enter the formula to be checked
		if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
		
	}

}
