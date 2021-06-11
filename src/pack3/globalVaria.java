package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class globalVaria {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/shweta/eclipse-workspace/Testng/src/pack3/globalVarables.properties");
	    prop.load(fis);
	    System.out.println(prop.getProperty("browser"));
	}
	

}
