package ex_07022026;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        readfile();
    }

    private static void readfile() throws FileNotFoundException {
        System.out.println("Hello Sanket");
        String path="C:\\Users\\Sanket\\Downloads\\TestMetrics (1).xlsx";
        File file=new File(path);
        FileReader fileReader=new FileReader(file);
    }
}
