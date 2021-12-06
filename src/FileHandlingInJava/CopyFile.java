package FileHandlingInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile {

	public static void main(String[] args) {
		copyFile();

	}
public static void copyFile() {
	File sfile= new File("C:\\Users\\diya-nshriyan\\Desktop\\Java\\test.txt");
	File dfile = new File("C:\\Users\\diya-nshriyan\\Desktop\\Java\\copiedtest.txt");
	
	FileInputStream inputFile = null;
	FileOutputStream outputFile = null;
	
	try {
		inputFile = new FileInputStream(sfile);
		outputFile = new FileOutputStream(dfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		System.out.println(inputFile.available());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	int i=0;
	try {
		while((i=inputFile.read())!=-1) {
			outputFile.write(i);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(inputFile != null) {
			try {
				inputFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(outputFile != null) {
			try {
				outputFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
