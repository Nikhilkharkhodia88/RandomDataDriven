package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public String getPropertyValue(String path, String key) {
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value = prop.getProperty(key);
//System.out.println("Getting from given property file: "+value);
		return value;
	}

}
