package ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main;

import java.util.ArrayList;
import java.util.List;

public class InterpreterService {

	public List<Coffee> interpret(List<String> list) throws InterpreterException {
		List<Coffee> output = new ArrayList<Coffee>();
		try {
			for (String string : list) {
				String[] coffee = string.split("\\|");
				output.add(new Coffee(Double.parseDouble(coffee[0]), Integer.parseInt(coffee[1]), coffee[2], coffee.length == 4 ? coffee[3] : null));
			}
		}catch (Exception e){
			throw new InterpreterException("Input type does not correspond to the fields required by the Coffee class");
		}
		return output;
	}
}
