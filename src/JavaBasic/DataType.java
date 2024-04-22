package JavaBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataType {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\pramesh\\eclipse-workspace\\NewJavaPractice\\src\\JavaBasic\\config.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String brow =prop.getProperty("Browser");
		System.out.println(brow);
		
		if(brow.equalsIgnoreCase("chrome"))
		{
		         
		}
	}

}
