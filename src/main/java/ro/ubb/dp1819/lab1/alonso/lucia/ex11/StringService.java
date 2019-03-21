package ro.ubb.dp1819.lab1.alonso.lucia.ex11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringService {

    private static final String FILENAME = "C:\\Users\\PortatilPapa2\\Documents\\L3 S6 CLUJ\\CLUJ_DesignPatterns\\ubb.dp.1819-master\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\lucia\\alonso\\ex11\\exemple";

    public static List<String> fileToStringList() {

        List<String> listeString = new ArrayList<>();

        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                listeString.add(sCurrentLine);
                //System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        return listeString;

    }
}
