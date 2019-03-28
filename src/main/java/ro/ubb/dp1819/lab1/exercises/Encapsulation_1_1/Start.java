package ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1;

import ro.ubb.dp1819.lab2.exercises.adapter.ReadFileAdapter;
import java.io.IOException;

public class Start {
    public static void main(String[] args){
        //ReadFileServiceImpl readFileServiceImpl = new ReadFileServiceImpl();
        //MakeCoffeeService makeCoffeeService = new MakeCoffeeService();
        ReadFileServiceImpl readFileServiceImpl = new ReadFileAdapter();

        try {
            readFileServiceImpl.readFile("D:\\Faculta\\An III\\Semestru_2\\Design Patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab2\\exercises\\adapter\\input.txt");
            readFileServiceImpl.getLines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //makeCoffeeService.make(readFileServiceImpl.getLines());
    }
}
