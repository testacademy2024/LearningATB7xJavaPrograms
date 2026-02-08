package ex_08022026;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab246 {
    public static void main(String[] args) {
        Hashtable<Integer,String> htl=new Hashtable<>();

        // Map
        // null
        // Synchronised
        // Slow
        // Legacy Class

        htl.put(1, "one");
        htl.put(2, "two");
        htl.put(3, "three");

        Enumeration e=htl.keys();
        while(e.hasMoreElements()){
            System.out.println(htl.get(e.nextElement()));
        }
    }
}
