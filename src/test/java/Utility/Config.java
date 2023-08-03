package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	public Properties ReadConfig() throws IOException
	{
		Properties prop = new Properties();
		String pa = "C:\\Users\\Maari\\eclipse-workspace\\C_end\\config.properties";
		//System.out.println(pa);
		//System.out.println(System.getProperty(pa));
		
		File f = new File(pa);
		System.out.println(f);
		try
		{
		FileInputStream fis =new FileInputStream(f);
		System.out.println(fis);
		prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return prop;
	}

}
