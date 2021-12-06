package FileHandlingInJava;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {
	// Print all Files and Folders in a Directory in Sorted Order
	public static void main(String[] args) {

		String path = "C:\\Users\\diya-nshriyan\\Desktop\\Java";
		File files = new File(path);
			
		File directoryFile[] = files.listFiles();
		Arrays.sort(directoryFile);
		for (File e : directoryFile) {
			if (e.isDirectory()) {
				System.out.println("Directories" + e.getName());
			} else if (e.isFile()) {
				System.out.println("Files " + e.getName());
			} else {
				System.out.println("Unknown " + e.getName());
			}
		}

	}

}
