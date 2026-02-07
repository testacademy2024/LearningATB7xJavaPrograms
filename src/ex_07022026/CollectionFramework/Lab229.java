package ex_07022026.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab229 {
    public static void main(String[] args) {
//        int [] a=new int[5];
//        a[1]=1;
//        a[2]=2;
//        a[3]=3;
//        a[4]=4;
//        a[5]=5;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]==4)
//            {
//                System.out.println("Found 4");
//            }
//
//        }

        List arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.contains(4));
    }
}
