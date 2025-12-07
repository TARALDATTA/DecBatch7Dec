package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties getPropertyObject() throws IOException
	{
		FileInputStream in=new FileInputStream("C:\\Users\\datta\\eclipse-workspace\\SeleniumJavaProject\\TestData.properties");
		
		Properties prop=new Properties();
		
		prop.load(in);
		
		return prop;
	}
	
	public static String getUrl() throws IOException
	{
		return getPropertyObject().getProperty("url");
	}
	
	public static String getUsername() throws IOException
	{
		return getPropertyObject().getProperty("username");
	}
	
	public static String getPassword() throws IOException
	{
		return getPropertyObject().getProperty("password");
	}
}
