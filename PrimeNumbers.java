import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumbers {
	public static void main(String[] args) {
		// create new scanner instance
		Scanner scan = new Scanner(System.in);

		// greet user
		System.out.println("Hello! In this program you enter a target number that is a positive integer and the program will tell you every prime number up to that number.");

		// create targetValue integer
		int targetValue;

		// ask user for target value and check input
		System.out.println("What is your target value (must be 2 or greater)?");
		while (true) {
			if (scan.hasNextInt()) {
				targetValue = scan.nextInt();
				if (targetValue > 1) {
					break;
				} else {
					System.out.println("Please enter a value that is 2 or greater.");
					continue;
				}
			} else {
				System.out.println("That's not an integer.");
				System.out.println("Please enter a positive integer.");
				scan.next();
			} 
		}

		// check that target value is established
		// System.out.println(targetValue);

		// create index variables for loops
		int i, j, k;

		// create boolean for prime checking
		Boolean isPrime = true;

		// create array for prime numbers
		int primeArr[] = { 2 };

		// create for loops to check for primes
		for (i = 2; i < targetValue + 1; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				primeArr = Arrays.copyOf(primeArr, primeArr.length + 1);
				primeArr[primeArr.length - 1] = i;
			}
		}

		// loop through primes array and print out numbers.
		System.out.println("The prime numbers up to the target value are:");
		for (k = 0; k < primeArr.length; k++) {
			System.out.println(primeArr[k]);
		}
	}
}