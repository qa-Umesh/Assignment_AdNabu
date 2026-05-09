package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.ui.constants.Env;

public class PropertiesReaderUtility {

	public static String readConfigProperties(Env env, String propertyName) {
		File file = new File(
				System.getProperty("user.dir") + File.separator + "config" + File.separator + env + ".properties");
		FileReader reader = null;
		Properties properties = new Properties();
		try {
			reader = new FileReader(file);
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties.getProperty(propertyName.toUpperCase());

	}

}
