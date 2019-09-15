package assignment2.demo.api;


import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TextDataSource implements DataSource {

    private Scanner sc;
    private int lineNo = 1;
    private String[] current;


    public TextDataSource(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        sc = new Scanner(inputStream);

    }

    @Override
    public boolean hasNext() {
        return sc.hasNext();
    }

    @Override
    public Record next() {
        String[] row = sc.nextLine().split("\\s");

        Map<Object, String> map = new HashMap<>();
        for (int i = 0; i < row.length; i++) {
            map.put(i, row[i]);
        }

        return new Record(lineNo++, map);

    }
}
