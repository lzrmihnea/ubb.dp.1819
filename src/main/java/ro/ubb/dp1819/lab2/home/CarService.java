package ro.ubb.dp1819.lab2.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    private String filename;
    private List<CarPart> parts = new ArrayList<>();

    public CarService(String filename) {
        this.filename = filename;
    }

    public void interprets(){
        List<String> lines = this.getLines();
        for (String line: lines){
            String[] args = line.split(" ");
            CarPart carPart = new CarPart.Builder()
                    .setQuantity(Integer.parseInt(args[0]))
                    .setDescription(args[1])
                    .setName(args[2])
                    .buid();
            this.parts.add(carPart);
            System.out.println(carPart);
        }
    }

    public List<String> getLines(){
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filename));
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<CarPart> getComponents() {
        return parts;
    }
}
