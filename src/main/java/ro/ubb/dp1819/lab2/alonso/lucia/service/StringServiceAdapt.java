package ro.ubb.dp1819.lab2.alonso.lucia.service;

import ro.ubb.dp1819.lab1.alonso.lucia.ex11.StringService;

import java.util.List;

public class StringServiceAdapt {

    StringService st = new StringService();

    public List<String> fileToStringList(String path) {

        return st.fileToStringList(path);
    }
}
