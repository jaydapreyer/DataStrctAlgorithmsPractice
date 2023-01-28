package com.dSandAlgorithms;

//How to find the sum of digits of a positive integer number using recursion

public class sumOfDigits {


	public static void main(String[] args) {
		sumOfDigits num = new sumOfDigits();
		var result = num.sumOfDigits(56);
		System.out.println(result);

	}

	// Step 1: Recursive case: formula
	/*
	 * sum of digits 10 ---> 1 + 0 = 1 10/10 = 1 Remainder 0 54/10 = 5 remainder 4
	 * 112/10 = 11 remainder 2 simOfDigits = n%10 + sumOfDigits(n/10)
	 */
	public int sumOfDigits(int n) {

		// step 2: Base case--the stopping criterion
		/*
		 * -n = 0;
		 * 
		 * step3: Unintentional case: the constraint
		 */
		if (n == 0 || n < 0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}

}
