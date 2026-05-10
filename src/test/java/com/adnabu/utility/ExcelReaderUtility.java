package com.adnabu.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.adnabu.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> loginExcelData() {
		File file = new File(
				System.getProperty("user.dir") + File.separator + "loginData" + File.separator + "loginData.xlsx");
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		Row row;
		Cell password;
		User user;
		List<User> userList = null;
		try {
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet("sheet1");
			Iterator<Row> rows = sheet.iterator();
			rows.next();
			userList = new ArrayList<User>();
			while (rows.hasNext()) {
				row = rows.next();
				password = row.getCell(0);
				user = new User(password.toString());
				userList.add(user);
			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userList.iterator();

	}

}
