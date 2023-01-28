package com.dSandAlgorithms;

public class power {
//How to calculate power of a number using recursion
	public static void main(String[] args) {
		power num = new power();
		var result = num.power(6, 7);
		System.out.println(result);

	}

	/*
	 * Step 1: Recursive case the power? -----x^n = x*x*x*x (n times) 2^4 = 2*2*2*2
	 * 
	 */
	public int power(int base, int exp) {
		if (exp < 0) {
			return -1;
		}
		if (exp == 0) {
			return 1;
		}
		return base * power(base, exp - 1);
	}

}
