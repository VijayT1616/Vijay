package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		// raed the data frome property file 
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String username = prop.getProperty("password");
		System.out.println(username);
	}

}
