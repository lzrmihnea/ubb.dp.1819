package ro.ubb.dp1819.lab2.exercises.adapter;

import ro.ubb.dp1819.lab2.exercises.component.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCarParts {

    private List<String> components;
    private List<String> CHASSISTYPE = Arrays.asList("titanium", "aluminium", "vibranium", "adamantium");
    private List<String> ENGINETYPE = Arrays.asList("electric", "diesel", "gpl");
    private List<String> PAINT = Arrays.asList("red", "white", "black", "blue", "pink", "green", "yellow");

    public ReadCarParts() {this.components = new ArrayList<>();}

    public void read(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            if (str.contains("summer") || str.contains("winter"))
                components.add(str);
            if (CHASSISTYPE.contains(str))
                components.add(str);
            if (ENGINETYPE.contains(str))
                components.add(str);
            if (PAINT.contains(str))
                components.add(str);
        }
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }
}
