package Patterns;

public class Pattern1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		// pyramid
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("--------------------------------");

		for (int i = 1; i <= 5; i++) {

			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("--------------------------------");

		int alpha = 65;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		int alp = 65;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alp) + " ");
			}
			alp++;
			System.out.println();
		}

	}
}
