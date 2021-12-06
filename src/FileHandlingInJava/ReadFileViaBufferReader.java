package FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileViaBufferReader {

	public static void main(String[] args) {
		BufferedReader br = null;
		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java\\test.txt";
		
	try {
		br = new BufferedReader(new FileReader(path));
		int c = 0;
		while((c=br.read())!=-1){
			System.out.print((char)c);
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	} finally {
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

}
