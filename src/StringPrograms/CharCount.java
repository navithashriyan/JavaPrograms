package StringPrograms;

import java.util.HashMap; //HashMap is Class
import java.util.Map; // Map is interface

public class CharCount {

	public static void main(String[] args) {
		getCharCount("Test test   t ");
	}

	public static void getCharCount(String s) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] charA = s.toCharArray();
		int count = 0;
		for (char c : charA) {
			if (!String.valueOf(c).isBlank()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}
			}
			if (String.valueOf(c).isBlank()) {
				count++;
			}
		}
		System.out.println(charMap);
		System.out.println("No of blank spaces: " + count);
	}
}
