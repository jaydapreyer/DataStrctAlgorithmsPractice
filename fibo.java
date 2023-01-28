package com.dSandAlgorithms;

public class fibo {

	public static void main(String[] args) {
		fibo recursion = new fibo();
		var rec = recursion.fibonacci(3);
		System.out.println(rec);

	}

	public int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}

		if (n == 0 || n == 1) {
			return n;
		}
		// fibonacci recursion
		return fibonacci(n - 1) + (n - 2);
	}

}
/*
 * fibonacci(4)
 * 
 * 
 * -----> Fibo(3) + fibo(2) -----> fibo(1) + fibo(0)
 * 
 * ----------> fibo(2) + fibo(1)
 * 
 * 
 * -------> fibo(1) + fibo(0)
 */
