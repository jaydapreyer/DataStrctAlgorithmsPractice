package com.dSandAlgorithms;

public class dectoBi {

	public static void main(String[] args) {
		dectoBi num = new dectoBi();
		var result = num.decimalToBinary(14);
		System.out.println(result);

	}

	public int decimalToBinary(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 2 + 10 * decimalToBinary(n / 2);
	}

}
