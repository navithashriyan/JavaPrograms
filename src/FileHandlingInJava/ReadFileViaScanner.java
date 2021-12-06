package FileHandlingInJava;

import java.io.File;
import java.util.Scanner;

public class ReadFileViaScanner {

	public static void main(String[] args) {
		Scanner in = null;
		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java\\test.txt";
		try {
			File file = new File(path);
			in = new Scanner(file);
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

}
