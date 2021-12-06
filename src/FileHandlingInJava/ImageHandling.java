package FileHandlingInJava;

//import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

//import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) {
		

try {
	URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/V238940049_IN_PC_BAU_Edit_Creation_Laptops1x._SY304_CB667377205_.jpg");
	//BufferedImage bi = ImageIO.read(url);
	//ImageIO.write(bi,"png", new File("C:\\Users\\diya-nshriyan\\Desktop\\Java\\image.png"));
	
} catch (Exception e) {
	
	e.printStackTrace();
}
	finally {System.out.println("Test");}	
		
	}

}