package ro.ubb.dezsi.imola.lab2.exercises.adapter;

import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.InterpreterException;
import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.ReaderService;
import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.component.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarReaderAdapter {

    private ReaderService reader;

    public CarReaderAdapter(String filename){
        // we wrap this reader
        reader = new ReaderService(filename);

    }
    public List<String> processFile(){
        // we adapt the processFile method
        List<String> lines = reader.processFile();
        if (lines.size() == 0)
            return Collections.emptyList();
        return Arrays.asList(lines.get(0).split("\\|"));
    }


}