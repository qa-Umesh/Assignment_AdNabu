package com.adnabu.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adnabu.constants.Env;
import com.adnabu.pojo.Config;
import com.adnabu.pojo.Environment;
import com.adnabu.pojo.TestData;
import com.adnabu.pojo.User;
import com.google.gson.Gson;

public class JSONReaderUtility {

	public static Environment readConfigJSON(Env env) {

		File file = new File(
				System.getProperty("user.dir") + File.separator + "config" + File.separator + "config.json");
		FileReader reader = null;
		Gson gson = new Gson();
		try {
			reader = new FileReader(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Config config = gson.fromJson(reader, Config.class);
		Environment environment = config.getEnvironment().get(env.name());
		return environment;

	}

	public static Iterator<Object[]> readLoginJSON() {
		File file = new File(
				System.getProperty("user.dir") + File.separator + "loginData" + File.separator + "login.json");
		FileReader reader = null;
		Gson gson = new Gson();
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		TestData data = gson.fromJson(reader, TestData.class);
		List<Object[]> listOfUsers = new ArrayList<Object[]>();
		for (User user : data.getData()) {
			listOfUsers.add(new Object[] { user });
		}
		Iterator<Object[]> iterator = listOfUsers.iterator();
		return iterator;
	}
}
