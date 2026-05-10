package com.adnabu.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adnabu.pojo.User;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVReaderUtility {

	public static Iterator<User> readLoginCSV() {

		File file = new File(
				System.getProperty("user.dir") + File.separator + "loginData" + File.separator + "loginData.csv");
		FileReader reader = null;
		CSVReader csvReader;
		List<User> userList=null;
		User user;
		try {
			reader = new FileReader(file);
			csvReader = new CSVReader(reader);
			csvReader.readNext();
			String[] lines = csvReader.readNext();
			userList = new ArrayList<User>();
			for(String line:lines) {
				user = new User(line);
				userList.add(user);
			}
		} catch (IOException | CsvValidationException e) {
			e.printStackTrace();
		}
		return userList.iterator();
		 

	}

}
