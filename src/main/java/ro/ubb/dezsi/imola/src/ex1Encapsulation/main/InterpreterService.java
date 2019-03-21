package ro.ubb.dezsi.imola.src.ex1Encapsulation.main;

import ro.ubb.dezsi.imola.src.ex1Encapsulation.main.Coffee;
import ro.ubb.dezsi.imola.src.ex1Encapsulation.main.FileService;

import java.util.ArrayList;
import java.util.List;

public class InterpreterService extends FileService {

	public InterpreterService(String filename) {
		super(filename);
	}
	List<Coffee> interpret(List<String> list) {
		List<Coffee> output = new ArrayList<Coffee>();
		for (String string : list) {
			String[] coffee = string.split("\\|");
			output.add(new Coffee(Double.parseDouble(coffee[0]), Integer.parseInt(coffee[1]), coffee[2], coffee.length == 4 ? coffee[3] : null ));
		}
		return output;
		
	}
}
