package java_programs;

import java.util.Scanner;

public class FibanacciNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {

			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
