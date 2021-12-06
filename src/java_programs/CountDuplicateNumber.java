package java_programs;

import java.util.Scanner;

public class CountDuplicateNumber {
//Find the count of number n is repeated in given number m, also reverse it i.e 134566 - n = 6 is repeated 2 times rev = 665431
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		// 13839 count 3 in this
		int n = number.nextInt();
		int searchNumber = number.nextInt();
		int count = 0, rev =0;
		int lastnumber = 0;
		while (n > 0) {
			lastnumber = n % 10; // 9
			rev=rev*10+lastnumber;
			if (lastnumber == searchNumber) {
				count++;
			}
			n = n / 10;
		}
		System.out.println("The "+ searchNumber+" is repated "+count+" times");
		System.out.println("Reversed number "+rev); 
		
		
		
	}
}
