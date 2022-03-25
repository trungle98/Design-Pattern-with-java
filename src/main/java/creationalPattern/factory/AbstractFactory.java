package main.java.creationalPattern.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AbstractFactory {
	
	public static AbstractRepository getRepository() {
		
		Properties prop = new Properties();
		
		InputStream inputStream= null;
		try {
			inputStream = new FileInputStream("resources/application.properties");
			prop.load(inputStream);
			String mailServer = prop.getProperty("mailserver");
			switch (mailServer) {
			case "gmail": {
				return new SendGmail();
			}
			case "hotmail": {
				return new SendHotMail();
			}
			case "yahoomail": {
				return new SendYahooMail();
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + mailServer);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
}
