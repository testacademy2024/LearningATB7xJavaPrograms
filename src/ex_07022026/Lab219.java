package ex_07022026;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219 {
    public static void main(String[] args) {
        String path="C://a.txt";
        File file=new File(path);
        try {
            FileReader fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FNE");
        } catch (Exception e) {
            System.out.println("E");
        }
    }
}
