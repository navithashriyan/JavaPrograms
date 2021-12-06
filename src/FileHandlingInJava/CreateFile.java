package FileHandlingInJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java\\createfile.txt";
		File file = new File(path);
		boolean flag = false;
		try {
			file.createNewFile();
			flag = true;
			if (flag) {
				System.out.println("File is created");
			} else {
				System.out.println("File is already present");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//2nd method

		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter path including filename");
			String filenamePath = in.nextLine();
			FileOutputStream fos = new FileOutputStream(filenamePath);
			System.out.println("Enter contents");
			String content = in.nextLine();
			byte[] b = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File is created " + filenamePath);
		} catch (Exception e) {

			e.printStackTrace();
		}

		// 3rd method Java Nio lib
		try {
			Path pathLocation = Paths.get("C:\\Users\\diya-nshriyan\\Desktop\\Java\\createfileNio.txt");
			Path newFile = Files.createFile(pathLocation);
			System.out.println("new file created at " + newFile);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
