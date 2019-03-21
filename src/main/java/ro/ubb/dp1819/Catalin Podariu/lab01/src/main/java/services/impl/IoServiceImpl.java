package services.impl;

import services.IOService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IoServiceImpl implements IOService {
	private static IOService ioService = null;

	@Override
	public List<String> readFile(String fileName) throws FileNotFoundException {
		String content = "";

		Scanner scanner = new Scanner(new File(fileName));
		content = scanner.useDelimiter("\\A").next();
		scanner.close();

		return Arrays.asList(content.split("\r\n"));
	}

	public static IOService getInstance() {
		if (ioService == null)
			ioService = new IoServiceImpl();
		return ioService;
	}
}
