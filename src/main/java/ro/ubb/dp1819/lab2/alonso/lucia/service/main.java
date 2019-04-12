package ro.ubb.dp1819.lab2.alonso.lucia.service;


import java.io.File;

public class main {

    public static void main(String [ ] args){

       CarCreationService ccs = new CarCreationService();

        //absPath to get the absolute path to the file
        String absPath = new File("").getAbsolutePath();
        System.out.println(ccs.createCar(absPath+"\\src\\main\\java\\ro\\ubb\\dp1819\\lab2\\alonso\\lucia\\service\\exempleCar"));
    }
}
