package barnutiu.denis.lab1.Encapsulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileService {

    private final String fileName="coffee.txt";

    public List<String> readFromFile(){
        List<String> list=new ArrayList<>();
        BufferedReader bufferedReader=null;

        try{
            bufferedReader=new BufferedReader(new FileReader(fileName));
            String line;
            while((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if(bufferedReader!=null)
                try{
                    bufferedReader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
        }

        return list;
    }
}
