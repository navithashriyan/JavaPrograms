package StringPrograms;

import java.util.ArrayList;

public class FindDuplicates {
	public static void main(String[] args) {
		String str = "madamnavithan";
		findDuplicates(str);
	}

	public static void findDuplicates(String str) {
		int count = 0;
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != ch) {
					continue;
				}
				count++;
			//	System.out.println(count);
			}
			if (!charList.contains(ch)) {
				 if (count >= 1 && ch != ' ') {
				//if (count > 1 && ch != ' ') {
					System.out.println("Char: " + ch + ", Count: " + count + " times.");
					charList.add(ch);
				}
			}
			// set counter to zero for next ch
			count = 0;
		}
	}
}
