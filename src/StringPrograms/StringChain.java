package StringPrograms;

public class StringChain {

	public static void main(String[] args) {
		String letters = "ABCAB";
		System.out.println(letters.substring(0, 2).startsWith(letters, 'A'));

	}

}
