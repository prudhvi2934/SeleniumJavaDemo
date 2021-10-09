package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getProperties();
			setProperties();
			getProperties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getProperties() throws Exception {
		
		
		InputStream input = new FileInputStream("E:\\Eclipse Workspace\\SeleniumMavenProject\\src\\main\\java\\config\\config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		
	}
	
	public static void setProperties() throws Exception {
		OutputStream output = new FileOutputStream("E:\\Eclipse Workspace\\SeleniumMavenProject\\src\\main\\java\\config\\config.properties");
		prop.setProperty("browser", "Firefox");
		prop.store(output, "comments");
	}
}
