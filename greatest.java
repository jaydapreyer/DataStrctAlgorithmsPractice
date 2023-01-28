package com.dSandAlgorithms;

public class greatest {

	public static void main(String[] args) {
		greatest num = new greatest();
		var result = num.gcd(12, 8);
		System.out.println(result);
	}

	public int gcd(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		}

		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}

}
