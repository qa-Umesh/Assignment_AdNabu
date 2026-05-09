package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.ui.constants.Env;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;
import com.ui.pojo.TestData;
import com.ui.pojo.User;

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
