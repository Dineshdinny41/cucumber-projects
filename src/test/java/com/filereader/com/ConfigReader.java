package com.filereader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties p;
	public ConfigReader() throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactionProject\\src\\test\\java\\com\\property\\com\\ConfigurationProperties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	public String getbrowser() {
		String browser=p.getProperty("browser");
		return browser;
		
	}
	public String geturl() {
		String url=p.getProperty("url");
		return url;
	}
	public String getusername() {
		String username=p.getProperty("username");
		return username;
		
	}
	public String getpassword() {
		String password=p.getProperty("password");
		return password;
	}
}
