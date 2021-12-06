package FileHandlingInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileViaFileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java\\test.txt";
		
		try {
			fr = new FileReader(new File(path));
			int c = 0;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
