package FileHandlingInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileViaFileSteam {

	public static void main(String[] args) {
		FileInputStream fos = null;
		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java\\test.txt";

		try {

			File file = new File(path);
			fos = new FileInputStream(file);
			int c = 0;
			while ((c = fos.read()) != -1) {
				System.out.print((char) c);

			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
