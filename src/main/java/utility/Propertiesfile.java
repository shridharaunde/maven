package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
public static String getdata(String key) throws Exception {
//	
	Properties prop = new Properties();
	String path = System.getProperty("user.dir")+"\\new.properties";
	FileInputStream input = new FileInputStream(path);
	
	prop.load(input);
	String value = prop.getProperty(key);
	System.out.println(value);
//
return value;
   }
	public static void main(String[] args) throws Exception {
		

	  getdata("orange");
	getdata("url");
	getdata("fname");
	getdata("lname");
	}
	
	
}
