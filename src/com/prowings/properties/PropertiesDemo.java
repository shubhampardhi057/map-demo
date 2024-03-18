package com.prowings.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		
		
		prop.setProperty("dbusername", "abc");
		prop.setProperty("dbpwd", "abc123");
		prop.setProperty("dburl", "pqrs");
		
		
		System.out.println(prop);
		
		
		System.out.println(prop.getProperty("dbpwd"));
		
		System.out.println("============= Loading prop from file ==============");
		
		
		Properties myprop  = new Properties();
		
		myprop.load(new FileInputStream("E:\\map\\src\\abc.properties"));
		
		
		System.out.println(myprop.getProperty("dbusername"));
		System.out.println(myprop.getProperty("dbpwd"));
		System.out.println(myprop.getProperty("dbid"));
			
		System.out.println(myprop);
		
		
	}

}
