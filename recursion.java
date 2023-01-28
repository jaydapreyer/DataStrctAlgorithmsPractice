package com.dSandAlgorithms;

public class recursion {

	public static void main(String[] args) {
		// create new object in order to call function

		recursion num = new recursion();

		// create variable to call factorial function from object

		var rec = num.factorial(4);

		// print variable which equals num.factorial function
		System.out.println(rec);

	}

	/*
	 * Factorials: 4! = 4*3*2*1 = 4 Step1: formula n! = n * (n-1) * (n-2) *.... 2 *
	 * 1 >>>>> n! = n * (n-1)
	 * 
	 * Step2: base case; stopping criterion (conditional statements) code will call
	 * itself and will cause system crash, must have stopping point 1 & 0]
	 * 
	 * Step3: unintentional case-the constraint. -1? -2?
	 * 
	 */
	public int factorial(int n) {
		if (n < 1) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}

		// factorial function
		return n * factorial(n - 1);

	}
}

/*
 * What's happening behind the scenes of this recursion example? factorial(4) 1.
 * checks first condition(to see if n<0) 2. goes to second condition (to see if
 * n ==0 or n==1) 3. Then it goes to factorial function and runs the number : 4
 * * factorial (3) 4. repeats testing conditions and running function until
 * factorial(1), hence n==1 5. the remaining factorial number 2, will be
 * multiplied by 1. 2* factorial(1)
 */
