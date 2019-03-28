package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class ReadCoffeeService {

    Coffee readCoffee(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
        String line;
        int lineNr = 0;
        Coffee coffee = new Coffee();
        while ((line = reader.readLine()) != null){
            String[] tokens = line.split(",");
            switch (lineNr){
                case 0:
                    coffee.setName(tokens[0]);
                    break;
                case 1:
                    coffee.setBrand(tokens[0]);
                    break;
                case 2:
                    coffee.setType(tokens[0]);
                    break;
                case 3:
                    coffee.setOrigin(tokens[0]);
                    break;
                default:
                    break;
            }
            lineNr++;
        }
        return coffee;
    }

}
