package simpleOCR;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;

public class test {
	public static void main(String[] args) throws IOException{
	
		File imageFile = new File("C:\\Users\\Riza_MF871\\eclipse-workspace\\SimpleOCR\\images\\testdata.jpg");
		
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\Riza_MF871\\eclipse-workspace\\SimpleOCR\\tessdata");
		
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
		} catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
	}
}
