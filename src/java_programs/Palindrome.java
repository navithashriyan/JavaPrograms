package java_programs;

import java.io.InputStream;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//String str = "madambmadam";
		Scanner sc =new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(isPalindrm(str));
		System.out.println("test");
	}

	private static boolean isPalindrm(String str) {
		str.toLowerCase();
		int len = str.length();
		for (int i = 0; i < len/2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(len-1-i);
			if (start != end) {
				return false;
			}
		}
		return true;
	}
}
