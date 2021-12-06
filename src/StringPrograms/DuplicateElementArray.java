package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementArray {

	public static void main(String[] args) {

		String[] name = { "Amazon", "flipkart", "Amazon", "myntra", "myntra" };

		// HashSet
		Set<String> data = new HashSet<String>();
		for (String e : name) {
			if (data.add(e) == false) {
				 System.out.println(e);
			}
		}

		// HashMap
		Map<String, Integer> datamap = new HashMap<String, Integer>();
		for (String e : name) {
			Integer count = datamap.get(e);
			if (count == null) {
				datamap.put(e, 1);
			} else {
				datamap.put(e, ++count);
			}
		}

		// print duplicate entries
		Set<Entry<String, Integer>> entry = datamap.entrySet();
		for (Entry<String, Integer> en : entry) {
			if (en.getValue() > 1) {
				System.out.println(en.getKey());
			}
		}

	}
}