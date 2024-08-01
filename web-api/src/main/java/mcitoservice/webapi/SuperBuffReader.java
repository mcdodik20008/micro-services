package mcitoservice.webapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SuperBuffReader {

    public SuperBuffReader(FileReader fileReader) throws FileNotFoundException {
        File file = new File("file.txt");
        FileReader in = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(in);

        List<String> lines = new ArrayList<>();

    }

}
