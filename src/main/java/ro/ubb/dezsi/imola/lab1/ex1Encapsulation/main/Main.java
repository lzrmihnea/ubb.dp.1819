package ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main;

import java.util.List;

public class Main {
	
public static void main(String[] args) {
	String filename = "src/input.txt";
	ReaderService readServ = new ReaderService(filename);
	InterpreterService interServ = new InterpreterService();
	List<String> list = readServ.processFile();
	try {
		List<Coffee> coffeeList = interServ.interpret(list);
		for (Coffee c: coffeeList) {
			System.out.print(c);
		}
	}catch (InterpreterException e) {
		System.out.print(e.getMessage());
	}

}
}
