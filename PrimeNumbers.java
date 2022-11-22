package code;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrime(int number) {
		if (number <= 1)
            return false;
		//System.out.println("checking from 2 to "  + Math.sqrt(number+1) + " for " + number);
		for (int i = 2; i < Math.sqrt(number+1); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // we should add validation here and throw error if user enters a string instead of number
		for (int i = 1; i < input; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
