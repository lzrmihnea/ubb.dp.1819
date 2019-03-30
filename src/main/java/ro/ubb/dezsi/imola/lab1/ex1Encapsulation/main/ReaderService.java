package ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderService extends FileService {

	public ReaderService(String filename) {
		super(filename);
	}
	
	public List<String> processFile() {
		List<String> list = new ArrayList<String>();
		File file = new File(super.filename);
		FileReader fr;
		try {
			fr = new FileReader(file);
			try(BufferedReader br = new BufferedReader(fr)){
				String line;
				line = br.readLine();
				while((line = br.readLine()) != null){
				    //process the line
				    list.add(line);
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
