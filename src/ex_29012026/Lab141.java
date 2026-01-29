package ex_29012026;

public class Lab141 {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[3] = 90;
        System.out.println(a[2]);//0
        System.out.println(a[3]);//90
        System.out.println(a[0]);//0
        //length->4
        //index->0,1,2,3
        //int[]a={0,0,90,0}

    }
}
