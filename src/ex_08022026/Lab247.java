package ex_08022026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Lab247 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(null,"one");
        //ht1.put("one","one");
        HashMap h1=new HashMap();
        h1.put(null,"Sanket");

        Set<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("WaterMelons");
        //fruits.add(123);

    }
}
