package java_programs;

import java.util.Scanner;

public class LinearSearchString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = in.next();
		System.out.println("Enter target character to search");
		String target = in.next();
		System.out.println(linearSearchString(str, target));
	}

	private static boolean linearSearchString(String str, String target) {
		if (str.length() == 0) {
			return false;
		}
		/*
		for (int i = 0; i < str.length(); i++) {
			// convert target to character
			char targetc = target.charAt(0);
			if (str.charAt(i) == targetc) {
				return true;
			}
		}*/
		
		for(char ch: str.toCharArray()) {
			char targetc = target.charAt(0);
			if (ch == targetc) {
				return true;
			}
		}
		return false;
	}
}
